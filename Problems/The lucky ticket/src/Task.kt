import java.util.*

fun main() {
    // write your code here
    val scanner = Scanner(System.`in`)
    val ticket = scanner.next()
    if (ticket[0].toInt() + ticket[1].toInt() + ticket[2].toInt() ==
        ticket[ticket.lastIndex].toInt() + ticket[ticket.lastIndex - 1].toInt() + ticket[ticket.lastIndex - 2].toInt()) {
        println("Lucky")
    } else {
        println("Regular")
    }

}