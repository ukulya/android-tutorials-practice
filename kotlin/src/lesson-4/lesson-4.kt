package `lesson-4`

fun main(){
//    val f = readLine()!!.toInt()
//    println(factorial(f))

    // чтобы выйти из программы
    /*val x = readLine()!!
    while (x != "q"){
        println("Введите число:")
//        if (f == 0) break
        if (f == 1) break
        println(factorial(f))
    }*/ // бесконечно

    do{
        println("Введите число:")
        val f = readLine()!!.toInt()
        println(factorial(f))
        println("Продолжить ? y-yes,any-no")
        val x = readLine()!!
    }  while (x == "y")
}

fun factorial(n: Int):Double = if (n < 2) 1.0 else n * factorial(n - 1)