import java.util.*

fun main() {
    // write your code here   
    val scanner = Scanner(System.`in`)
    val text = scanner.next()
    var char = text[0]
    var result = true
    for (index in 1..text.lastIndex) {
        if (text[index] != char + 1) {
            result = false
            break
        }

        char += 1
    }
    println(result)
}