import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val numbersCount = scanner.nextInt()
    var triples = 0
    var consecutiveNumbers = 1
    var previousNumber: Int? = null
    for (i in 1..numbersCount) {
        val number = scanner.nextInt()
        if (previousNumber != null) {
            if (number == previousNumber + 1) {
                consecutiveNumbers++
                if (consecutiveNumbers >= 3) {
                    triples++
                }
            } else {
                consecutiveNumbers = 1
            }
        }
        previousNumber = number
    }
    println(triples)
}