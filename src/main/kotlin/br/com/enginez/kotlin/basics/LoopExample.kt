package br.com.enginez.kotlin.basics

fun main() {
    // Loops Example
    println("Loops Example")

    // 1. For loop
    println("For Loop:")
    for (i in 1..5) {
        println(i)
    }

    // 2. While loop
    println("\nWhile Loop:")
    var j = 1
    while (j <= 5) {
        println(j)
        j++
    }

    // 3. Do-While loop
    println("\nDo-While Loop:")
    var k = 1
    do {
        println(k)
        k++
    } while (k <= 5)

    // 4. For loop over ranges with step
    println("\nFor Loop over Ranges with Step:")
    for (l in 1..10 step 2) {
        println(l)
    }

    // 5. For loop over ranges in reverse order
    println("\nFor Loop over Ranges in Reverse Order:")
    for (m in 10 downTo 1) {
        println(m)
    }

    // 6. For loop over collections
    println("\nFor Loop over Collections:")
    val fruits = listOf("Apple", "Banana", "Orange")
    for (fruit in fruits) {
        println(fruit)
    }

    // 7. For loop with index
    println("\nFor Loop with Index:")
    val colors = listOf("Red", "Green", "Blue")
    for ((index, color) in colors.withIndex()) {
        println("Index: $index, Color: $color")
    }
}