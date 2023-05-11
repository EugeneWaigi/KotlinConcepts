open class Animal(colour: String, age: Int) {
    init {
        println("Color is: $colour.")
        println("Age is: $age")
    }
}
class Dog(colour: String, age: Int): Animal(colour,age){

    fun woof() {
        println("Dog makes sound of woof")
    }
}
class Cat(colour: String, age: Int): Animal(colour,age) {

    fun meow() {
        println("Cat makes sound of meow")
    }
}
class Horse(colour: String, age: Int): Animal(colour,age) {
    fun neigh(){
        println("Horse makes sound of neigh")
    }
}
class Rabbit(colour: String, age: Int): Animal(colour,age) {
    fun whispers(){
        println("Rabbit makes sound of whispers")
    }
}

fun main(args: Array<String>) {
    val d =Dog("White",15)
    d.woof()
    val c =Cat("Black",2)
    c.meow()
    val h =Horse("Brown",10)
    h.neigh()
    val r =Rabbit("Red",11)
    r.whispers()
}