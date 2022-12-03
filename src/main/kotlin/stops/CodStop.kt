package stops

@JvmInline
value class CodStop(val value: String) {
    init {
        require(value.split("_").all { it.toIntOrNull() != null }) { "Codigo invalido" }
    }
}