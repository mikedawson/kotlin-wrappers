@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package react.router


external interface DataRouteObject : RouteObject {

    @Suppress("VAR_TYPE_MISMATCH_ON_OVERRIDE")
    override var children: js.core.ReadonlyArray<DataRouteObject>?


    @Suppress("VAR_TYPE_MISMATCH_ON_OVERRIDE")
    override var id: String

}

