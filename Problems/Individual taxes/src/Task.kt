import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val countriesCount = scanner.nextInt()
    val incomes = IntArray(countriesCount)
    val taxPercentage = DoubleArray(countriesCount)
    for (i in incomes.indices) {
        incomes[i] = scanner.nextInt()
    }
    for (i in taxPercentage.indices) {
        taxPercentage[i] = scanner.nextDouble()
    }
    var maxTaxesCountryIndex = -1
    var maxTaxes = Double.MIN_VALUE
    for (i in incomes.indices) {
        if (incomes[i] * taxPercentage[i] / 100 > maxTaxes) {
            maxTaxes = incomes[i].toDouble() * taxPercentage[i] / 100
            maxTaxesCountryIndex = i + 1
        }
    }
    println(maxTaxesCountryIndex)
}