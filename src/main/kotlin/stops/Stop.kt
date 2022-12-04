package stops

import lines.CodLine
import lines.Coordinates

data class Stop(
    val coordinates: Coordinates,
    val lines: List<CodLine>,
    val codStop: CodStop,
    val name: String
)

