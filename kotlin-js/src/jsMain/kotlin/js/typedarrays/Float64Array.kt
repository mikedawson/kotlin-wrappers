@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package js.typedarrays

import js.buffer.ArrayBufferLike
import js.core.JsIterable
import js.core.ReadonlyArray

open external class Float64Array(
    override val buffer: ArrayBufferLike,
    override val byteOffset: Int = definedExternally,
    override val length: Int = definedExternally,
) : TypedArray<Float64Array, Double> {
    constructor()
    constructor(length: Int)
    constructor(elements: JsIterable<Double>)
    constructor(elements: ReadonlyArray<Double>)

    companion object {
        val BYTES_PER_ELEMENT: Int
    }
}
