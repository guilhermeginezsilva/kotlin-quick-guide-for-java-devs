package br.com.enginez.kotlin.basics

fun main() {
    // Conditions Example
    println("Conditions Example")

    // 1. If-else statement
    val number = 10
    if (number > 0) {
        println("$number is positive")
    } else if (number < 0) {
        println("$number is negative")
    } else {
        println("$number is zero")
    }

    // 2. When expression (alternative to switch in Java)
    val dayOfWeek = 3
    val dayName = when (dayOfWeek) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid day"
    }
    println("Day of week: $dayName")

    // 3. Using 'in' operator with when expression
    val hourOfDay = 15
    val timeOfDay = when (hourOfDay) {
        in 0..11 -> "Morning"
        in 12..17 -> "Afternoon"
        in 18..23 -> "Evening"
        else -> "Invalid hour"
    }
    println("Time of day: $timeOfDay")

    // 4. Using 'is' operator for type checks
    val anyObject: Any = "Hello"
    val objectType = when (anyObject) {
        is String -> "String"
        is Int -> "Int"
        is Double -> "Double"
        else -> "Unknown type"
    }
    println("Type of object: $objectType")

    // 5. Conditional expression (ternary operator)
    val x = 10
    val y = 20
    val max = if (x > y) x else y
    println("Maximum value: $max")

    // 6. Using 'when' expression with multiple conditions
    val number2 = 10
    when {
        number2 > 0 -> println("$number2 is positive")
        number2 < 0 -> println("$number2 is negative")
        else -> println("$number2 is zero")
    }

    // 7. Conditions Example with Return
    println("Conditions Example with Return")

    // 1. Function with conditional return
    val newNumber = 10
    val result = checkNumber(number)
    println("Result: $result")

    // 2. Function with conditional return using when expression
    val newX = 10
    val newY = 20
    val newMax = getMax(newX, newY)
    println("Maximum value: $newMax")
}

fun checkNumber(number: Int): String {
    return if (number > 0) {
        "Positive"
    } else if (number < 0) {
        "Negative"
    } else {
        "Zero"
    }
}

fun getMax(x: Int, y: Int): Int {
    return when {
        x > y -> x
        else -> y
    }
}