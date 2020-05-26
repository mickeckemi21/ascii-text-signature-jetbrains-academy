import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    var maxSequenceCount = 0
    var currentSequenceNumber = 1
    var currentSequenceCount = 0
    val numbersCount = scanner.nextInt()
    repeat(numbersCount) {
        val number = scanner.nextInt()
        if (number >= currentSequenceNumber) {
            currentSequenceCount++
            currentSequenceNumber = number
            if (currentSequenceCount > maxSequenceCount) {
                maxSequenceCount = currentSequenceCount
            }
        } else {
            if (currentSequenceCount > maxSequenceCount) {
                maxSequenceCount = currentSequenceCount
            }
            currentSequenceCount = 1
            currentSequenceNumber = number
        }
    }
    println(maxSequenceCount)
}