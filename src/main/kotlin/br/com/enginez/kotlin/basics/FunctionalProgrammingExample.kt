package br.com.enginez.kotlin.basics

fun main() {
    // Functional Programming Concepts in Kotlin
    println("Functional Programming Concepts in Kotlin")

    // 1. Immutable variables (val)
    val immutableValue = 10
    // immutableValue = 20 // Error: Val cannot be reassigned

    // 2. Higher-order functions
    val numbers = listOf(1, 2, 3, 4, 5)
    val squares = numbers.map { it * it } // Using higher-order function 'map'
    println("Squares: $squares")

    // 3. Function types
    val square: (Int) -> Int = { number -> number * number }
    println("Square of 6: ${square(6)}")

    // 4. Lambdas
    val numbersGreaterThanThree = numbers.filter { it > 3 } // Using lambda expression
    println("Numbers greater than three: $numbersGreaterThanThree")

    // 5. Anonymous functions
    val add: (Int, Int) -> Int = fun(a, b): Int {
        return a + b
    }
    println("Sum of 3 and 5: ${add(3, 5)}")

    // 6. Closures
    val initial = 10
    val addValue = { value: Int -> value + initial } // Closure capturing 'initial'
    println("Result of closure: ${addValue(5)}")

    // 7. Recursion
    fun factorial(n: Int): Int {
        return if (n <= 1) 1 else n * factorial(n - 1)
    }
    println("Factorial of 5: ${factorial(5)}")
}
