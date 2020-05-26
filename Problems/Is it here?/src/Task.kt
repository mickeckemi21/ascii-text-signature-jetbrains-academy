import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val numbersCount = scanner.nextInt()
    val numbers = IntArray(numbersCount)
    for (i in numbers.indices) {
        numbers[i] = scanner.nextInt()
    }
    val numberToFind = scanner.nextInt()
    println(if (numbers.any { it == numberToFind }) "YES" else "NO")
}