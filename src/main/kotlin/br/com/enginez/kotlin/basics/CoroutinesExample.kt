package br.com.enginez.kotlin.basics
import kotlinx.coroutines.*

fun main() {
    // Coroutines Example
    println("Coroutines Example")

    // 1. Launching a coroutine with runBlocking
    runBlocking {
        launch {
            delay(1000L) // Suspends the coroutine for 1 second (non-blocking)
            println("World!")
        }
        println("Hello,")
        delay(2000L) // Suspends the main thread for 2 seconds (non-blocking)
    }

    // 2. Using async and await to perform asynchronous operations
    runBlocking {
        val result1 = async {
            delay(1000L)
            1
        }
        val result2 = async {
            delay(1000L)
            2
        }
        val sum = result1.await() + result2.await()
        println("Sum: $sum")
    }

    // 3. Handling exceptions in coroutines
    runBlocking {
        val job = launch {
            try {
                delay(Long.MAX_VALUE) // Coroutine runs indefinitely
            } finally {
                println("Coroutine cancelled")
            }
        }
        delay(1000L) // Delay to allow the job to execute
        job.cancel() // Cancel the job
    }

    // 4. Coroutine context and dispatchers
    runBlocking {
        launch(Dispatchers.Default) {
            println("Coroutine running in Default dispatcher: ${Thread.currentThread().name}")
        }
        launch(Dispatchers.IO) {
            println("Coroutine running in IO dispatcher: ${Thread.currentThread().name}")
        }
        launch(newSingleThreadContext("MyThread")) {
            println("Coroutine running in new thread: ${Thread.currentThread().name}")
        }
    }
}