package Task4

fun testScore(examValue: Int) {

    when {
        examValue < 60 -> println("Tidak Lulus")
        examValue in 60..80 -> println("Memuaskan")
        examValue in 81..90 -> println("Sangat Memuaskan")
        examValue in 91..100 -> println("Terpuji")
        else -> println("nilai tidak valid")
    }

}

fun main() {
    testScore(100)
}