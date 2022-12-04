package utils

import lines.CodLine
import modes.CodMode
import stops.CodStop

fun createLineCode(codMode: CodMode, lineCode: String) = CodLine("${codMode.value}__${lineCode}___")
fun createStopCode(codMode: CodMode, stopCode: String) = CodStop("${codMode.value}_${stopCode}")