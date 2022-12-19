package stops.extractors

import JsonNode
import getArrayOrNull
import getIntOrNull
import getPropertyOrNull
import getStringOrNull
import lines.CodLine
import lines.LineInfo
import modes.CodMode
import stops.CodStop
import stops.StopTime
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

internal class StopsTimesExtractor(json: JsonNode) {
    val stopTimesJson = json.getPropertyOrNull("stopTimes")

    fun getStopTimes(): List<StopTime> = stopTimesJson
        ?.getPropertyOrNull("times")
        ?.getArrayOrNull("Time")
        ?.mapNotNull(::getStopTimeOrNull)
        ?.toList()
        ?: emptyList()

    private fun getStopTimeOrNull(node: JsonNode): StopTime? {
        val line = node.getPropertyOrNull("line") ?: return null
        return StopTime(
            codStop = CodStop(stopTimesJson?.getPropertyOrNull("stop")?.getStringOrNull("codStop") ?: return null),
            line = LineInfo(
                CodLine(line.getStringOrNull("codLine") ?: return null),
                line.getStringOrNull("description") ?: return null,
                CodMode(line.getStringOrNull("codMode")?.toIntOrNull() ?: return null)
            ),
            time = node.getStringOrNull("time")?.let(::getLocalDateTimeOrNull) ?: return null,
            direction = node.getIntOrNull("direction") ?: return null
        )
    }

    private fun getLocalDateTimeOrNull(value: String): LocalDateTime? =
        runCatching { LocalDateTime.parse(value, DateTimeFormatter.ISO_DATE_TIME) }.getOrNull()
}

