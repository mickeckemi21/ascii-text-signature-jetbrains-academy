import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val numbersCount = scanner.nextInt()
    val numbers = IntArray(numbersCount)
    var maxNumber = Int.MIN_VALUE
    var maxNumberIndex = -1
    for (i in numbers.indices) {
        val number = scanner.nextInt()
        if (number > maxNumber) {
            maxNumber = number
            maxNumberIndex = i
        }
    }
    println(maxNumberIndex)
}