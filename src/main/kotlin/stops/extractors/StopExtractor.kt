package stops.extractors

import JsonNode
import extensions.inList
import getArrayOrNull
import getPropertyOrNull
import getStringOrNull
import lines.CodLine
import stops.CodStop
import stops.Stop
import toArrayOrNull
import toDoubleOrNull
import toJson
import toStringOrNull

class StopExtractor(private val jsonNode: JsonNode) {
    fun getStopsInfo(): List<Stop> = getStopOrNull()?.toArrayOrNull()?.mapNotNull {
        it.stopInfoOrNull()
    }?.toList() ?: emptyList()

    fun getStopInfoOrNull(): Stop? = getStopOrNull()?.stopInfoOrNull()

    private fun getStopOrNull() = jsonNode.getPropertyOrNull("stops")?.getPropertyOrNull("Stop")

    private fun JsonNode.stopInfoOrNull(): Stop? {
        return Stop(
            codStop = CodStop(getStringOrNull("codStop") ?: return null),
            name = getStringOrNull("name") ?: return null,
            latitude = getPropertyOrNull("coordinates")?.getPropertyOrNull("latitude")
                ?.toDoubleOrNull()
                ?: return null,
            longitude = getPropertyOrNull("coordinates")?.getPropertyOrNull("longitude")
                ?.toDoubleOrNull()
                ?: return null,
            lines = getLinesOrNull()?.mapNotNull { it.toStringOrNull() }?.map { CodLine(it) }?.toList()
                ?: return null
        )
    }

    private fun JsonNode.getLinesOrNull() = getPropertyOrNull("codLines")
        ?.getArrayOrNull("Line")
        ?: getStopOrNull()?.getPropertyOrNull("codLines")
            ?.getStringOrNull("Line")
            ?.toJson()
            ?.inList()
}