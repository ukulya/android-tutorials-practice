package `lesson-6`

fun main(){
    val p = Person("Natasha","Orlova")
    p.print()
    println("Person: ${p.name}")
    println(p) // println - всегда конвертирует в строку

    // есть еще одно упрощение
    // data-class - внутри сам переопределяет


}