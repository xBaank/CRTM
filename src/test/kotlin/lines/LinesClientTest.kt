package lines

import CRTMClient
import crtm.soap.MultimodalInformation_Service
import crtm.soap.PublicKeyRequest
import kotlinx.coroutines.flow.take
import kotlinx.coroutines.flow.toList
import kotlinx.coroutines.runBlocking
import org.amshove.kluent.shouldBeEqualTo
import org.amshove.kluent.shouldNotBeEmpty
import org.junit.jupiter.api.Test

class LinesClientTest {
    @Test
    fun `get lines by CodLine should return LineInfo`(): Unit = runBlocking {
        val client = MultimodalInformation_Service()
        val key = client.basicHttp.getPublicKey(PublicKeyRequest())
        println("Key: ${key.key}")

       /* val client = CRTMClient()
        val line = client.lines.getLineInfoByCodLine(CodLine("8__450___"))
        line.codLine shouldBeEqualTo CodLine("8__450___")
        line.itineraries shouldHaveSize 2
        line.itineraries.firstOrNull()?.stops?.shouldNotBeEmpty()*/
    }

    @Test
    fun `get line location by CodLine should return LineLocation`(): Unit = runBlocking {
        val client = CRTMClient()
        val linesLocations = client.lines.getLineLocationByCodLine(CodLine("8__450___")).take(4).toList()
        linesLocations.shouldNotBeEmpty()
        linesLocations.firstOrNull()?.codLine shouldBeEqualTo CodLine("8__450___")
    }
}