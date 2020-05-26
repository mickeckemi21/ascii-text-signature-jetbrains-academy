import java.util.*

fun main() {
    // write your code here
    val scanner = Scanner(System.`in`)
    val word = scanner.next()
    var result = "yes"
    for (index in 0..(word.length / 2)) {
        if (word[index] != word[word.lastIndex - index]) {
            result = "no"
            break
        }
    }
    println(result)
}