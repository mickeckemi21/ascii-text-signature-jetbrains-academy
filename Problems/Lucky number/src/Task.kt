import java.util.*

fun main() {
    // write your code here
    val scanner = Scanner(System.`in`)
    val input = scanner.next()
    val firstHalf: String
    val secondHalf: String
    if (input.length % 2 == 0) {
        firstHalf = input.substring(0, input.length / 2)
        secondHalf = input.substring(input.length / 2)
    } else {
        firstHalf = input.substring(0, input.length / 2)
        secondHalf = input.substring(input.length / 2 + 1)
    }

    if (sumOfIntCharacters(firstHalf) == sumOfIntCharacters(secondHalf)) {
        println("YES")
    } else {
        println("NO")
    }

}

private fun sumOfIntCharacters(input: String): Int {
    return input.toCharArray().map { it.toInt() }.sum()
}