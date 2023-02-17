fun main() {
    val rows: Int = 10
    var n: Int = 0
    for (i in 1..rows) {
        if (i % 2 != 0) {
            println(" ".repeat((rows - i) + n) + "*".repeat(i))
            n += 1
        }
    }
}