import java.util.*

fun main() {
    // write your code here
    val scanner = Scanner(System.`in`)
    val input = scanner.next()
    val date = input.split("-")
    println("${date[1]}/${date[2]}/${date[0]}")
}