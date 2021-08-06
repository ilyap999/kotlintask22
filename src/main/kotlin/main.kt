fun main() {
    val likes = 5491
    var printEndingOption = false
    // Если printEndingOption = true, тогда "человеку", иначе "людям"
    if (likes == 1) {
        printEndingOption = true
    } else if (likes > 20) {
        var lastDigit = likes % 10
        var penultimateDigit = likes / 10 % 10
        if (lastDigit == 1 && penultimateDigit != 1) {
            printEndingOption = true
        }
    }
    if (printEndingOption) {
        println("Понравилось $likes человеку")
    } else {
        println("Понравилось $likes людям")
    }
}