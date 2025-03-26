import java.util.*

fun main() {
    var firstname ="Vabian"
    var lastname = "Chacha"
    var text = "Hello there"

    println(firstname)
    println(lastname)
    println(firstname+""+lastname) // String concatenation
    println(text[0])
    println(firstname.uppercase(Locale.getDefault()))
    println(lastname.lowercase(Locale.getDefault()))


    //string interpolation
    println(text+" Joe")
    println("my firstname is $firstname")
    println("my full name is $firstname $lastname")
}