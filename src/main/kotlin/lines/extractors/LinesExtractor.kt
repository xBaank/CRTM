package lines.extractors

import JsonNode
import getArrayOrNull
import getDoubleOrNull
import getIntOrNull
import getPropertyOrNull
import getStringOrNull
import lines.*
import modes.CodMode
import stops.extractors.StopExtractor

internal class LinesExtractor(val json: JsonNode) {
    fun getLineInfoOrNull(): LineInfoItinerary? {
        val lineInfoJson = json.getPropertyOrNull("lines")?.getPropertyOrNull("LineInformation")

        val lineInfo = LineInfo(
            codLine = lineInfoJson?.getStringOrNull("codLine")?.let { CodLine(it) } ?: return null,
            description = lineInfoJson.getStringOrNull("description") ?: return null,
            codMode = lineInfoJson.getStringOrNull("codMode")?.toIntOrNull()?.let { CodMode(it) } ?: return null
        )

        val itineraryJson = lineInfoJson.getPropertyOrNull("itinerary")?.getArrayOrNull("Itinerary") ?: return null

        val itineraries = itineraryJson.mapNotNull {
            val stopExtractor = StopExtractor(it)
            Itinerary(
                codItinerary = it.getStringOrNull("codItinerary")?.let { CodItinerary(it) } ?: return@mapNotNull null,
                name = it.getStringOrNull("name") ?: return@mapNotNull null,
                direction = it.getIntOrNull("direction") ?: return@mapNotNull null,
                stops = stopExtractor.getStopsInfo()
            )
        }
        return LineInfoItinerary(lineInfo, itineraries)
    }

    fun getLineLocations(): List<LineLocation> {
        val lineLocationJson = json.getPropertyOrNull("vehiclesLocation")?.getArrayOrNull("VehicleLocation")
        return lineLocationJson?.mapNotNull { lineLocation ->
            val coordinates = lineLocation.getPropertyOrNull("coordinates")
            val line = lineLocation.getPropertyOrNull("line")

            LineLocation(

                codLine = line?.getStringOrNull("codLine")?.let { CodLine(it) }
                    ?: return@mapNotNull null,

                codVehicle = lineLocation.getStringOrNull("codVehicle")?.let { CodVehicle(it) }
                    ?: return@mapNotNull null,

                codMode = line.getStringOrNull("codMode")?.toIntOrNull()?.let { CodMode(it) }
                    ?: return@mapNotNull null,

                direction = lineLocation.getIntOrNull("direction")
                    ?: return@mapNotNull null,

                coordinates = Coordinates(
                    latitude = coordinates?.getDoubleOrNull("latitude") ?: return@mapNotNull null,
                    longitude = coordinates.getDoubleOrNull("longitude") ?: return@mapNotNull null
                ),

                service = lineLocation.getStringOrNull("service") ?: return@mapNotNull null
            )

        } ?: emptyList()
    }
}