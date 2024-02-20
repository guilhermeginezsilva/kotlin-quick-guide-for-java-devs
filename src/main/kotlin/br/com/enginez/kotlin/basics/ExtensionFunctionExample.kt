package br.com.enginez.kotlin.basics

fun main() {
    // Creating an instance of a class and demonstrating the use of extension functions
    println("Extension Functions Example")

    val text = "Hello"
    println(text.addExclamation()) // Using the extension function to add an exclamation mark
    println(text.reverse()) // Using the extension function to reverse the string
}

// Define an extension function to add an exclamation mark to a String
fun String.addExclamation(): String {
    return "$this!"
}

// Define an extension function to reverse a String
fun String.reverse(): String {
    return this.reversed()
}