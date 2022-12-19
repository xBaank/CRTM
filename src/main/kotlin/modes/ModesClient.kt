package modes

import CRTM_URL
import arrow.core.getOrHandle
import extensions.jsonRequest
import modes.extractors.ModesExtractor
import okhttp3.OkHttpClient

class ModesClient(private val httpClient: OkHttpClient) {
    suspend fun getModes(): Modes {
        val json = httpClient.jsonRequest("$CRTM_URL/GetModes.php").getOrHandle { throw it }
        val extractor = ModesExtractor(json)
        return extractor.getModes()
    }

}