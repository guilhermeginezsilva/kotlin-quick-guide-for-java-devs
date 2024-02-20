package br.com.enginez.kotlin.basics

fun main() {
    println("in kotlin we can do things like:")
    val name = "John"
    val surname = "Doe"
    val age = 30
    println("$name $surname is $age years old") // this is useful for exception messages, queries creation....
    println("Message: ${createMessage(name, surname, age)}") // we can create code blocks too
    println(name + " " + surname + " is " + age + " years old") // this also works, buuttt =/
    println(name.plus(" ").plus(surname).plus(" is ").plus(age).plus(" years old")) // this is the same as the previous one, but we can use the plus method to concatenate strings

    println(name == "John") // true, we can compare strings like this
    println(name.equals("John")) // true, we can compare strings like this too, but intellij will sugest the first one

    println(name.matches(Regex("Jo.*"))) // true, we can use regex to match strings'
    println(name.replace("Jo", "Lo")) // Lohn, we can replace strings too
    println(name.replace(Regex("(.*?h)"), "Lo")) // Regex can be used too, but in Kotlin we always need to instance a Regex object
    println(name.replace("jo", "lo", true)) // John, we can ignore case when replacing strings
    println(name.replace("jo", "lo", false)) // This one wont replace
}

fun createMessage(name: String, surname: String, age: Int): String {
    return "$name $surname is $age years old"
}
