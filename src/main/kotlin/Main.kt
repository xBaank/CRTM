import java.net.URI

fun main(args: Array<String>) {
    val lineStream =
        URI("https://www.crtm.es/widgets/api/GetLinesInformation.php?activeItinerary=1&codLine=8__450___").toURL()
            .openStream()

    val line = JsonReader.read(lineStream).getPropertyOrNull("lines")?.getPropertyOrNull("LineInformation")


    val codMode = line?.getStringOrNull("codMode")
        ?: throw Exception("codMode not found")

    val codLine = line.getStringOrNull("codLine")
        ?: throw Exception("codLine not found")

    val codeItinerary = line.itinerary
        ?.getStringOrNull("codeItinerary")
        ?: throw Exception("codeItinerary not found")

    val codStop = line.itinerary
        ?.getPropertyOrNull("Stops")
        ?.getArrayOrNull("StopInformation")?.getOrNull(0)?.getStringOrNull("codStop")
        ?: throw Exception("codStop not found")

    val direction = line.itinerary
        ?.getStringOrNull("direction")
        ?: throw Exception("direction not found")

    val infoStream =
        URI("https://www.crtm.es/widgets/api/GetLineLocation.php?mode=$codMode&codItinerary=$codeItinerary&codLine=$codLine&codStop=$codStop&direction=$direction").toURL()
            .openStream()

    val info = JsonReader.read(infoStream)
    println(info.serializePretty())
}

val JsonNode.itinerary: JsonNode?
    get() = getPropertyOrNull("itinerary")?.getArrayOrNull("Itinerary")?.getOrNull(0)