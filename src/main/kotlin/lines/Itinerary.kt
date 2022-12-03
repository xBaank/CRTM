package lines

import stops.Stop

data class Itinerary(
    val codItinerary: CodItinerary,
    val name: String,
    val direction: Int,
    val stops: List<Stop>
)

@JvmInline
value class CodItinerary(val value: String)

