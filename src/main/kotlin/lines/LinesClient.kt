package lines

import CRTM_URL
import exceptions.CRTMException
import extensions.encode
import extensions.jsonRequest
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.coroutineScope
import lines.extractors.LinesExtractor
import java.net.http.HttpClient

class LinesClient(private val httpClient: HttpClient) {
    suspend fun getLineInfoByCodLine(codLine: CodLine): LineInfoItinerary {
        val json =
            httpClient.jsonRequest("$CRTM_URL/GetLinesInformation.php?activeItinerary=1&codLine=${codLine.value.encode()}")
        val extractor = LinesExtractor(json)
        return extractor.getLineInfoOrNull() ?: throw CRTMException("Line not found")
    }

    suspend fun getLineLocationByCodLine(codLine: CodLine): List<LineLocation> = coroutineScope {
        val lineInfo = getLineInfoByCodLine(codLine)

        val jobs = lineInfo.itineraries.map {
            async {
                val direction = it.direction
                val codStop = it.stops.firstOrNull()?.codStop ?: throw CRTMException("CodStop not found")
                val codItinerary = it.codItinerary
                val codMode = lineInfo.codMode

                val json =
                    httpClient.jsonRequest("$CRTM_URL/GetLineLocation.php?mode=${codMode.value.encode()}&codItinerary=${codItinerary.value.encode()}&codLine=${codLine.value.encode()}&codStop=${codStop.value.encode()}&direction=${direction.encode()}")
                val extractor = LinesExtractor(json)
                extractor.getLineLocations()
            }
        }

        return@coroutineScope jobs.awaitAll().flatten()
    }
}