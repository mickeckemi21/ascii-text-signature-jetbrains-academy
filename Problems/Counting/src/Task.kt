import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val numberCount = scanner.nextInt()
    val numbers = IntArray(numberCount)
    for (i in numbers.indices) {
        numbers[i] = scanner.nextInt()
    }
    val numberToFind = scanner.nextInt()
    println(numbers.count { it == numberToFind })

}