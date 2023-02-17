fun main() {
    labeledLoop@ for (i in 0..5) {
        println("i - $i")
        for (j in 0..5) {
            println("j - $j")
            if (j == 5) break@labeledLoop
        }
    }

    foo()
}

fun foo() {
    listOf(1, 2, 3, 4, 5).forEach forEach@{
        if (it == 3) return@forEach // local return to the caller of the lambda - the forEach loop
        print(it)
    }
    print(" done with explicit label")
}