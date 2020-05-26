import java.util.*

fun main() {
    // write your code here
    val scanner = Scanner(System.`in`)
    val input = scanner.next()
    if (input.length % 2 == 0) {
        println(input.substring(0, input.length / 2 - 1) + input.substring(input.length / 2 + 1))
    } else {
        println(input.substring(0, input.length / 2) + input.substring(input.length / 2 + 1))
    }
}