package stops.extractors

import JsonNode
import arrow.core.Either
import arrow.core.continuations.either
import arrow.core.left
import arrow.core.right
import arrow.core.rightIfNotNull
import exceptions.CRTMException
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

    suspend fun getStopTimes(): Either<CRTMException, List<StopTime>> = either {
        stopTimesJson?.getPropertyOrNull("times")
            .rightIfNotNull { CRTMException("Cant find stop times") }
            .bind()
            .getArrayOrNull("Time")
            .rightIfNotNull { CRTMException("Cant find stop Time") }
            .bind()
            .map(::getStopTime)
            .map { it.bind() }
            .toList()
    }

    private fun getStopTime(node: JsonNode): Either<CRTMException, StopTime> {
        val line = node.getPropertyOrNull("line") ?: return CRTMException("Line not found").left()
        return StopTime(
            codStop = CodStop(stopTimesJson?.getPropertyOrNull("stop")?.getStringOrNull("codStop") ?: return CRTMException("Error parsing stop code").left()),
            line = LineInfo(
                CodLine(line.getStringOrNull("codLine") ?: return CRTMException("Error parsing line code").left()),
                line.getStringOrNull("description") ?: return CRTMException("Error parsing line description").left(),
                CodMode(line.getStringOrNull("codMode")?.toIntOrNull() ?: return CRTMException("Error parsing line mode").left())
            ),
            time = node.getStringOrNull("time")?.let(::getLocalDateTimeOrNull) ?: return CRTMException("Error parsing time").left(),
            direction = node.getIntOrNull("direction") ?: return CRTMException("Error parsing direction").left()
        ).right()
    }

    private fun getLocalDateTimeOrNull(value: String): LocalDateTime? =
        runCatching { LocalDateTime.parse(value, DateTimeFormatter.ISO_DATE_TIME) }.getOrNull()
}

