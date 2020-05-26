import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val count = scanner.nextInt()
    val numbers = IntArray(count)
    for (i in 0 until count) {
        numbers[i] = scanner.nextInt()
    }
    if (numbers.size == 1) {
        println(numbers[0])
    } else {
        var maxPairProduct = Int.MIN_VALUE
        for (i in 0 until numbers.size - 1) {
            for (j in i + 1 until numbers.size) {
                if (numbers[i] * numbers[j] > maxPairProduct) {
                    maxPairProduct = numbers[i] * numbers[j]
                }
            }
        }
        println(maxPairProduct)
    }

}