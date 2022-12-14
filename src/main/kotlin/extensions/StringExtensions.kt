package extensions

import java.net.URLEncoder

internal fun Any.toParam(charset: String = "UTF-8"): String = URLEncoder.encode(this.toString(), charset)
