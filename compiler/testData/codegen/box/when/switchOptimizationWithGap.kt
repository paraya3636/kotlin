// WITH_RUNTIME
// CHECK_CASES_COUNT: function=foo count=4
// CHECK_IF_COUNT: function=foo count=1

fun foo(x: Int): String {
    return when (x) {
        1 -> "one"
        2 -> "two"
        three() -> "three"
        4 -> "four"
        5 -> "five"
        else -> "many"
    }
}

fun three() = 3

fun box(): String {
    var result = (1..7).map(::foo).joinToString()

    if (result != "one, two, three, four, five, many, many") return "fail: $result"
    return "OK"
}
