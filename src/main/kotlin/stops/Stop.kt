package stops

import lines.CodLine

data class Stop(
    val latitude: Double,
    val longitude: Double,
    val lines: List<CodLine>,
    val codStop: CodStop,
    val name: String
)

