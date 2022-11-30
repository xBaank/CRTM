import java.net.URI

fun main(args: Array<String>) {
    val lineStream =
        URI("$CRTM_URL/GetLinesInformation.php?activeItinerary=1&codLine=8__450___").toURL()
            .openStream()

    val line = JsonReader.read(lineStream).getPropertyOrNull("lines")?.getPropertyOrNull("LineInformation")

    println(line?.serializePretty())


    val codMode = line?.getStringOrNull("codMode")
        ?: throw Exception("codMode not found")

    val codLine = line.getStringOrNull("codLine")
        ?: throw Exception("codLine not found")

    val codeItinerary = line.getItineraryOrNull()
        ?.getStringOrNull("codItinerary")
        ?: throw Exception("codeItinerary not found")

    val codStop = line.getItineraryOrNull()
        ?.getStopsOrNull()
        ?.firstOrNull { it.getStringOrNull("address")?.contains("UNIVERSIDAD") == true }
        ?.getStringOrNull("codStop")
        ?: throw Exception("codStop not found")

    val direction = line.getItineraryOrNull()
        ?.getNumberOrNull("direction")
        ?: throw Exception("direction not found")

    val infoStream =
        URI("$CRTM_URL/GetLineLocation.php?mode=$codMode&codItinerary=$codeItinerary&codLine=$codLine&codStop=$codStop&direction=$direction").toURL()
            .openStream()

    val stopType = 3

    val orderBy = 2

    val stopTimes =
        URI("$CRTM_URL/GetStopsTimes.php?codStop=$codStop&type=$stopType&orderBy=$orderBy&stopTimesByIti=$codeItinerary").toURL()
            .openStream()

    val info = JsonReader.read(infoStream)
    val stopTimesJson = JsonReader.read(stopTimes)
    println(info.serializePretty())
    println()
    println(stopTimesJson.serializePretty())
}

private fun JsonNode.getItineraryOrNull() = getPropertyOrNull("itinerary")?.getArrayOrNull("Itinerary")?.getOrNull(1)

private fun JsonNode.getStopsOrNull() = getPropertyOrNull("stops")?.getArrayOrNull("StopInformation")