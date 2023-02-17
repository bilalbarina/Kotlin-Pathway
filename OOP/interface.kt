interface Named {
    val name: String?
}

class Person(firstName: String , lastName: String) : Named {
    override val name = "$firstName $lastName"
}

interface A {
    fun foo() { print("A") }
    fun bar()
}

interface B {
    fun foo() { print("B") }
    fun bar() { print("bar") }
}

class C : A {
    override fun bar() { print("bar") }
}

class D : A, B {
    override fun foo() {
        super<A>.foo()
        super<B>.foo()
    }

    override fun bar() {
        super<B>.bar()
    }
}

fun main() {
    val person = Person("John", "Doe")
    println(person.name)
}