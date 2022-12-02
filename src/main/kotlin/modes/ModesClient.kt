package modes

import CRTM_URL
import JsonArray
import exceptions.CRTMException
import extensions.jsonRequest
import getArrayOrNull
import getPropertyOrNull
import getStringOrNull
import java.net.http.HttpClient

class ModesClient(private val httpClient: HttpClient) {
    suspend fun getModes(): Modes = httpClient.jsonRequest("$CRTM_URL/GetModes.php")
        .getPropertyOrNull("modes")
        ?.getArrayOrNull("Mode")
        ?.getModesOrNull()
        ?: throw CRTMException("Modes not found")

    private fun JsonArray?.getModesOrNull(): Modes? = this?.map {
        Mode(
            CodMode(it.getStringOrNull("codMode")?.toIntOrNull() ?: return null),
            it.getStringOrNull("name") ?: return null
        )
    }
}