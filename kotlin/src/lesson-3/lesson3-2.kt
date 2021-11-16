import java.util.*
import kotlin.collections.ArrayList

fun main(){
    // в список можно добавлять - ArrayList - основан на массиве
    // LinkedList - основан двусвязный список - держит ссылки на предыдущий элемент и на следуший - цепочка из элементов
    val ll = LinkedList<String>()
    //ll.set(0,"0")
    ll[0] = "0"
    ll[1] = "1" // этот элемент знает об нуле и нуль знает об единичке
    // в памяти они могут быть далеко друг от друга

    // всегда использовать ArrayList - легкий в памяти
    // LinkedList - создает оболочку вокруг эелементов

    val al = ArrayList<Int>(10_000)

    // java was written on C

    //al.set(10,10)
    al[10] = 10

    val list2 = listOf<Int>(1,2,3,4) // обычно так создаем
    // иммутабельны - нельзя размер менять

    val list3 = listOf<Int>(1,2,3,4).toMutableList() // теперь мутабелен

    list3.set(0,10) // same as below
    list3[1] = 11
    list3.add(5,23)
    list3.forEach{ println("e = $it")} // вышли за рамки

    list3.add(4,23) // не вышли за рамки
    list3.forEach{ println("e = $it")} // ссылка на переменную $it - iterable

    // можно кастомную переменную указать
    list3.forEach{ element ->
        println("e = $element")
    }

    // map - set - ключ - значение
    //val map = mapOf<String,String>("")

    // рекурсия
    for(i in 0..9){
        println("e = $i")
    }

    while (false){ // true
        // do
    }

    do{ // условие проверяется в конце - как минимум один раз выполнится
        // do
    } while (false) // true

    // n! = n * n

    val f = readLine()!!.toInt()
    println(factorial(f))
}

fun factorial(n: Int): Double = if(n < 2) 1.0 else n * factorial(n - 1)
/*
* n * factorial(n - 1)
* n = 4
* 4 * (4 - 1)
* n = 3
* 3 * (*/