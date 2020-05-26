import java.util.*

fun main() {
    // write your code here
    val scanner = Scanner(System.`in`)
    val url = scanner.next()
    val queryParams: List<String> = url.split("?")[1].split("&")
    if (queryParameterExists(queryParams, "pass")) {
        queryParams.map { it.split("=") }
                .forEach { if (it[1].isBlank()) println("${it[0]} : not found")
                else println("${it[0]} : ${it[1]}") }
        println("password : ${queryParams.map { it.split("=") }
                                        .first { it[0] == "pass" }[1]}")
    } else {
        queryParams.map { it.split("=") }
                .forEach { if (it[1].isBlank()) println("${it[0]} : not found")
                            else println("${it[0]} : ${it[1]}") }
    }

}

private fun queryParameterExists(params: List<String>, param: String): Boolean {
    return params.any { it.split("=")[0] == param }
}