fun main() {
    // write your code here
    val range1 = (readLine()!!.toInt())..(readLine()!!.toInt())
    val range2 = (readLine()!!.toInt())..(readLine()!!.toInt())
    val i = readLine()!!.toInt()
    println(i in range1 || i in range2)
}