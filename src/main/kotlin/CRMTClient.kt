import modes.ModesClient
import stops.StopsClient
import java.net.http.HttpClient

class CRMTClient(httpClient: HttpClient) {
    val stops = StopsClient(httpClient)
    val modes = ModesClient(httpClient)
}