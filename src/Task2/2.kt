package Task2

fun members(vararg number: Int) {

    for (i in number) {
        if (i % 2 == 0) {
            println("($i)")
        }
    }

}

fun main() {
    members(1,2,3,4,5,6,7,8,9,10)
}