package lines.extractors

import JsonNode
import arrow.core.Either
import arrow.core.getOrHandle
import arrow.core.left
import arrow.core.right
import exceptions.CRTMException
import getArrayOrNull
import getDoubleOrNull
import getIntOrNull
import getPropertyOrNull
import getStringOrNull
import lines.*
import modes.CodMode
import stops.extractors.StopExtractor

internal class LinesExtractor(val json: JsonNode) {
    suspend fun getLineInfo(): Either<CRTMException, LineInfoItinerary> {
        val lineInfoJson = json.getPropertyOrNull("lines")?.getPropertyOrNull("LineInformation") ?: return CRTMException("Error parsing line info").left()

        val lineInfo = LineInfo(
            codLine = lineInfoJson.getStringOrNull("codLine")?.let(::CodLine) ?: return CRTMException("Error parsing line code").left(),
            description = lineInfoJson.getStringOrNull("description") ?: return CRTMException("Error parsing line description").left(),
            codMode = lineInfoJson.getStringOrNull("codMode")?.toIntOrNull()?.let { CodMode(it) } ?: return CRTMException("Error parsing line mode").left()
        )

        val itineraryJson = lineInfoJson.getPropertyOrNull("itinerary")?.getArrayOrNull("Itinerary") ?: return CRTMException("Error parsing itinerary").left()

        val itineraries = itineraryJson.map {
            val stopExtractor = StopExtractor(it)
            Itinerary(
                codItinerary = it.getStringOrNull("codItinerary")?.let { CodItinerary(it) } ?: return CRTMException("Error parsing itinerary code").left(),
                name = it.getStringOrNull("name") ?: return CRTMException("Error parsing itinerary name").left(),
                direction = it.getIntOrNull("direction") ?: return CRTMException("Error parsing itinerary direction").left(),
                stops = stopExtractor.getStopsInfo().getOrHandle { return it.left() }
            )
        }
        return LineInfoItinerary(lineInfo, itineraries).right()
    }

    fun getLineLocations(): Either<CRTMException, List<LineLocation>> {
        val lineLocationJson = json.getPropertyOrNull("vehiclesLocation")?.getArrayOrNull("VehicleLocation") ?: return CRTMException("Error parsing line locations").left()
        return lineLocationJson.map { lineLocation ->
            val coordinates = lineLocation.getPropertyOrNull("coordinates") ?: return CRTMException("Error parsing line location coordinates").left()
            val line = lineLocation.getPropertyOrNull("line") ?: return CRTMException("Error parsing line location line").left()

            LineLocation(

                codLine = line.getStringOrNull("codLine")?.let { CodLine(it) }
                    ?: return CRTMException("Error parsing line code").left(),

                codVehicle = lineLocation.getStringOrNull("codVehicle")?.let { CodVehicle(it) }
                    ?: return CRTMException("Error parsing vehicle code").left(),

                codMode = line.getStringOrNull("codMode")?.toIntOrNull()?.let { CodMode(it) }
                    ?: return CRTMException("Error parsing line mode").left(),

                direction = lineLocation.getIntOrNull("direction")
                    ?: return CRTMException("Error parsing direction").left(),

                coordinates = Coordinate(
                    latitude = coordinates.getDoubleOrNull("latitude") ?: return CRTMException("Error parsing latitude").left(),
                    longitude = coordinates.getDoubleOrNull("longitude") ?: return CRTMException("Error parsing longitude").left()
                ),

                service = lineLocation.getStringOrNull("service") ?: return CRTMException("Error parsing service").left(),
            )

        }.right()
    }
}