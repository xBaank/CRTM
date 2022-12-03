import lines.LinesClient
import modes.ModesClient
import stops.StopsClient
import java.net.http.HttpClient

class CRTMClient(httpClient: HttpClient = HttpClient.newHttpClient()) {
    val stops = StopsClient(httpClient)
    val modes = ModesClient(httpClient)
    val lines = LinesClient(httpClient)
}