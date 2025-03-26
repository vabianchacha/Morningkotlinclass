import java.util.Scanner

fun main() {
    var read =Scanner(System.`in`)
    println("Enter Day(number):")
    var day = read.nextInt()

    var result = when(day){
        1 -> ("monday")
        2 -> ("tuesday")
        3 -> ("wednesday")
        4 -> ("thursday")
        5 -> ("friday")
        6 -> ("saturday")
        7 -> ("sunday")
        else ->"Invalid day of the week"
    }
    println("The day of the week is: $result")
}