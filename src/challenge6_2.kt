interface  Person{
    fun name()
    fun id()
}

interface Student:Person{
    fun avg()
    fun collage()
}
class Administration :Student{
    override fun name() {
        println("Student name")
    }

    override fun id()
    {
        println("Studenet ID")
    }

    override fun avg() {
        println("Student average")
    }

    override fun collage() {
        println("Student collage")
    }


}

fun main() {
    var stu=Administration();
    stu.name()
    stu.avg()
}