package csstype

import web.dom.css.ElementCSSInlineStyle

inline val ElementCSSInlineStyle.sx: Properties
    get() = style.unsafeCast<Properties>()

inline fun ElementCSSInlineStyle.sx(
    block: @CssDsl Properties.() -> Unit,
) {
    block(sx)
}
