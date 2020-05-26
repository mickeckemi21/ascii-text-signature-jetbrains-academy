import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    // put your code here
    val text = input.next()
    for (i in 'a'..'z') {
        if (!text.contains(i)) {
            print(i)
        }
    }
}