package busTrackerApi

import busTrackerApi.plugins.configureRoutingV1
import io.ktor.server.engine.*
import io.ktor.server.netty.*

fun main() {
    embeddedServer(Netty, port = 8080) {
        configureRoutingV1()
    }.start(wait = true)
}