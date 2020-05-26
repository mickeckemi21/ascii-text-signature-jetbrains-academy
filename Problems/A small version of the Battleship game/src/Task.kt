import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    // put your code here
    val table = Array(5, init = { IntArray(5) })
    repeat(3) {
        val row = input.nextInt()
        val column = input.nextInt()
        table[row - 1][column - 1] = 1
    }
    val rows = mutableListOf<Int>()
    loop@ for (i in 0..4) {
        for (j in 0..4) {
            if (table[i][j] == 1) {
                continue@loop
            }
        }
        rows.add(i + 1)
    }
    println(rows.joinToString(separator = " "))
    val columns = mutableListOf<Int>()
    loop@ for (i in 0..4) {
        for (j in 0..4) {
            if (table[j][i] == 1) {
                continue@loop
            }
        }
        columns.add(i + 1)
    }
    print(columns.joinToString(separator = " "))
}
