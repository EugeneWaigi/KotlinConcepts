class Stubborn{
    var nambari:Int=31

    fun calculate():Int{
       return nambari *nambari

    }

}

fun main(args: Array<String>) {
    //this is an object
    val myobje=Stubborn()
    println(myobje.calculate())
    val myobject=Emobilis()
    println(myobject.hesabu())
}

class Emobilis{
    var num:Int=6
    //number function
    fun hesabu():Int{
        return num*num
    }
}