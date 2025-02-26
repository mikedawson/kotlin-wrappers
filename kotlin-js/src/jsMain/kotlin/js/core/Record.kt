package js.core

external interface Record<K : Any, V : Any>
    : ReadonlyRecord<K, V>

inline operator fun <K : Any, V : Any> Record<K, V>.set(
    key: K,
    value: V,
) {
    asDynamic()[key] = value
}

fun <K : Any, V : Any> Record(): Record<K, V> =
    jso()

fun <K : Any, V : Any> Record(
    block: Record<K, V>.() -> Unit,
): Record<K, V> =
    jso(block)
