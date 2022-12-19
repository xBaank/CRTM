package extensions

import JsonReader
import defaultHttpClient
import exceptions.CRTMException
import getArrayOrNull
import getStringOrNull
import jObject
import lines.Coordinate
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody.Companion.toRequestBody
import serialize
import utils.PolylineUtil

fun List<Coordinate>.getRoute(
    httpClient: OkHttpClient = defaultHttpClient,
    apiKey: String
): List<Coordinate> {
    val request = Request.Builder()
        .header("Authorization", apiKey)
        .url("https://api.openrouteservice.org/v2/directions/driving-hgv")
        .post(jsonBody(this))
        .build()
    val response = httpClient.newCall(request).execute()
    val coordinates =
        getEncodedPolylines(response.body?.string() ?: throw CRTMException("No body returned getting route"))

    return PolylineUtil.decode(coordinates)
}

fun getEncodedPolylines(body: String) =
    JsonReader.readOrNull(body)?.getArrayOrNull("routes")?.firstOrNull()?.getStringOrNull("geometry")
        ?: throw CRTMException("Error getting route")

//Caution, openrouteservice coordinates order is reversed
fun jsonBody(coordinates: List<Coordinate>) = jObject {
    jArray("coordinates") {
        coordinates.forEach {
            addArray {
                add(it.longitude)
                add(it.latitude)
            }
        }
    }
}.serialize().toRequestBody("application/json".toMediaTypeOrNull())