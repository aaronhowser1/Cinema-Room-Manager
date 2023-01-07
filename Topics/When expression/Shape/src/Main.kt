fun main(args: Array<String>) {
    val input = readLine()!!.toInt()

    if (input in 1..4) {
        println("You have chosen a ${
            when (input) {
                1 -> "square"
                2 -> "circle"
                3 -> "triangle"
                else -> "rhombus"
            }
        }")
    } else {
        println("There is no such shape!")
    }
}