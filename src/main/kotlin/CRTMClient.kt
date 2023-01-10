import lines.LinesClient
import modes.ModesClient
import okhttp3.OkHttpClient
import stops.StopsClient
import java.util.concurrent.TimeUnit

internal const val CRTM_URL = "https://www.crtm.es/widgets/api"
internal val defaultHttpClient = OkHttpClient.Builder()
    .readTimeout(0, TimeUnit.SECONDS)
    .build()

class CRTMClient(httpClient: OkHttpClient = defaultHttpClient) {
    val stops = StopsClient(httpClient)
    val modes = ModesClient(httpClient)
    val lines = LinesClient(httpClient)
}