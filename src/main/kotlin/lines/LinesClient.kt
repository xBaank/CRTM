package lines

import CRTM_URL
import exceptions.CRTMException
import extensions.jsonRequest
import extensions.toParam
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import lines.extractors.LinesExtractor
import okhttp3.OkHttpClient

class LinesClient(private val httpClient: OkHttpClient) {

    suspend fun getLineInfoByCodLine(codLine: CodLine): LineInfoItinerary {
        val json =
            httpClient.jsonRequest("$CRTM_URL/GetLinesInformation.php?activeItinerary=1&codLine=${codLine.value.toParam()}")
        val extractor = LinesExtractor(json)
        return extractor.getLineInfoOrNull() ?: throw CRTMException("Line not found")
    }

    suspend fun getLineLocationByCodLine(codLine: CodLine): Flow<LineLocation> = flow {
        val lineInfo = getLineInfoByCodLine(codLine)
        lineInfo.itineraries.forEach {
            val direction = it.direction
            val codStop = it.stops.firstOrNull()?.codStop ?: throw CRTMException("CodStop not found")
            val codItinerary = it.codItinerary
            val codMode = lineInfo.codMode
            val json =
                httpClient.jsonRequest("$CRTM_URL/GetLineLocation.php?mode=${codMode.value.toParam()}&codItinerary=${codItinerary.value.toParam()}&codLine=${codLine.value.toParam()}&codStop=${codStop.value.toParam()}&direction=${direction.toParam()}")
            val extractor = LinesExtractor(json)
            extractor.getLineLocations().forEach { emit(it) }
        }
    }.flowOn(Dispatchers.IO)
}