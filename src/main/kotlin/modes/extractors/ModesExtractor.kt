package modes.extractors

import JsonNode
import exceptions.CRTMException
import getArrayOrNull
import getPropertyOrNull
import getStringOrNull
import modes.CodMode
import modes.Mode

internal class ModesExtractor(val json: JsonNode) {
    fun getModes(): List<Mode> =
        json.getPropertyOrNull("modes")
            ?.getArrayOrNull("Mode")
            ?.mapNotNull {
                Mode(
                    CodMode(it.getStringOrNull("codMode")?.toIntOrNull() ?: return@mapNotNull null),
                    it.getStringOrNull("name") ?: return@mapNotNull null
                )
            } ?: throw CRTMException("Modes not found")
}

