import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val numberCount = scanner.nextInt()
    val numbers = IntArray(numberCount)
    for (i in numbers.indices) {
        numbers[(i + 1) % numbers.size] = scanner.nextInt()
    }
    println(numbers.joinToString(separator = " "))
}