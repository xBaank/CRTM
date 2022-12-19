package stops.extractors

import JsonNode
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
    fun getStopsInfo(): List<Stop> = getStopOrNull()
        ?.toArrayOrNull()
        ?.mapNotNull(::stopInfoOrNull)
        ?.toList()
        ?:
        emptyList()

    fun getStopInfoOrNull(): Stop? = getStopOrNull()
        ?.let(::stopInfoOrNull)

    private fun getStopOrNull() = jsonNode.getPropertyOrNull("stops")
        ?.getPropertyOrNull("Stop")
        ?:
        jsonNode.getPropertyOrNull("stops")
        ?.getPropertyOrNull("StopInformation")

    private fun stopInfoOrNull(node : JsonNode): Stop? {
        return Stop(
            codStop = CodStop(node.getStringOrNull("codStop") ?: return null),
            name = node.getStringOrNull("name") ?: return null,
            coordinates = Coordinate(
                latitude = node.getPropertyOrNull("coordinates")?.getDoubleOrNull("latitude") ?: return null,
                longitude = node.getPropertyOrNull("coordinates")?.getDoubleOrNull("longitude") ?: return null,
            ),
            lines = node.let(::getLinesOrNull)?.mapNotNull { it.toStringOrNull() }?.map { CodLine(it) }?.toList() ?: return null
        )
    }

    private fun getLinesOrNull(node : JsonNode) = node.getPropertyOrNull("codLines")
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