package example

import kotlinjs.common.JsObj
import kotlin.browser.window
import kotlin.js.Date

fun main(args: Array<String>) {
    window.alert(today())
}

private fun today(): String {
    fun option() = JsObj<Date.LocaleOptions>()
    val year = Date().toLocaleDateString("en-GB", option().apply { year = "numeric" })
    val month = Date().toLocaleDateString("en-GB", option().apply { month = "2-digit" })
    val day = Date().toLocaleDateString("en-GB", option().apply { day = "2-digit" })
    return "$year-$month-$day"
}
