package Task3

fun place(vararg address: String) {

    println("nah ini tempat belajar coding yang keren:")

    for (i in address) {
        println(i)
    }

}

fun main() {
    place("Udacoding","Tempat2","Tempat3","Tempat4","Tempat5")
}