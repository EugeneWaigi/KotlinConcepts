class Students(val name:String,var gender:String,val age:Int){



}

fun main(args: Array<String>) {
    val myobj=Students("Eugene","Male",66)
    val myobj2=Students("Elsie","Female", 7)
    val myobj3=Students("Carrie","Female",44)
    val myobj4=Students("Chelsea","Female",33)
    val myobj5=Students("Tom","Male",10)
    println("Student Name is ${myobj.name} and he is a ${myobj.gender} of ${myobj.age} years old.")
    println("Student Name is ${myobj2.name} and she is a ${myobj2.gender} of ${myobj2.age} years old.")
    println("Student Name is ${myobj3.name} and she is a ${myobj3.gender} of ${myobj3.age} years old.")
    println("Student Name is ${myobj4.name} and she is a ${myobj4.gender} of ${myobj4.age} years old.")
    println("Student Name is ${myobj5.name} and he is a ${myobj5.gender} of ${myobj5.age} years old.")
}