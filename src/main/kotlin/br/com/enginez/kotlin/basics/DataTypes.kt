package br.com.enginez.kotlin.basics

fun main() {
    val shortType: Short = 10
    val intType: Int = 10
    val longType: Long = 10L
    val floatType: Float = 10.0f
    val doubleType: Double = 10.0

    val stringType: String = "This is a string"
    val charType: Char = 'A'

    val byteType: Byte = 0b00001010
    val booleanType: Boolean = true

    val arrayType: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    val listType: List<Int> = listOf(1, 2, 3, 4, 5)
    val mutableListType: List<Int> = mutableListOf(1, 2, 3, 4, 5)
    val mapType: Map<Int, String> = mapOf(1 to "One", 2 to "Two", 3 to "Three")

    val anyType : Any = "This is a string" // Any is like Object in Java
}

fun voidMethod1() {
    println("This is a void method")
}

fun voidMethod2(): Nothing {
    throw Exception("This is a Nothing method")
}

// Generics Example
class Example<T> {
    fun exampleMethod(t: T) {
        println(t)
    }
}

class Example2 {
    fun <T> exampleMethod(t: T) {
        println(t)
    }
}
