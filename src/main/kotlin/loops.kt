fun main(args: Array<String>) {
    // this is a for loop


    for(i in 5..12){
        println("Loop : $i")

    }
    val myarr= arrayOf("ab","bc","cd" ,"ef","gh",)

    for (n in myarr){
        println(n)
    }
    //this is a while loop

    var num=10

    while (num>=0){
        println("Loop : $num ")
        num--
    }
    var num2 =29

    while(num2>=15){
        println("Loop : $num2")
        num2--

    }
// do while loop

    var num3 =106
    do{
        println("Loop: $num3")
        num3++
    } while (num3<=105)



}