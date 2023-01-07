fun main() {    
    // write your code here
    println(when (readln()) {
        "rectangle" -> areaRectangle(readln().toDouble(),readln().toDouble())
        "triangle" -> areaTriangle(readln().toDouble(),readln().toDouble(), readln().toDouble())
        "circle" -> areaCircle(readln().toDouble())
        else -> ""
    })
}

fun areaRectangle(a: Double, b: Double): Double {
    return a*b
}

fun areaTriangle(a: Double, b: Double, c: Double): Double {
    return kotlin.math.sqrt((a + b + c) / 2 * ((a + b + c) / 2 - a) * ((a + b + c) / 2 - b) * ((a + b + c) / 2 - c))
}

fun areaCircle(r: Double): Double {
    return 3.14*r*r
}