package lines

import modes.CodMode

data class LineInfo(
    override val codLine: CodLine,
    override val description: String,
    override val codMode: CodMode
) : ILineInfo

data class LineInfoItinerary(
    private val lineInfo: LineInfo,
    val itineraries: List<Itinerary>
) : ILineInfo by lineInfo

interface ILineInfo {
    val codLine: CodLine
    val description: String
    val codMode: CodMode
}

