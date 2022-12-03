package stops

import lines.LineInfo
import java.time.LocalDateTime

data class StopTime(
    val codStop: CodStop,
    val line: LineInfo,
    val time: LocalDateTime,
    val direction: Int
)