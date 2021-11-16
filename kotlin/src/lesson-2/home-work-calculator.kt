import java.lang.Exception
import java.lang.NumberFormatException

fun main(){
    println("Введите первое число: ")
    val a1 = readLine().parseToInt()
    println("Введите второе число: ")
    val a2 = readLine().parseToInt()
    print("Enter an operator (+, -, *, /): ")
    val operator = readLine()

    //when(a1)

    when(operator){
        "+" -> println(a1+a2)
        "-" -> println(a1-a2)
        "/" -> println(a1/a2)
        "*" -> println(a1*a2)
        else ->{
            println("неправильный оператор")
        }
    }
}
private fun String?.parseToInt(): Int { // extention  - функция расширения - позволяет написать кастомную функцию
    if (this == null) return 0
    if (this == "") return 0
    return try{
        this.toInt()
    } catch (e: NumberFormatException){
        println("exceptions $e")
        0
    } catch (e: Exception){
        println("exceptions $e")
        0
    } catch (e: ArithmeticException){
        println("exceptions $e,На ноль делить нельзя")
        0
    }
}