package stops

import lines.LineInfo

data class StopTime(
    val line: List<LineInfo>,
    val time: List<Time>
)