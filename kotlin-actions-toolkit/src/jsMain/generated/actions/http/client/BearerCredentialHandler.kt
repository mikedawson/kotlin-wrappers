// Automatically generated - do not modify!

@file:JsModule("@actions/http-client")

@file:Suppress(
    "ABSTRACT_MEMBER_NOT_IMPLEMENTED",
)

package actions.http.client

import kotlin.js.Promise

external class BearerCredentialHandler : RequestHandler {
    var token: String

    constructor(token: String)

    override fun prepareRequest(options: node.http.RequestOptions)
    fun canHandleAuthentication(): Boolean
    fun handleAuthentication(): Promise<HttpClientResponse>
}
