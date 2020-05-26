
import java.util.*
import kotlin.random.Random

fun main() {
    // write your code here
    val scanner = Scanner(System.`in`)
    var a = scanner.nextInt()
    var b = scanner.nextInt()
    var c = scanner.nextInt()
    val n = scanner.nextInt()
    val password = CharArray(n)
    for (index in password.indices) {
        if (index == 0) {
            if (a > b && a > c) {
                password[0] = Random.nextInt(65, 91).toChar()
                a--
            } else if (b > a && b > c) {
                password[0] = Random.nextInt(65, 91).toChar().toLowerCase()
                b--
            } else {
                password[0] = Random.nextInt(48, 58).toChar()
                c--
            }
        } else {
            val prevChar = password[index - 1]
            if (prevChar in 'A'..'Z') {
                if (b == 0 && c == 0) {
                    val nextChar = Random.nextInt(65, 91).toChar()
                    password[index] = if (nextChar == prevChar) {
                        if (nextChar == 'Z') {
                            nextChar - 1
                        } else {
                            nextChar + 1
                        }
                    } else nextChar
                    a--
                } else {
                    if (b > c) {
                        password[index] = Random.nextInt(65, 91).toChar().toLowerCase()
                        b--
                    } else {
                        password[index] = Random.nextInt(48, 58).toChar()
                        c--
                    }
                }
            } else if (prevChar in 'a'..'z') {
                if (a == 0 && c == 0) {
                    val nextChar = Random.nextInt(65, 91).toChar().toLowerCase()
                    password[index] = if (nextChar == prevChar) {
                        if (nextChar == 'z') {
                            nextChar - 1
                        } else {
                            nextChar + 1
                        }
                    } else nextChar
                    b--
                } else {
                    if (a > c) {
                        password[index] = Random.nextInt(65, 91).toChar()
                        a--
                    } else {
                        password[index] = Random.nextInt(48, 58).toChar()
                        c--
                    }
                }
            } else if (prevChar in '0'..'9') {
                if (a == 0 && b == 0) {
                    val nextChar = Random.nextInt(48, 58).toChar()
                    password[index] = if (nextChar == prevChar) {
                        if (nextChar == '9') {
                            nextChar - 1
                        } else {
                            nextChar + 1
                        }
                    } else nextChar
                    c--
                } else {
                    if (a > b) {
                        password[index] = Random.nextInt(65, 91).toChar()
                        a--
                    } else {
                        password[index] = Random.nextInt(65, 91).toChar().toLowerCase()
                        b--
                    }
                }
            }
        }
    }

    println(String(password))
}