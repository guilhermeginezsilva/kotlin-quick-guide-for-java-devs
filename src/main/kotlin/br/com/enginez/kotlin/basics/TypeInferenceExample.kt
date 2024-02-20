package br.com.enginez.kotlin.basics

import java.util.*

fun main() {
    // Type Inference Example
    println("Type Inference Example")

    // Explicitly specifying the type
    val explicitString: String = "Hello"

    // Type inference - the type is inferred automatically
    val inferredString = "Hello, Kotlin!"

    // Type inference with function return type
    val length = getLength("Kotlin")

    // Displaying results
    println("Explicitly specified type: $explicitString")
    println("Inferred type: $inferredString")
    println("Length of 'Kotlin': $length")

    // Type Inference Example with Instanceof Check
    println("Type Inference Example with Instanceof Check")

    val anyObject: Any = "Hello, Kotlin!"

    // Checking if anyObject is a String instance
    if (anyObject is String) {
        // Type inference after instanceof check
        val inferredAfterCheck = anyObject.uppercase(Locale.getDefault()) // Where is the cast?? It's optional as we've already checked it in the if =) LoL

        // Displaying result
        println("Inferred type after instanceof check: $inferredAfterCheck")
    }
}

// Function to demonstrate type inference with return type
fun getLength(text: String) = text.length