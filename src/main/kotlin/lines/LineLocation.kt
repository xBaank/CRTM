package lines

import modes.CodMode

data class LineLocation(
    val codVehicle: CodVehicle,
    val codLine: CodLine,
    val codMode: CodMode,
    val direction: Int,
    val coordinates: Coordinates,
    val service: String,
)

@JvmInline
value class CodVehicle(val value: String)

data class Coordinates(
    val latitude: Double,
    val longitude: Double
)