import java.util.*

val G = 'g'
val C = 'c'

fun main() {
    // write your code here
    val scanner = Scanner(System.`in`)
    val chain = scanner.next()
    val gCount = getCharCount(chain.toLowerCase(), G)
    val cCount = getCharCount(chain.toLowerCase(), C)
    println((gCount + cCount).toDouble() / chain.length.toDouble() * 100.00)

}

private fun getCharCount(text: String, char: Char): Int {
    val size = text.split(char).size
    return if (size == 0 || size == 1) 0 else size - 1
}