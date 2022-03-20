/**
 * Notes:
 * This is a source code for the introductory Kotlin sample exercise about building your first android app
 * from the official Android App Development tutorial.
 *
 * Link to tutorial:
 * https://developer.android.com/codelabs/build-your-first-android-app-kotlin#0
 *
 * Program Description:
 * This program prints a border above and below the text "Happy Birthday, {name}!".
 * It also prints an ASCII art of a cake with width based on the user input's age
 */

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

/**
 * This function prints the cake top that separates the cake candles from
 * the cake layers with width of cake based on the age
 */
fun printCakeTop (age: Int) {
    repeat(age + 2) {
        print("=")
    }
    println()
}

/** 
 * This function prints the layers of the cake with width based on the age given.
 * It also prints a specified amount of cake layer.
 */
fun printCakeBottom(age: Int, layers: Int) {
    repeat(layers) {
        repeat(age + 2) {
            print("@")
        }
        println()
    }    
}

// Start program
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
} // End progran
