// Automatically generated - do not modify!

package node.crypto

import js.core.ReadonlyArray

sealed external interface RsaPrivateKey {
    var key: KeyLike
    var passphrase: String?

    /**
     * @default 'sha1'
     */
    var oaepHash: String?
    var oaepLabel: ReadonlyArray<*>? /* TypedArray */
    var padding: Number?
}
