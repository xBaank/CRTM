package modes

typealias Modes = List<Mode>

data class Mode(val codMode: CodMode, val name: String)

@JvmInline
value class CodMode(val value: Int)