fun main(args: Array<String>) {
    print("Enter First Number : ")
    val num1= readln()?.toDouble()?:0.0
    print("Enter the second number : ")
    val num2= readln()?.toDouble()?:0.0

    print("Enter Operator (+,-,*,/)")
    val op= readln()
    val majibu= when (op){
        "+" -> num1+num2
        "-" -> num1-num2
        "*" -> num1*num2
        "/" -> num1/num2

        else -> {
            println("Invalid operator")
            0.0

        }
    }
    println("$num1 $op $num2 =$majibu")
}