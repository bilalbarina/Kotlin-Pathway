fun main() {
    val items: Array<String> = arrayOf("Item 1", "Item 2", "Item 3")

    // For loop
    for (item in items) {
        println(item)
    }

    for (i in 0..2) {
        println(i)
    }

    for (i in 0..10 step 5) {
        println("Stepped 5 - $i")
    }

    for (i in 10 downTo  0) {
        println("Downto - $i")
    }

    // While loop
    var index: Int = 0
    while (index < items.size) {
        println("While loop - ${items[index]}")
        index++
    }

    // When
    println(getType("String"))
    println(getType(89))
    println(getType(1))
    println(getType(listOf("")))

    // Break
    for (i in 0..5) {
        if (i == 3) break
        println(i)
    }
}

// When
fun getType(value: Any) =
    when (value) {
        // !in order!
        1 -> "This is number one"
        is Int -> "This is an integer"
        is String -> "This is a string"
        else -> "No type found!"
    }