package stops

import CRMTClient
import kotlinx.coroutines.runBlocking
import org.amshove.kluent.shouldBeEqualTo
import org.amshove.kluent.shouldBeTrue
import org.amshove.kluent.shouldContain
import org.amshove.kluent.shouldNotBeEmpty
import org.junit.jupiter.api.Test
import java.net.http.HttpClient

class StopsClientTest {
    @Test
    fun `should get stops`(): Unit = runBlocking {
        val client = CRMTClient(HttpClient.newHttpClient())
        val stop = client.stops.getStopInfoByCodStop("8_07904")

        stop.name shouldBeEqualTo "AV.UNIVERSIDAD-POLICÍA NACIONAL"
        stop.codStop shouldBeEqualTo "8_07904"
        stop.latitude shouldBeEqualTo 40.330936319115
        stop.longitude shouldBeEqualTo -3.7655800899764
        stop.lines shouldContain "8__450___"
    }

    @Test
    fun `should get stops by search`(): Unit = runBlocking {
        val client = CRMTClient(HttpClient.newHttpClient())
        val stops = client.stops.getStopsBySearch("Universidad")
        stops.shouldNotBeEmpty()
        stops.any { it.name == "AV.UNIVERSIDAD-POLICÍA NACIONAL" }.shouldBeTrue()
    }
}