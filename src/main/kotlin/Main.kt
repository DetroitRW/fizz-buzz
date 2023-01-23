import java.util.Scanner

fun main(args: Array<String>) {
    while (true) {
        print("Введите Число: ")
        val reader = Scanner(System.`in`)
        val number = reader.nextInt()
        if (number % 3 == 0 && number % 5 == 0) {
            println("Fizz Buzz")
        } else if (number % 3 == 0) {
            println("Fizz")
        } else if (number % 5 == 0) {
            println("Buzz")
        } else {
            println(number)
        }
    }
}



