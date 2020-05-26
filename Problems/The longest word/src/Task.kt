import java.util.*

fun main() {
    // write your code here
    val scanner = Scanner(System.`in`)
    val text = scanner.nextLine()
    val words = text.split(" ")
    var longestWord = 0
    var longestWordIndex = -1
    for (element in words.withIndex()) {
        if (element.value.length > longestWord) {
            longestWord = element.value.length
            longestWordIndex = element.index
        }
    }
    println(words[longestWordIndex])
}