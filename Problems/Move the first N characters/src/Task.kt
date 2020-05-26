import java.util.*

fun main() {
    // write your code here
    val scanner = Scanner(System.`in`)
    val input = scanner.next()
    val number = scanner.nextInt()
    if (number > input.length) {
        println(input)
    } else {
        println(input.substring(number..input.lastIndex) + input.substring(0 until number))
    }
}