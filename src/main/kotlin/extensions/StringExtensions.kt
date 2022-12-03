package extensions

import java.net.URLEncoder
import java.nio.charset.Charset

fun Any.toParam(charset: Charset = Charsets.UTF_8): String = URLEncoder.encode(this.toString(), charset)
