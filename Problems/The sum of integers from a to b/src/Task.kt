import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    var sum = 0
    for (number in a..b) {
        sum += number
    }
    println(sum)
}