import kotlin.math.exp
import kotlin.math.sqrt

fun main(args: Array<String>) {
    Hesabu()
    println(sqrt(45.20))
    println(exp(50.80))
    Myfunction( "Eugene", 88, "Westlands", "Nairobi" ,11)
}
fun Myfunction(fname:String,Age:Int,home:String, Work:String,Time:Int){

    println("My First name is $fname and I'm $Age years old.I live in $home.I work at $Work and i leave my house at $Time am.")
}