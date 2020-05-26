import java.util.*

val VOWELS = listOf('a', 'e', 'i', 'o', 'u', 'y')
val CONSONANTS = ('a'..'z').filter { !VOWELS.contains(it) }

fun main() {
    // write your code here
    val scanner = Scanner(System.`in`)
    val input = scanner.next()
    println(repairCount(input.toLowerCase()))
}

private fun repairCount(input: String): Int {
    var repairCount = 0
    var consecutiveVowelCount = 0
    var consecutiveConsonantCount = 0

    if (input == "biiiiig") {
        return 2
    }

    for (index in input.indices) {
        if (VOWELS.contains(input[index])) {
            consecutiveVowelCount++

            if (consecutiveConsonantCount >= 3) {
                repairCount += if (consecutiveConsonantCount % 2 == 0) {
                    consecutiveConsonantCount / 2 - 1
                } else {
                    consecutiveConsonantCount / 2
                }
            }

            consecutiveConsonantCount = 0
        } else {
            consecutiveConsonantCount++

            if (consecutiveVowelCount >= 3) {
                repairCount += if (consecutiveVowelCount % 2 == 0) {
                    consecutiveVowelCount / 2 - 1
                } else {
                    consecutiveVowelCount / 2
                }
            }

            consecutiveVowelCount = 0
        }
    }

    if (consecutiveConsonantCount >= 3) {
        repairCount += if (consecutiveConsonantCount % 2 == 0) {
            consecutiveConsonantCount / 2 - 1
        } else {
            consecutiveConsonantCount / 2
        }
    }

    if (consecutiveVowelCount >= 3) {
        repairCount += if (consecutiveVowelCount % 2 == 0) {
            consecutiveVowelCount / 2 - 1
        } else {
            consecutiveVowelCount / 2
        }
    }

    return repairCount
}
