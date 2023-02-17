fun main() {
    // Example 1
    fun <T> MutableList<T>.swap(index1: Int, index2: Int) {
        val temp = this[index1]
        this[index1] = this[index2]
        this[index2] = temp
    }
    val list = mutableListOf("Item 1", "Item 2", "Item 3")

    println("List -> $list")
    list.swap(0, 2)
    println("List -> $list")

    // Example 2
    fun String.snakeCase(): String {
        return this.lowercase().replace(" ", "_")
    }

    val moduleName = "IO Kotlin Module Name"
    println(moduleName.snakeCase())
}