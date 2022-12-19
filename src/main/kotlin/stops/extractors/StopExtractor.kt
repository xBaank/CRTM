package stops.extractors

import JsonNode
import extensions.inList
import getArrayOrNull
import getDoubleOrNull
import getPropertyOrNull
import getStringOrNull
import lines.CodLine
import lines.Coordinates
import stops.CodStop
import stops.Stop
import toArrayOrNull
import toJson
import toStringOrNull

internal class StopExtractor(private val jsonNode: JsonNode) {
    fun getStopsInfo(): List<Stop> = getStopOrNull(jsonNode)
        ?.toArrayOrNull()
        ?.mapNotNull(::getStopInfoOrNull)
        ?.toList()
        ?: emptyList()

    fun getStopInfoOrNull(): Stop? = getStopOrNull(jsonNode)
        ?.let(::getStopInfoOrNull)

    private fun getStopOrNull(node : JsonNode) = node.getPropertyOrNull("stops")
        ?.getPropertyOrNull("Stop")
        ?:
        node.getPropertyOrNull("stops")
        ?.getPropertyOrNull("StopInformation")

    private fun getStopInfoOrNull(node: JsonNode): Stop? {
        return Stop(
            codStop = CodStop(node.getStringOrNull("codStop") ?: return null),
            name = node.getStringOrNull("name") ?: return null,
            coordinates = Coordinates(
                latitude = node.getPropertyOrNull("coordinates")?.getDoubleOrNull("latitude") ?: return null,
                longitude = node.getPropertyOrNull("coordinates")?.getDoubleOrNull("longitude") ?: return null,
            ),
            lines = node.let(::getLinesOrNull) ?: return null
        )
    }

    private fun getLinesOrNull(node : JsonNode) = run { node.getPropertyOrNull("codLines")
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
    }?.mapNotNull { it.toStringOrNull() }?.map { CodLine(it) }?.toList()
}