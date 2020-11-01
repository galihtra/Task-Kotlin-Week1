package Task5

fun main() {

    val city = arrayOf("Jakarta","Jakarta","Padang","Solo","Padang","Bandung","Padang","Malang","Bali")

    var jakarta = 0
    var padang = 0
    var solo = 0
    var bandung = 0
    var malang = 0
    var bali = 0

    for (item in city) {
        if (item == "Jakarta") {
            jakarta = jakarta + 1
        } else if (item == "Padang") {
            padang = padang + 1
        } else if (item == "Solo") {
            solo = solo + 1
        } else if (item == "Bandung") {
            bandung = bandung + 1
        } else if (item == "Malang") {
            malang = malang + 1
        } else if (item == "Bali") {
            bali = bali + 1
        }
    }

    println("Jakarta: $jakarta")
    println("Padang: $padang")
    println("Solo: $solo")
    println("Bandung: $bandung")
    println("Malang: $malang")
    println("Bali: $bali")

}