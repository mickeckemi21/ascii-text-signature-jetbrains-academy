import java.util.*
import kotlin.math.pow

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val c = scanner.nextInt()
    val d = scanner.nextInt()
    for (x in 0..1000) {
        if (a * x.toDouble().pow(3) + b * x.toDouble().pow(2) +
                c * x.toDouble().pow(1) + d == 0.0) {
            println(x)
        }
    }
}