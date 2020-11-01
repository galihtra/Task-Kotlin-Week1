package Task1

fun add(value1: Double, value2: Double): String {
    val total =  value1 + value2
    return "hasil dari $value1 + $value2 = $total "
}

fun main() {
    val math = add(10.0,40.0)
    println(math)
}