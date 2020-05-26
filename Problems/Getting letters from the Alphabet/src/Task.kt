import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    // put your code here
    val letter = input.next()
    for (char in 'a'..'z') {
        if (letter[0] == char) {
            break
        }
        print(char)
    }
}