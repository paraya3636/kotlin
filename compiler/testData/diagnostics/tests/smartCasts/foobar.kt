fun Int.bar() = 42

interface Foo {
    val length: Int
}

fun <T : Foo?> text(x: T) {
    x!!.length
}