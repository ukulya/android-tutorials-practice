package `lesson-5`

fun main(){

    // объект - сущность
    // класс - чертеж,по которому будем строить объект
    val a = A() // вызываем наш конструктор

    // объект - создастся и сохранится

    // объект не сохранится
    A()

    val person = Person("Sasha","Petrov",24)
    val personArg = Person(name="Sasha",secondName = "Petrov",age = 24) // удобно когда идут одни INT

    // val personJava = Person() // если есть явный конструктор - то нужно использовать его
    // если хотим использовать конструктор по умолчанию

    person.name
    //person.name = "Kolva"

    person.print()

    // абстракция
    // полиморфизм
    // наследование

    /*val employee: Employee = Employee(
        nameEmp= "Sasha",
        secondNameEmp = "Petrov",
        ageEmp = 24,
        companyEmp ="dfdggh"
    )*/
   /* val employee: Person = Employee(
        nameEmp= "Sasha",
        secondNameEmp = "Petrov",
        ageEmp = 24,
        companyEmp ="dfdggh"
    )*/


    // проверка ошибок - еще до запуска
    // проверка ошибок - во время работы

    // runtime - реальное время, в момент вызова объект -
    // compile time - проверка ссылок
    // если есть метод у детей - но нет у родителя - то при вывозе его не увидит

    // тип ссылки и тип объекта

}

