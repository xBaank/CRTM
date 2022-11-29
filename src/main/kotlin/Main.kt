import java.net.URI

fun main(args: Array<String>) {
    val lineStream =
        URI("https://www.crtm.es/widgets/api/GetLinesInformation.php?activeItinerary=1&codLine=8__450___").toURL()
            .openStream()

    val line = JsonReader.read(lineStream).getPropertyOrNull("lines")?.getPropertyOrNull("LineInformation")


    val codMode = line?.getStringOrNull("codMode")
        ?: throw Exception("codMode not found")

    val codLine = line.getPropertyOrNull("lines")
        ?.getPropertyOrNull("LineInformation")
        ?.getStringOrNull("codLine")
        ?: throw Exception("codLine not found")

    val codeItinerary = line.getPropertyOrNull("itinerary")
        ?.getArrayOrNull("Itinerary")
        ?.getOrNull(0)
        ?.getStringOrNull("codeItinerary")
        ?: throw Exception("codeItinerary not found")

    val codStop = line.getPropertyOrNull("itinerary")
        ?.getArrayOrNull("Itinerary")
        ?.getOrNull(0)
        ?.getPropertyOrNull("Stops")
        ?.getArrayOrNull("StopInformation")?.getOrNull(0)?.getStringOrNull("codStop")
        ?: throw Exception("codStop not found")

    val direction = line.getPropertyOrNull("itinerary")
        ?.getArrayOrNull("Itinerary")
        ?.getOrNull(0)
        ?.getStringOrNull("direction")
        ?: throw Exception("direction not found")

    val infoStream =
        URI("https://www.crtm.es/widgets/api/GetLineLocation.php?mode=$codMode&codItinerary=$codeItinerary&codLine=$codLine&codStop=$codStop&direction=$direction").toURL()
            .openStream()

    val info = JsonReader.read(infoStream)
    println(info.serializePretty())
}