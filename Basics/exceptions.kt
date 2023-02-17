fun main() {
    try {
        throw Exception("Test - throwing an exception")
    } catch (e: Exception) {
        println("Catch: " + e.message)
    } finally {
        // optional finally block
    }
}