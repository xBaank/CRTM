package stops

data class StopInfo(
    val latitude: Double,
    val longitude: Double,
    val lines: List<String>,
    val codStop: String,
    val name: String
)