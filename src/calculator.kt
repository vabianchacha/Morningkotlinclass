import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("Welcome to the Kotlin Calculator!")
    println("Please select an operation:")
    println("1. Add")
    println("2. Subtract")
    println("3. Multiply")
    println("4. Divide")



    print("Enter first number: ")
    val num1 = scanner.nextDouble()

    print("Enter choice (1/2/3/4): ")
    val choice = scanner.nextInt()

    print("Enter second number: ")
    val num2 = scanner.nextDouble()

    when (choice) {
        1 -> println("Result: ${num1 + num2}")
        2 -> println("Result: ${num1 - num2}")
        3 -> println("Result: ${num1 * num2}")
        4 -> {
            if (num2 != 0.0) {
                println("Result: ${num1 / num2}")
            } else {
                println("Error: Division by zero is not allowed!")
            }
        }
        else -> println("Invalid choice!")
    }
}
