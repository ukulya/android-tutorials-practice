package `lesson-6`

fun main() {
    val a = A(21)
    println("a1= ${a.a1}") // a1= zxzx 21

    xxx(21) // 21,2

    // посмотри в каком порядке они вызовутся
    val p = Person("N","S") //

    // первым вызвался init

    val p2 = Person("N","S",21) // secondary constructor

}

// значения по дефолту
fun xxx(param1:Int,param2: Int = 2){
    println("$param1,$param2")
}