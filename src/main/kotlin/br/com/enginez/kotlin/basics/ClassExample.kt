package br.com.enginez.kotlin.basics

fun main() {
    // Creating a class instance and calling getters, setters and also printing it
    println("Normal class example")
    val normalClassExample = NormalClassExample("Some name")
    normalClassExample.name = "Another name" // Like java Setter
    println(normalClassExample.name) // Like java Getter
    println(normalClassExample.age) // Like java Getter
    println(normalClassExample) // like java this will print the object reference when toString is called

    println("Normal class example 2")
    var normalClassExample2 = NormalClassExample2()
    println(normalClassExample2.name) // Like java Getter
    println(normalClassExample2.age) // Like java Gette
    println(normalClassExample)

    println("Data class example")
    // But, if we use data class, we don't need to implement toString, equals and hashCode
    val dataClassExample = DataClassExample("Some Other Data class cool naaamme", 20)
    //dataClassExample.name = "Another name" // This wont work, because we've used val instead of var
    println(dataClassExample.name) // Like java Getter
    println(dataClassExample.age) // Like java Getter
    println(dataClassExample) // Wow, now it's not printing the object reference, it's printing the object content, Coool!!

    val newDataClassInstanceWithnewName = dataClassExample.copy(name = "Name 4") // This will create a new object with the same content, but with the name changed
    println(newDataClassInstanceWithnewName)

    println("Lets clone the data class object and compare the hash codes and instances")
    val otherDataClassWithSameContent = dataClassExample.copy()

    println("Lets print the original and cloned data classes instances content")
    println(dataClassExample)
    println(otherDataClassWithSameContent)

    println("Are the objects the same?")
    println(dataClassExample == otherDataClassWithSameContent) // This will print true, because the content is the same, because hashcode and equals are implemented by default
    println("Hash codes are the same?")
    println(dataClassExample.hashCode())
    println(otherDataClassWithSameContent.hashCode())
    println("Object instances are the same?")
    println(dataClassExample.instanceId)
    println(otherDataClassWithSameContent.instanceId)

}

class NormalClassExample(
    // this is a constructor, easy haan?
    var name: String,
    var age: Int = 0 // This is a optional parameter, as we've set default value as 0
) {
    init {
        name = "Another name 2"
        println("This is a init block")
    }

    constructor(name: String, age: Int, anotherParam: String) : this(name, age) {
        println("This is a secondary constructor")
    }
}

class NormalClassExample2 {
    // this is a class attribute declaration without constructor, it is,
    // there is no constructor in this class with params, just the empty param constructor
    var name: String = "Cool name =)"
    var age: Int = 0 // We need to initialize the variable with default, otherwise it will not compile
}

data class DataClassExample(
    val name: String,
    val age: Int,
) {
    val instanceId: Int = System.identityHashCode(this)
}