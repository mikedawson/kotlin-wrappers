// Automatically generated - do not modify!

package webrtc

import js.buffer.ArrayBuffer
import js.core.ReadonlyArray
import web.events.Event
import web.events.EventHandler
import web.events.EventTarget

sealed external class RTCDtlsTransport :
    EventTarget {
    val iceTransport: RTCIceTransport
    var onerror: EventHandler<Event>?
    var onstatechange: EventHandler<Event>?
    val state: RTCDtlsTransportState
    fun getRemoteCertificates(): ReadonlyArray<ArrayBuffer>
}
