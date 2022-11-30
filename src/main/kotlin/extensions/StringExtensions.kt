package extensions

import java.net.URLEncoder
import java.nio.charset.Charset

fun String.encode(charset: Charset = Charsets.UTF_8) = URLEncoder.encode(this, charset)
