import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val numbersCount = scanner.nextInt()
    val numbers = IntArray(numbersCount)
    for (i in numbers.indices) {
        numbers[i] = scanner.nextInt()
    }
    val firstNumber = scanner.nextInt()
    val secondNumber = scanner.nextInt()
    var result = "YES"
    for (i in 0 until numbers.lastIndex) {
        if (numbers[i] == firstNumber && numbers[i + 1] == secondNumber) {
            result = "NO"
            break
        }
        if (numbers[i] == secondNumber && numbers[i + 1] == firstNumber) {
            result = "NO"
            break
        }
    }
    println(result)
}