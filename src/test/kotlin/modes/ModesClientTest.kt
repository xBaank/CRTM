package modes

import CRMTClient
import kotlinx.coroutines.runBlocking
import org.amshove.kluent.shouldContain
import org.junit.jupiter.api.Test
import java.net.http.HttpClient

class ModesClientTest {
    @Test
    fun `should get modes`(): Unit = runBlocking {
        val client = CRMTClient(HttpClient.newHttpClient())
        val modes = client.modes.getModes()
        modes shouldContain Mode(CodMode(4), "METRO")
        modes shouldContain Mode(CodMode(8), "AUTOBUSES INTERURBANOS")
        modes shouldContain Mode(CodMode(5), "CERCANIAS")
        modes shouldContain Mode(CodMode(10), "METRO LIGERO/TRANVÍA")
        modes shouldContain Mode(CodMode(6), "AUTOBUSES EMT")
    }
}