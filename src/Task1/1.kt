package Task1

fun sayHello(firstname: String, lastname: String): String {
    return "nama saya adalah $firstname $lastname"
}

fun main() {
    val name = sayHello("galih","tri risky andiko")
    println(name)
}