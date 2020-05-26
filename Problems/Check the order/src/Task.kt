import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val numberCount = scanner.nextInt()
    var currentNumber: Int? = null
    var result = "NO"
    for (i in 1..numberCount) {
        val number = scanner.nextInt()
        currentNumber = if (currentNumber != null) {
            if (number < currentNumber) {
                result = "NO"
                break
            } else {
                result = "YES"
                number
            }
        } else {
            result = "YES"
            number
        }
    }
    println(result)
}