import java.lang.StringBuilder
import java.util.*

fun main() {
    // write your code here
    val scanner = Scanner(System.`in`)
    val input = scanner.next()
    var prevChar: Char? = null
    var charCount = 1
    val sb = StringBuilder()
    for (index in input.indices) {
        if (prevChar == null) {
            prevChar = input[index]
        } else {
            if (prevChar == input[index]) {
                charCount++
            } else {
                sb.append(prevChar)
                sb.append(charCount)
                charCount = 1
                prevChar = input[index]
            }
        }
    }
    sb.append(prevChar)
    sb.append(charCount)
    println(sb.toString())

}