fun main() {
    val totalSeconds = System.currentTimeMillis() / 1000 // dont change this line
    // enter your code

    var secondsToday = totalSeconds % 86400
    val currentHour = secondsToday / 3600
    val currentMinute = (secondsToday % 3600) / 60
    val currentSeconds = ((secondsToday % 3600) % 60) % 60

    println("$currentHour:$currentMinute:$currentSeconds")


//    println("$hours:$minutes:$seconds")
}