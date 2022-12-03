import modes.CodMode
import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test
import stops.CodStop
import utils.createLineCode
import utils.createStopCode

class UtilsTest {
    @Test
    fun `should create codStop`() {
        createStopCode(CodMode(4), "07904") shouldBeEqualTo CodStop("4_07904")
    }

    @Test
    fun `should create lineCode`() {
        createLineCode(CodMode(4), "450") shouldBeEqualTo "4__450___"
    }
}