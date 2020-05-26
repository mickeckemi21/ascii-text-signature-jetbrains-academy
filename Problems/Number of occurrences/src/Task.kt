import java.util.*

fun main() {
    // write your code here
    val scanner = Scanner(System.`in`)
    val text = scanner.nextLine()
    val word = scanner.next()
    val size = text.split(word).size
    if (size == 0 || size == 1) {
        println(0)
    } else {
        println(size - 1)
    }

}