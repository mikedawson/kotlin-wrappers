// Automatically generated - do not modify!

package typescript

import js.core.ReadonlyArray

sealed external interface EmitHelperBase {
    val name: String
    val scoped: Boolean
    val text: dynamic /* string | ((node: EmitHelperUniqueNameCallback) => string) */
    val priority: Int?
    val dependencies: ReadonlyArray<EmitHelper>?
}
