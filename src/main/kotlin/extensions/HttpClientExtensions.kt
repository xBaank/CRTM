package extensions

import JsonNode
import JsonReader
import exceptions.CRTMException
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.net.URL
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse

suspend fun HttpClient.jsonRequest(url: String): JsonNode {
    val request = HttpRequest.newBuilder()
        .uri(URL(url).toURI())
        .GET()
        .build()

    val response = withContext(Dispatchers.IO) {
        send(request, HttpResponse.BodyHandlers.ofInputStream())
    }

    if (response.statusCode() != 200) throw CRTMException("Error requesting $url, status code: ${response.statusCode()}")

    return JsonReader.readOrNull(response.body()) ?: throw CRTMException("Error parsing json from $url")
}