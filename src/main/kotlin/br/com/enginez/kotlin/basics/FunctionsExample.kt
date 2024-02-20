package br.com.enginez.kotlin.basics

fun main() {
    // Ways of Creating Functions and Methods Example
    println("Ways of Creating Functions and Methods Example")

    // 1. Regular function
    fun greet(name: String): String {
        return "Hello, $name!"
    }
    println(greet("John"))

    // 2. Single-expression function
    fun greetSingle(name: String): String = "Hello, $name!"
    println(greetSingle("Jane"))

    // 3. Function with default parameter
    fun greetDefault(name: String = "Guest"): String = "Hello, $name!"
    println(greetDefault())

    // 4. Function with variable number of arguments (varargs)
    fun greetMany(vararg names: String): String {
        return "Hello, ${names.joinToString(", ")}!"
    }
    println(greetMany("Alice", "Bob", "Charlie"))

    // 5. Lambda function
    val square: (Int) -> Int = { number -> number * number }
    println("Square of 5: ${square(5)}")

    // 6. Anonymous function
    val cube = fun(number: Int): Int {
        return number * number * number
    }
    println("Cube of 3: ${cube(3)}")
}
