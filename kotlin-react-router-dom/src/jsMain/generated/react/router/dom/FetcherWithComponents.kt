@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package react.router.dom

import react.ForwardRefExoticComponent
import remix.run.router.Fetcher


external interface FetcherWithComponents<TData> : Fetcher<TData> {
    var Form: ForwardRefExoticComponent<FormProps>
    var submit: (target: SubmitTarget, options: SubmitOptions? /* use undefined for default */) -> Unit
    var load: (href: String) -> Unit
}

