import java.lang.Exception
import java.lang.NumberFormatException

fun main(){
    println()
    // читать из консоли
    val x = readLine() // обращают в строку
    println(x)

    println("Введите число: ")
    //val a1 = readLine()?.toInt() ?: 0
    val a1 = readLine().parseToInt()
    println("a1 = $a1")

    println("Введите число: ")
    //val a2 = readLine()?.toInt() ?: 0
    val a2 = readLine().parseToInt()
    println("a2 = $a2")

    val sum = a1 + a2
    println("Сумма: $sum") // 10

    if (true){
        //
    }else if (false){
        //
    } else {
        //
    }

    // в JAVA - это SWITCH

    // WHEN - Kotlin
    when(x){
        "z" -> println()
        "c" -> println()
        "b" -> println()
        "y" -> println()
        else ->{
            println()
        }
    }

}

private fun String?.parseToInt(): Int { // extention  - функция расширения - позволяет написать кастомную функцию
    if (this == null) return 0
    if (this == "") return 0 // всегда двойные кавычки

    /*try{
        this.toInt()
    } catch (e: NumberFormatException){
        println("exceptions $e")
        return 0
    }

    return this.toInt()*/

    /*try{
        return this.toInt()
    } catch (e: NumberFormatException){
        println("exceptions $e")
        return 0
    }*/

    return try{
        this.toInt()
    } catch (e: NumberFormatException){
        println("exceptions $e")
        0
    } catch (e: Exception){
        println("exceptions $e")
        0
    }

}