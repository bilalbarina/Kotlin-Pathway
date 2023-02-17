fun main() {
    val array = Array(5) {i -> i}
    println("Generated Array - " + array.contentToString())

    val items = arrayOf("Item 1", "Item 2", "Item 3")
    println("Array of items - " + items.contentToString())

    val arrayOfNulls = arrayOfNulls<String>(5)
    println("Array of Nulls - " + arrayOfNulls.contentToString())

    val emptyArray = emptyArray<String>()
    println("Empty array - ${emptyArray.contentToString()}")

    val arr = arrayListOf<String>("Item 1")
    arr.add("Item 2")
    println("Arr - $arr")

    val arr2 = mutableListOf("Item 1")
    arr2.add("Item 2")
    println("Arr2 - $arr2")
}