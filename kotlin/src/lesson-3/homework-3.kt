fun main(){
    println("Введите четырехзначное число c пробелом")
    val arr = readLine()!!.split(" ").map { it.toInt() }

    val res:Int = arr[0] + arr[1]
    val res1:Int = arr[2] + arr[3]


    if (res == res1){
        println("Счастливое число")
    } else{
        println("Несчастливое число")
    }
}

