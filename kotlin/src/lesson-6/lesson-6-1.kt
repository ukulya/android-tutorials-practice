package `lesson-6`

fun main(){
    val p1 = Person1("Natasha","Orlova")
    val p2 = Person1("Natasha","Orlova")
    println(p1 == p2) // false - сравнивает ссылки
    println(p1.equals(p2)) // false -  нужно переопределить метод equals
}

public class Java{

}