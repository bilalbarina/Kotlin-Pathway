fun main() {
    val productManager: ProductManager = ProductManager()

    while (true) {
        print("\nPlease choose an option - `help` for more information: ")
        val args: List<String>? = readLine()?.split(" ")

        if (args == null) {
            println("No option found")
            continue
        }

        when (args[0]) {
            "list" -> productManager.listProducts()
            "add" -> productManager.add(args[1])
            "edit" -> productManager.edit(args[1], args[2])
            "del" -> productManager.delete(args[1])
            "help" -> help()
            "exit" -> break
            else -> println("No option found")
        }
    }
}

class ProductManager {
    private val products: MutableList<Product> = mutableListOf()

    fun listProducts() {
        if (this.products.isEmpty()) {
            println("No products found.")
            return
        }

        println(this.products.joinToString { it.name })
    }

    fun add(name: String) {
        if (this.products.find { it.name == name } != null) {
            println("Product already exists.")
            return
        }

        this.products.add(
            Product(name)
        )
        println("Product added successfully.")
    }

    fun edit(name: String, newName: String) {
        val elemIndex: Int = this.products.indexOfFirst {it.name == name}
        this.products[elemIndex].name = newName
        println("Product updated successfully.")
    }

    fun delete(name: String) {
        val elemIndex: Int = this.products.indexOfFirst { it.name == name }
        this.products.removeAt(elemIndex)
        println("Product deleted successfully.")
    }
}

data class Product(var name: String)

val helpText: String = """
        You can use this options:
        -list: List all products.
        -add {name}: To create a new product.
        -edit {name} {new_name}: To update a product.
        -del {name}: To delete a product.
        -exit: Exit the program.
    """.trimIndent()

fun help() {
    println(helpText)
}