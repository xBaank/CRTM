package stops

import lines.CodLine

data class Stop(
    val latitude: Double,
    val longitude: Double,
    val lines: List<CodLine>,
    val codStop: CodStop,
    val name: String
)

@JvmInline
value class CodStop(val value: String) {
    init {
        require(value.split("_").all { it.toIntOrNull() != null }) { "Codigo invalido" }
    }
}