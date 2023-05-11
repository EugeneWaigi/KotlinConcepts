import java.util.Scanner

fun main() {
    val input =Scanner(System. `in` )

    print("Enter the first number")
    val nambari1 = input.nextInt()

    print("Enter the second number: ")
    val nambari2 = input.nextInt()

    print("Enter the operation (+,-, *, /): ")
    val operation = readln()

    val result = when (operation){
        "+" -> nambari1 + nambari2
        "-" -> nambari1 - nambari2
        "*" -> nambari1 * nambari2
        "/" -> nambari1 / nambari2

        else ->{
            println("Invalid operation")
            return
        }

    }
    println("Result: $result")

}