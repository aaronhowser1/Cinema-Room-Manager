fun main() {
    // write your code here
    val numberOfCompanies = readLine()!!.toInt()
    val companyIncomes = mutableListOf<Int>()
    val companyTaxes = mutableListOf<Int>()

    val paidTaxes = mutableListOf<Int>()

    for (i in 0 until numberOfCompanies) {
        companyIncomes.add(readLine()!!.toInt())
    }
    for (i in 0 until numberOfCompanies) {
        companyTaxes.add(readLine()!!.toInt())
    }

    for (i in 0 until numberOfCompanies) {
        paidTaxes.add(companyIncomes[i]*(companyTaxes[i]))
    }
    println(paidTaxes.indexOf(paidTaxes.maxOrNull())+1)
}