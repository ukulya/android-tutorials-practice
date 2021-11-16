package `lesson-3`

// не убирать package

fun main(){
    val num = readLine()!!.toCharArray()
    val arr = arrayOf(1,2,3,4)
    arr.forEach { println(it) }
    println(num)
    println(arr)

    // get individual elements
    num.forEach {
        println("it=$it")
    }

    println("num[0]=${num[0]}")
    println("num[1]=${num[1]}")
    println("num[2]=${num[2]}")
    println("num[3]=${num[3]}")

    // another solution
    // оператор мод
    val num1 = readLine()!!.toInt()
    val x4 = num1 % 10 // деление по модулю // остаток от деления
    // мы получим последнюю цифру числа
    println("num=$num1, x4=$x4")

    val x3 = num1 / 10% 10
    println("num=$num1, x4=$x3")
}