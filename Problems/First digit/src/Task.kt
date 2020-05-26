import java.util.Scanner

fun main() {
    // put your code here
    val scanner = Scanner(System.`in`)
    val text = scanner.next()
    loop@ for (char in text.toCharArray()) {
        if (char.isDigit()) {
            println(char)
            break@loop
        }
    }
}