package lines

import kotlinx.coroutines.runBlocking
import org.amshove.kluent.shouldBeEqualTo
import org.amshove.kluent.shouldHaveSize
import org.amshove.kluent.shouldNotBeEmpty
import org.junit.jupiter.api.Test
import java.net.http.HttpClient

class LinesClientTest {
    @Test
    fun `get lines by CodLine should return LineInfo`(): Unit = runBlocking {
        val linesClient = LinesClient(HttpClient.newHttpClient())
        val line = linesClient.getLineInfoByCodLine(CodLine("8__450___"))
        line.codLine shouldBeEqualTo CodLine("8__450___")
        line.itineraries shouldHaveSize 2
        line.itineraries.firstOrNull()?.stops?.shouldNotBeEmpty()
    }

    @Test
    fun `get line location by CodLine should return LineLocation`(): Unit = runBlocking {
        val linesClient = LinesClient(HttpClient.newHttpClient())
        val linesLocations = linesClient.getLineLocationByCodLine(CodLine("8__450___"))
        linesLocations shouldHaveSize 4
        linesLocations.firstOrNull()?.codLine shouldBeEqualTo CodLine("8__450___")
    }
}