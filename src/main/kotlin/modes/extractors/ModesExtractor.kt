package modes.extractors

import JsonNode
import arrow.core.Either
import arrow.core.left
import arrow.core.rightIfNotNull
import exceptions.CRTMException
import getArrayOrNull
import getPropertyOrNull
import getStringOrNull
import modes.CodMode
import modes.Mode

internal class ModesExtractor(val json: JsonNode) {
    fun getModes(): Either<CRTMException,List<Mode>> = json.getPropertyOrNull("modes")
            ?.getArrayOrNull("Mode")
            ?.mapNotNull {
                Mode(
                    CodMode(it.getStringOrNull("codMode")?.toIntOrNull() ?: return CRTMException("Error parsing mode code").left()),
                    it.getStringOrNull("name") ?: return CRTMException("Error parsing mode name").left()
                )
            }.rightIfNotNull { CRTMException("Error parsing modes") }
}

