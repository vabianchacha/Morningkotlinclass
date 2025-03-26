import java.util.Scanner

fun main() {
    var read = Scanner(System.`in`)
    println("Enter current room temperature:")
    var temperature = read.nextInt()

    if (temperature <25){
        println("It is hot")
    }
    else{
        println("it is cool")
    }
}