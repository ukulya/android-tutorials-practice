package `lesson-4`

fun main(){
    val m = mapOf<Int,String>( // коллекция MAP
        0 to "1", // to - инфиксная функция
        1 to "2" // same as 2 to("2")
    )
    // можно использовать аналог Pair
    val p = mapOf<Int,String>(
        Pair(0,"1"),
        Pair(1,"2"),
    )

    // необязательно указывать пару <Int,String>
    // котлин попытаеся привести к общему типу
    val all = mapOf(
        Pair("key","value"),
        Pair("key1",9),
    )

    all.get("key")
    println(all.get("key"))
    // можно упростить
    println(all["key"])

    all.forEach{key,value ->
        println("key=$key,value=$value")
    }
    // value
    //key=key,value=value
    //key=key1,value=9

    // можно упростить

    all.forEach{ (key, value) ->
        println("key=$key,value=$value")
    }

    // что будет если одинаковые ключи
    val allSame = mapOf(
        Pair("key","value"),
        Pair("key",9),
    )
    allSame.forEach{ (key, value) ->
        println("key=$key,value=$value")
    }
    // он перезапишет

    // может работать с null key & null value
    val nullArr = mapOf(
        Pair("key",null),
        Pair(null,9),
    )
    nullArr.forEach{ (key, value) ->
        println("key=$key,value=$value")
    }

    // ArrayList ,LinkedList тоже могут работать с null значениями

    println(allSame.keys) // вернул set - стопку ключей
    // [key]

    // почитать
    // структура данных - map
    // как внутри усроены массивы
    // у каждого объекта есть hashCode - берет адрес - примножает на число - возвращает

    // может получиться что у двоих объектов - может одинаковый индекс - коллезия
}

// kotlin сам переодределяет hashCode
data class Person(
    val name: String = "ccdfd",
    val sname: String = " ffg"
)