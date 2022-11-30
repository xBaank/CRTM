package stops

import CRTM_URL
import exceptions.CRTMException
import extensions.encode
import extensions.jsonRequest
import java.net.http.HttpClient

class StopsClient(val httpClient: HttpClient) {

    suspend fun getStopInfoByCodStop(codStop: String): StopInfo {
        val json = httpClient.jsonRequest("$CRTM_URL/GetStops.php?codStop=${codStop.encode()}")
        val extractor = StopExtractor(json)
        return extractor.getStopInfoOrNull() ?: throw CRTMException("Cant find stop info by id")
    }

    suspend fun getStopsBySearch(query: String): List<StopInfo> {
        val json = httpClient.jsonRequest("$CRTM_URL/GetStops.php?customSearch=${query.encode()}")
        val extractor = StopExtractor(json)
        return extractor.getStopsInfo()
    }

}