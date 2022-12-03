package modes

import CRTM_URL
import extensions.jsonRequest
import modes.extractors.ModesExtractor
import okhttp3.OkHttpClient

class ModesClient(private val httpClient: OkHttpClient) {
    suspend fun getModes(): Modes {
        val json = httpClient.jsonRequest("$CRTM_URL/GetModes.php")
        val extractor = ModesExtractor(json)
        return extractor.getModes()
    }

}