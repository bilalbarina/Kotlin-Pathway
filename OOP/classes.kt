fun main() {
    class Person(val name: String) {
        val children: MutableList<Person> = mutableListOf()
        constructor(name: String, parent: Person) : this(name) {
            parent.children.add(this)
        }
    }

    val adam = Person("Adam")
    println("Person 1 Name: ${adam.name}")

    val ali = Person("Ali", adam)
    println("Person 2 Name: ${ali.name}")
    println("Person 1 Children 1 Name: ${adam.children[0].name}")

    println("\n=== Example 2 ===")
    open class Phone() {
        var batteryLevel: Int = 100
    }

    class Iphone(): Phone() {
        init {
            println("My battery level is ${this.batteryLevel}%")
        }
    }

    Iphone()

    // Abstract class
    abstract class Polygon {
        abstract fun draw()
    }

    class Rectangle : Polygon() {
        override fun draw() {
            // draw the rectangle
        }
    }

    println("\n=== Example 3 ===")
    // Setters and Getters
    class Object() {
        var name: String = "Adam"
            get() = field.toString()
            set(value) {
                field = value
            }
    }

    val obj = Object()
    println(obj.name)
    obj.name = "John"
    println(obj.name)

    // Data classes
    data class User(val name: String?, val age: Int = 0)

    val user = User(
        "Bilal",
        19
    )

    println("Data class - User: $user")

    println("\n=== Example 4 ===")

    class Box<T>(val item: T) {}
    val box: Box<Int> = Box(3)
    println("box: ${box.item}")
}