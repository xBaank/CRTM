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
    fun getStopsInfo(): List<Stop> = getStopOrNull()?.toArrayOrNull()?.mapNotNull {
        it.stopInfoOrNull()
    }?.toList() ?: emptyList()

    fun getStopInfoOrNull(): Stop? = getStopOrNull()?.stopInfoOrNull()

    private fun getStopOrNull() = jsonNode.getPropertyOrNull("stops")?.getPropertyOrNull("Stop")
        ?: jsonNode.getPropertyOrNull("stops")?.getPropertyOrNull("StopInformation")

    private fun JsonNode.stopInfoOrNull(): Stop? {
        return Stop(
            codStop = CodStop(getStringOrNull("codStop") ?: return null),
            name = getStringOrNull("name") ?: return null,
            coordinates = Coordinate(
                latitude = getPropertyOrNull("coordinates")?.getDoubleOrNull("latitude") ?: return null,
                longitude = getPropertyOrNull("coordinates")?.getDoubleOrNull("longitude") ?: return null,
            ),
            lines = getLinesOrNull()?.mapNotNull { it.toStringOrNull() }?.map { CodLine(it) }?.toList() ?: return null
        )
    }

    private fun JsonNode.getLinesOrNull() = getPropertyOrNull("codLines")
        ?.getArrayOrNull("Line")
        ?: getPropertyOrNull("lines")
            ?.getPropertyOrNull("Line")
            ?.getPropertyOrNull("codLine")
            ?.inList()
        ?: getStopOrNull()?.getPropertyOrNull("codLines")
            ?.getStringOrNull("Line")
            ?.toJson()
            ?.inList()
}