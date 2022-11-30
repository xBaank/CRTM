package stops

import JsonNode
import extensions.inList
import getArrayOrNull
import getPropertyOrNull
import getStringOrNull
import toArrayOrNull
import toDoubleOrNull
import toJson
import toStringOrNull

class StopExtractor(val jsonNode: JsonNode) {
    fun getStopsInfo(): List<StopInfo> = getStopOrNull()?.toArrayOrNull()?.map {
        it.StopInfoOrNull()
    }?.filterNotNull()?.toList() ?: emptyList()

    fun getStopInfoOrNull(): StopInfo? = getStopOrNull()?.StopInfoOrNull()

    private fun getStopOrNull() = jsonNode.getPropertyOrNull("stops")?.getPropertyOrNull("Stop")
    
    private fun JsonNode.StopInfoOrNull(): StopInfo? {
        return StopInfo(
            codStop = getStringOrNull("codStop") ?: return null,
            name = getStringOrNull("name") ?: return null,
            latitude = getPropertyOrNull("coordinates")?.getPropertyOrNull("latitude")
                ?.toDoubleOrNull()
                ?: return null,
            longitude = getPropertyOrNull("coordinates")?.getPropertyOrNull("longitude")
                ?.toDoubleOrNull()
                ?: return null,
            lines = getLinesOrNull()?.map { it.toStringOrNull() }?.requireNoNulls()?.toList()
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