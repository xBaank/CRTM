package extensions

import JsonNode
import JsonReader
import arrow.core.Either
import arrow.core.left
import arrow.core.rightIfNotNull
import exceptions.CRTMException
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response

internal suspend fun OkHttpClient.jsonRequest(url: String): Either<CRTMException, JsonNode>  {
    val request = Request.Builder()
        .url(url)
        .get()
        .build()

    return withContext(Dispatchers.IO) { newCall(request).execute() }
        .use { processResponse(it, url) }
}

private fun processResponse(it: Response, url: String): Either<CRTMException, JsonNode> {
    return when {
        it.code != 200 -> CRTMException("Error requesting $url, status code: ${it.code}").left()
        else -> JsonReader
            .readOrNull(it.body?.byteStream() ?: return CRTMException("Empty body from $url").left())
            .rightIfNotNull { CRTMException("Error parsing $url") }
    }
}