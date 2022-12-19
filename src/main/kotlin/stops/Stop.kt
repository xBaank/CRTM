package stops

import lines.CodLine
import lines.Coordinate

data class Stop(
    val coordinates: Coordinate,
    val lines: List<CodLine>,
    val codStop: CodStop,
    val name: String
)

