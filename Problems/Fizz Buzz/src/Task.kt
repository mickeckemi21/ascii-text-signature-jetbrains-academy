import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    for (number in a..b) {
        if (number % 3 == 0 && number % 5 == 0) {
            print("FizzBuzz")
        } else if (number % 3 == 0) {
            print("Fizz")
        } else if (number % 5 == 0) {
            print("Buzz")
        } else {
            print(number)
        }
        println()
    }
}