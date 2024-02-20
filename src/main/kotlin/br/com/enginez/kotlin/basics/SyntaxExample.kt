package br.com.enginez.kotlin.basics

fun main() {
    val syntax = SyntaxExample()
    syntax.thisIsAFunction()
    println(syntax.thisIsAFunctionWithReturn())
    syntax.onCallback()
    SyntaxExample.thisIsAStaticFunction()
    println(SyntaxExample.SOME_CONSTANT)
}

class SyntaxExample : Callback, OtherClass("Some name") {
    fun thisIsAFunction() {
        println("This is a function") // where is the ;? It's optional =)
        // commentaries are started with // or /* */ like Java
        val list = listOf(
            1,
            2,
            3,
            4,
            5,
            15,
            20,
            30, //Heyy! I can put a comma here =o
        ).toTypedArray().toList().map { it * 2 }.filter { it > 2 }.all { it < 20 }
        println(list)
    }

    fun thisIsAFunctionWithReturn(): String {
        return "This is a function"
    }

    override fun onCallback() {
        println("This is a interface implemented method")
    }

    companion object {
        const val SOME_CONSTANT = "This is a static variable"
        fun thisIsAStaticFunction() {
            println("This is a static function")
        }
    }
}

open class OtherClass(
    val name: String? = null
)

interface Callback {
    fun onCallback()
}