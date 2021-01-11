@file:Suppress("NOTHING_TO_INLINE")

package cases.inline

public inline fun <reified T> inlineReified() {}

public inline var <reified T> T.foo: String
    get() = ""
    set(_) {}
