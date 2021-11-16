package `lesson-2`

fun main(){
    println("Введите число")
    val x = readLine()!!

    when(x){
        "+" -> {}
        "-" -> {}
        "*" -> {}
        "/" -> divide()
    }

}
private fun divide(){
    /*val a1 = readLine()!!.toInt()
    val a2 = readLine()!!.toInt()*/
    /*val res = a1 / a2
    println("res = $res")*/
    val a1 = readLine()!!.parseToInt()
    val a2 = readLine()!!.parseToInt()
    println(div(a1,a2))

}

//private fun div(a1: Int,a2: Int): Int{
private fun div(a1: Int,a2: Int): String{
    try{
//        return a1 / a2
//        println("res=${ a1 / a2 }")
        return "res=${ a1 / a2 }"
    } catch (e: ArithmeticException){
//        println("На ноль делить нельзя")
        return "На ноль делить нельзя"
    }
}

private fun String.parseToInt(): Int{
    if(this == "") return 0
    //
    return 0
}