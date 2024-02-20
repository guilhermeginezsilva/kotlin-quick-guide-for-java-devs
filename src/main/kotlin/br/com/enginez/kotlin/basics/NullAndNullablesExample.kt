package br.com.enginez.kotlin.basics

fun main() {
    // Nullable Attributes and Null Checks Example with Classes
    println("Nullable Attributes and Null Checks Example with Classes")

    // Creating an instance of a class with nullable and non-nullable attributes
    val person1 = Person("John", "Doe", 30) // non-nullable attributes must be set
    val person2 = Person("David", null, null) // nullable attributes can be set to null
    val person3 = Person(name = "Stuart", age = null) // named parameters can be used to set only some attributes

    println(person1)
    println(person2)
    println(person3)

    // Look how named paremeters is awesome, you can set only the attributes you want
    // also you can set them in any order
    // furthermore if the class fields declaration change, you don't need to change the code
    // this is a good practice to use named parameters
    // It can also be used for functions parameters
    val person4 = Person(age = 25, name = "Maria") // Look that age is nullable, but as it doesnt have a default, it must be set
    println(person4)

    // Important to note that you cant set a nullable variable to a non-nullable variable
    val otherPerson = PersonWithNullableName(name = null, age = 25)
    val otherPerson2 = PersonWithNullableName(name = "Set Name", age = 25)

    //Person(name = otherPerson.name, age = otherPerson.age) // this will not compile
    //Person(name = otherPerson2.name, age = otherPerson2.age) // Neither this one, even if name is set

    //How to deal with it?
    println(Person(name = otherPerson.name ?: "Default Name", age = otherPerson2.age)) // This one will create a Person with default name
    println(Person(name = otherPerson2.name ?: "Default Name", age = otherPerson2.age)) // And this one will create a Person with the name set

    // We can tell Kotlin to ignore null Check, but we need to guarantee that the value will be set
    // Otherwise, it will throw a NullPointerException if variable is null
    try {
        // Trying to access a nullable attribute without a null check
        println("Length of otherPerson's name: ${otherPerson.name!!.length}")
    } catch (e: Exception) {
        println("An exception occurred: $e")
    }
    // Again ignoring null check, but now we are sure that the value is set
    println("Length of otherPerson's name: ${otherPerson2.name!!.length}")

    // Other way of dealing with it is doing null check before accessing the value
    if(otherPerson.name != null) {
        Person(name = otherPerson.name, age = otherPerson.age) // Now the same code that didn't compile before, will compile,
                                                                // because kotlin understands that this line will only be reached
                                                                // if the variable isnt null, so it wont force you to do a null handling
    }

    // Now we will go through null check possibilities and also elvis operator
    println("Null Checks and Elvis Operator Example")

    val nullableString: String? = null

    // Performing a null check using if-else statement
    if (nullableString != null) {
        println("Length of nullableString: ${nullableString.length}")
    } else {
        println("nullableString is null!")
    }

    // Performing a null check using the safe call operator (?.)
    println("Length of nullableString: ${nullableString?.length}")

    // Using the Elvis operator (?:) to provide a default value if the variable is null
    val nonNullString = nullableString ?: "Default Value"
    println("Value of nonNullString: $nonNullString")

    // We can also throw an exception if the value is null
    try {
        val nonNullString2 = nullableString ?: throw IllegalArgumentException("Value cannot be null")
    } catch (e: Exception) {
        println("An exception occurred: $e")
    }
}

// Define a Person class with nullable and non-nullable attributes
data class Person(
    val name: String, // as this is not nullable field, it must be set
    val surname: String? = null, // when field is nullable and default is set, it can be omitted
    val age: Int? // when field is nullable and default isnt set, it must be set
)

data class PersonWithNullableName(
    val name: String?, // as this is not nullable field, it must be set
    val surname: String? = null, // when field is nullable and default is set, it can be omitted
    val age: Int? // when field is nullable and default isnt set, it must be set
)