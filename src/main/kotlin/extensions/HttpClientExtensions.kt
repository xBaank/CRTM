package extensions

import JsonNode
import JsonReader
import exceptions.CRTMException
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import okhttp3.OkHttpClient
import okhttp3.Request

internal suspend fun OkHttpClient.jsonRequest(url: String): JsonNode {
    val request = Request.Builder()
        .url(url)
        .get()
        .build()

    withContext(Dispatchers.IO) {
        newCall(request).execute()
    }.use {
        if (it.code != 200) throw CRTMException("Error requesting $url, status code: ${it.code}")

        return JsonReader.readOrNull(it.body?.byteStream() ?: throw CRTMException("Empty body from $url"))
            ?: throw CRTMException("Error parsing json from $url")
    }
}