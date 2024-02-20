package br.com.enginez.kotlin.basics

data class Person2(var name: String, var age: Int)

fun main() {
    // Scoped Functions Example
    println("Scoped Functions Example")

    // Creating a person object
    val person = Person2("Alice", 30)

    // 1. let - Executes the given block of code with the object as an argument and returns the result of the block
    val letResult = person.let {
        println("Let: $it")
        it.age += 1
        it.name.uppercase()
    }
    println("Result of let: $letResult")

    // 2. run - Executes the given block of code with the object as the receiver and returns the result of the block
    val runResult = person.run {
        println("Run: $this")
        this.age += 1
        this.name.uppercase()
    }
    println("Result of run: $runResult")

    // 3. with - Executes the given block of code with the object as the receiver and returns the result of the block
    val withResult = with(person) {
        println("With: $this")
        this.age += 1
        this.name.uppercase()
    }
    println("Result of with: $withResult")

    // 4. apply - Executes the given block of code with the object as the receiver and returns the object itself
    val applyResult = person.apply {
        println("Apply: $this")
        this.age += 1
        this.name = this.name.uppercase()
    }
    println("Result of apply: $applyResult")

    // 5. also - Executes the given block of code with the object as an argument and returns the object itself
    val alsoResult = person.also {
        println("Also: $it")
        it.age += 1
        it.name = it.name.uppercase()
    }
    println("Result of also: $alsoResult")
}