fun main() {
    printHello() // Hello!
    printHelloTwo() // Hello Two!
    sayHello("Kotlin") // Hello, Kotlin!
    println(getHello(name="World")) // Hello, World!

    // Generic type function
    fun <T> genericType(value: T) {
        println(value)
    }
    genericType<String>("Generic")
    genericType<Int>(10)
    genericType("Another string")

    // Higher order function
    higherOrderFunction()
}

fun printHello() {
    println("Hello!")
}

fun printHelloTwo() = println("Hello Two!")

fun sayHello(name: String) {
    println("Hello, $name!")
}

fun getHello(name: String) : String {
    return "Hello, $name!"
}

// Higher-order function
fun higherOrderFunction(func: (String) -> String = {str -> str.uppercase()}) {
     println(func("Test"))
}