package stops.extractors

import JsonNode
import getArrayOrNull
import getIntOrNull
import getPropertyOrNull
import getStringOrNull
import lines.CodLine
import lines.LineInfo
import modes.CodMode
import stops.StopTime
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class StopsTimesExtractor(val json: JsonNode) {
    fun getStopTimes(): List<StopTime> = json.getPropertyOrNull("stopTimes")
        ?.getPropertyOrNull("times")
        ?.getArrayOrNull("Time")
        ?.mapNotNull {
            it.stopTimeOrNull()
        }?.toList() ?: emptyList()

    private fun JsonNode.stopTimeOrNull(): StopTime? {
        val line = getPropertyOrNull("line") ?: return null
        return StopTime(
            line = LineInfo(
                CodLine(line.getStringOrNull("codLine") ?: return null),
                line.getStringOrNull("shortDescription") ?: return null,
                line.getStringOrNull("description") ?: return null,
                CodMode(line.getStringOrNull("codMode")?.toIntOrNull() ?: return null)
            ),
            time = getStringOrNull("time")?.toLocalDateTimeOrNull() ?: return null,
            direction = getIntOrNull("direction") ?: return null
        )
    }
}

private fun String?.toLocalDateTimeOrNull(): LocalDateTime? = LocalDateTime.parse(this, DateTimeFormatter.ISO_DATE_TIME)
