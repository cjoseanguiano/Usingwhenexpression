/**
 * Created by carlosjoseanguiano on 05/06/17.
 */

fun main(args: Array<String>) {

    println(describe(1))
    println(describe("Hello"))
    println(describe(1000L))
    println(describe(2))
    println("other")
}

fun describe(obj: Any): String =
    when (obj) {
        1 -> "One"
        "Hello" -> "Greting"
        is Long -> "Long"
        !is String -> "Not a string"
        else -> "Unknown"
    }

