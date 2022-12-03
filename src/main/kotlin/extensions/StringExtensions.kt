package extensions

import java.net.URLEncoder
import java.nio.charset.Charset

fun Any.encode(charset: Charset = Charsets.UTF_8) = URLEncoder.encode(this.toString(), charset)
