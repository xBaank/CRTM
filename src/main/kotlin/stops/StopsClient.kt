package stops

import CRTM_URL
import exceptions.CRTMException
import extensions.jsonRequest
import extensions.toParam
import okhttp3.OkHttpClient
import stops.extractors.StopExtractor
import stops.extractors.StopsTimesExtractor

class StopsClient(private val httpClient: OkHttpClient) {

    suspend fun getStopInfoByCodStop(codStop: CodStop): Stop {
        val json = httpClient.jsonRequest("$CRTM_URL/GetStops.php?codStop=${codStop.value.toParam()}")
        val extractor = StopExtractor(json)
        return extractor.getStopInfoOrNull() ?: throw CRTMException("Cant find stop info by id")
    }

    suspend fun getStopsBySearch(query: String): List<Stop> {
        val json = httpClient.jsonRequest("$CRTM_URL/GetStops.php?customSearch=${query.toParam()}")
        val extractor = StopExtractor(json)
        return extractor.getStopsInfo()
    }

    suspend fun getStopsTime(codStop: CodStop): List<StopTime> {
        val json =
            httpClient.jsonRequest("$CRTM_URL/GetStopsTimes.php?codStop=${codStop.value.toParam()}&type=1&orderBy=2&stopTimesByIti=3")
        val extractor = StopsTimesExtractor(json)
        return extractor.getStopTimes()
    }

}