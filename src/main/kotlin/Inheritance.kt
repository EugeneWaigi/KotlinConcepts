open class Wazazi{
    val mama="She likes Cooking"
    val baba="He likes watching Football"
}
class boy:Wazazi(){
    fun mvulana(){
        println(baba)
    }
}


class girl:Wazazi(){
    fun msichana(){
        println(mama)
    }

}

fun main(args: Array<String>) {
    val kijanaobj=boy()
    kijanaobj.mvulana()

    val msichanaobj=girl()
    msichanaobj.msichana()



}