package stops.extractors

import JsonNode
import arrow.core.Either
import arrow.core.continuations.either
import arrow.core.left
import arrow.core.leftIfNull
import arrow.core.right
import exceptions.CRTMException
import extensions.inList
import getArrayOrNull
import getDoubleOrNull
import getPropertyOrNull
import getStringOrNull
import lines.CodLine
import lines.Coordinate
import stops.CodStop
import stops.Stop
import toArrayOrNull
import toJson
import toStringOrNull

internal class StopExtractor(private val jsonNode: JsonNode) {
    suspend fun getStopsInfo(): Either<CRTMException,List<Stop>> = either {
        getStopOrNull()
            ?.toArrayOrNull()
            ?.mapNotNull(::stopInfoOrNull)
            ?.map { it.bind() }
            ?.toList()
    }.leftIfNull { CRTMException("Cant find stops info") }

    suspend fun getStopInfo(): Either<CRTMException,Stop> = either {
        getStopOrNull()
            ?.let(::stopInfoOrNull)
            ?.bind()
    }.leftIfNull { CRTMException("Cant find stop info") }

    private fun getStopOrNull() = jsonNode.getPropertyOrNull("stops")
        ?.getPropertyOrNull("Stop")
        ?:
        jsonNode.getPropertyOrNull("stops")
        ?.getPropertyOrNull("StopInformation")

    private fun stopInfoOrNull(node : JsonNode): Either<CRTMException,Stop> {
        return Stop(
            codStop = CodStop(node.getStringOrNull("codStop") ?: return CRTMException("Error parsing stop code").left()),
            name = node.getStringOrNull("name") ?: return CRTMException("Error parsing stop name").left(),
            coordinates = Coordinate(
                latitude = node.getPropertyOrNull("coordinates")?.getDoubleOrNull("latitude") ?: return CRTMException("Error parsing latitude").left(),
                longitude = node.getPropertyOrNull("coordinates")?.getDoubleOrNull("longitude") ?: return CRTMException("Error parsing longitude").left(),
            ),
            lines = node.let(::getLinesOrNull)?.mapNotNull { it.toStringOrNull() }?.map { CodLine(it) }?.toList() ?: return CRTMException("Error parsing lines").left()
        ).right()
    }

    private fun getLinesOrNull(node : JsonNode): List<JsonNode>? = node.getPropertyOrNull("codLines")
        ?.getArrayOrNull("Line")
        ?:
        node.getPropertyOrNull("lines")
        ?.getPropertyOrNull("Line")
        ?.getPropertyOrNull("codLine")
        ?.inList()
        ?:
        node.getPropertyOrNull("codLines")
        ?.getStringOrNull("Line")
        ?.toJson()
        ?.inList()
}