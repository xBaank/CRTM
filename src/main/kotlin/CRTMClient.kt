import lines.LinesClient
import modes.ModesClient
import okhttp3.OkHttpClient
import stops.StopsClient
import java.util.concurrent.TimeUnit

class CRTMClient(
    httpClient: OkHttpClient = OkHttpClient.Builder()
        .readTimeout(30, TimeUnit.SECONDS)
        .build()
) {
    val stops = StopsClient(httpClient)
    val modes = ModesClient(httpClient)
    val lines = LinesClient(httpClient)
}