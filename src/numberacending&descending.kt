import java.util.Scanner

fun main() {
    var read = Scanner(System.`in`)

    println("Enter first number:")
    var first =read.nextInt()
    println("Enter second number:")
    var second =read.nextInt()
    println("Enter third number:")
    var third =read.nextInt()

    if (first<second)
        println(second<third)
    else{
        println(third)
    }

}