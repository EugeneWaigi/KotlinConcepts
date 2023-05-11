//Parent/superclass
open class Shape{
    open fun draw(){
        println("Drawing Shape")

    }

}
// child/sub class
class Circle:Shape(){
    override fun draw(){
        println("Drawing a circle")
    }
}
class Square:Shape(){
    override fun draw(){
        println("Drawing a square")
    }
}
class Triangle:Shape(){
    override fun draw(){
        println("Drawing a triangle")
    }
}

fun main(args: Array<String>) {
    val shapes:Array<Shape> = arrayOf(Circle(),Square(),Triangle())
    for (shape in shapes){
        shape.draw()
    }
}