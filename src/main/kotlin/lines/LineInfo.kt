package lines

import modes.CodMode

data class LineInfo(
    val codLine: CodLine,
    val line: String,
    val description: String,
    val codMode: CodMode
)

@JvmInline
value class CodLine(val value: String) {

}