import java.net.URI

fun main(args: Array<String>) {
    val lineStream =
        URI("https://www.crtm.es/widgets/api/GetLinesInformation.php?activeItinerary=1&codLine=8__450___").toURL()
            .openStream()

    val line = JsonReader.read(lineStream).getPropertyOrNull("lines")?.getPropertyOrNull("LineInformation")

    println(line?.serializePretty())


    val codMode = line?.getStringOrNull("codMode")
        ?: throw Exception("codMode not found")

    val codLine = line.getStringOrNull("codLine")
        ?: throw Exception("codLine not found")

    val codeItinerary = line.itinerary
        ?.getStringOrNull("codItinerary")
        ?: throw Exception("codeItinerary not found")

    val codStop = line.itinerary?.stops
        ?.firstOrNull { it.getStringOrNull("address")?.contains("UNIVERSIDAD") == true }
        ?.getStringOrNull("codStop")
        ?: throw Exception("codStop not found")

    val direction = line.itinerary
        ?.getNumberOrNull("direction")
        ?: throw Exception("direction not found")

    val infoStream =
        URI("https://www.crtm.es/widgets/api/GetLineLocation.php?mode=$codMode&codItinerary=$codeItinerary&codLine=$codLine&codStop=$codStop&direction=$direction").toURL()
            .openStream()

    val stopType = 3

    val orderBy = 2

    val stopTimes =
        URI("https://www.crtm.es/widgets/api/GetStopsTimes.php?codStop=$codStop&type=$stopType&orderBy=$orderBy&stopTimesByIti=$codeItinerary").toURL()
            .openStream()

    val info = JsonReader.read(infoStream)
    val stopTimesJson = JsonReader.read(stopTimes)
    println(info.serializePretty())
    println()
    println(stopTimesJson.serializePretty())
}

val JsonNode.itinerary: JsonNode?
    get() = getPropertyOrNull("itinerary")?.getArrayOrNull("Itinerary")?.getOrNull(1)

val JsonNode.stops: JsonArray?
    get() = getPropertyOrNull("stops")?.getArrayOrNull("StopInformation")