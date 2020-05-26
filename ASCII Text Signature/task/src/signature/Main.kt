package signature

import java.lang.StringBuilder
import java.nio.file.Paths
import java.util.*

val ROMAN_FONT_LETTERS = parseFont("roman.txt")
val MEDIUM_FONT_LETTERS = parseFont("medium.txt")

private fun parseFont(fileName: String): Map<String, List<String>> {
    val lettersMap = mutableMapOf<String, List<String>>()
    val scanner = Scanner(Paths.get(fileName))

    val fontInfo = scanner.nextLine()
    val letterHeight = fontInfo.split(" ")[0].toInt()
    val lettersCount = fontInfo.split(" ")[1].toInt()
    repeat(lettersCount) {
        val letterInfo = scanner.nextLine()
        val letter = letterInfo.split(" ")[0]

        val letterRows = mutableListOf<String>()
        repeat(letterHeight) {
            letterRows.add(scanner.nextLine())
        }
        lettersMap[letter] = letterRows
    }

    return lettersMap
}

fun main() {
    val scanner = Scanner(System.`in`)
    val name = scanner.nextLine()
    val status = scanner.nextLine()
    printPerson(name, status)
}

private fun printPerson(name: String, status: String) {
    val nameRows = createRomanFontName(name)
    val statusRows = createMediumFontStatus(status)
    if (name.length >= status.length) {
        val charArray = CharArray(nameRows.first().length + 8) { '8' }
        println(charArray.joinToString(separator = ""))
        nameRows.forEach { println("88  $it  88") }
        statusRows.forEach { printShorterText(charArray.size, it) }
        println(charArray.joinToString(separator = ""))
    } else {
        val charArray = CharArray(statusRows.first().length + 8) { '8' }
        repeat(charArray.size) {
            print("8")
        }
        println()
        nameRows.forEach { printShorterText(charArray.size, it) }
        statusRows.forEach { println("88  $it  88") }
        repeat(charArray.size) {
            print("8")
        }
    }
}

fun createMediumFontStatus(text: String): List<String> {
    val list = mutableListOf<String>()
    for (row in MEDIUM_FONT_LETTERS.entries.first().value.indices) {
        val stringBuilder = StringBuilder()
        for (index in 0..text.lastIndex) {
            if (text[index].isWhitespace()) {
                stringBuilder.append("     ")
            } else {
                val letterRow = MEDIUM_FONT_LETTERS[text[index].toString()]
                stringBuilder.append(letterRow?.get(row))
            }
        }
        list.add(stringBuilder.toString())
    }

    return list
}

fun printShorterText(lineSize: Int, shorterText: String) {
    print("88")
    val leftBlanksCount = if (lineSize % 2 == 0 && shorterText.length % 2 == 0 ||
            lineSize % 2 == 1 && shorterText.length % 2 == 1 ||
            lineSize % 2 == 1 && shorterText.length % 2 == 0) {
        lineSize / 2 - shorterText.length / 2 - 2
    } else {
        lineSize / 2 - shorterText.length / 2 - 1 - 2
    }
    val rightBlanksCount = lineSize - leftBlanksCount - shorterText.length - 2 - 2
    repeat(leftBlanksCount) {
        print(" ")
    }
    print(shorterText)
    repeat(rightBlanksCount) {
        print(" ")
    }
    println("88")
}

private fun createRomanFontName(text: String): List<String> {
    val list = mutableListOf<String>()
    for (row in ROMAN_FONT_LETTERS.entries.first().value.indices) {
        val stringBuilder = StringBuilder()
        for (index in 0..text.lastIndex) {
            if (text[index].isWhitespace()) {
                stringBuilder.append("          ")
            } else {
                val letterRow = ROMAN_FONT_LETTERS[text[index].toString()]
                stringBuilder.append(letterRow?.get(row))
            }
        }
        list.add(stringBuilder.toString())
    }

    return list
}
