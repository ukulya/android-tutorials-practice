package `lesson-5`

// главный конструктор
open class Person( // названия классов - всегда с большой буквы - иначе можно перепутать с методом
    val name: String,
    val secondName: String,
    val age: Int
) {
    // кастомный конструктор
    constructor(name: String,secondName: String,age: Int,company:String) :this(name,secondName,age){
        this.company = company
    }

    private lateinit var company: String

    open fun print(){
        println("name: $name, " +
                "\nsecondName: $secondName " +
                "\nage: $age")
    }
}
// в котлине public - по умолчанию - но также final(нельзя унаследоваться ) - поэтому нужно - open

class Employee(
    val nameEmp: String,
    val secondNameEmp: String,
    val ageEmp: Int,
    val company: String
):Person(nameEmp,secondNameEmp,ageEmp){
    override fun print(){
        super.print() // ссылка на родителя
        println("name: $name, " +
                "\nsecondName: $secondName " +
                "\nage: $age" +
                "\ncompany : $company")
    }
}
