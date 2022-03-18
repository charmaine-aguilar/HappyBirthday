// This function prints the borders above and below the text
fun printBorder(length: Int) {
    repeat(length) {
        print("=")
    }
    println()
}

// This function prints the number of candles based on the age
fun printCakeCandles(age: Int) {
    print(" ")
    repeat(age) {
        print(",")
    }
    println()
    
    print(" ")
    repeat(age) {
        print("|")
    }
    println()
}

// This function prints the cake top based on the age
fun printCakeTop (age: Int) {
    repeat(age + 2) {
        print("=")
    }
    println()
}

/** This function prints the width of the cake based on the age given and prints
 * a specified amount of cake layer
 */
fun printCakeBottom(age: Int, layers: Int) {
    repeat(layers) {
        repeat(age + 2) {
            print("@")
        }
        println()
    }    
}

/**
 * This program prints a border above and below the text. It also prints
 * an ASCII art of a cake depending on the user input's age
**/

fun main() {
    val text = "Happy Birthday, Jhansi!"
    val age = 24
    val layers = 5
    
    printBorder(text.length)
    println(text)
    printBorder(text.length)
    
    printCakeCandles(age)
    printCakeTop(age)
    printCakeBottom(age, layers)
}
