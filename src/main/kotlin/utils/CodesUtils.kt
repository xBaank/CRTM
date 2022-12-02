package utils

import modes.CodMode
import stops.CodStop

fun createLineCode(codMode: CodMode, lineCode: String) = "${codMode.value}__${lineCode}___"
fun createStopCode(codMode: CodMode, stopCode: String) = CodStop("${codMode.value}_${stopCode}")