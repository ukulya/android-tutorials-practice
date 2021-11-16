fun main(){
    val x = 5
    // code review
    val i = x

    // Kotlin                                       //  java
    val i1 = 5                                      // int i1
    val i3: Int? = 5 //  ? наловый тип - создает обертку                                     // int i1
    val i2: Int = 5
    val l1: Long = 10L // всегда явно указывать     //  long l1
    val f1: Float = 10.0f
    val d1: Double = 10.0
    var n1:Nothing? = null

    // нельзя пустую переменную                     // в java можно

    println(i1 == i2)
    // в некоторых случаях Kotlin сравнивает по значению

    val ss1 = "xxx"
    val ss2 = "xxx"
    println(("ss1 == ss2-> ${ss1 == ss2}")) // true

    // Преобразование
    // int больше byte
    //
    val b: Byte = 3
    //val i: Int = b // type Mismatch
    val i5: Int = b.toInt()

    // nullable
    var i33: Int? = 9
    i33 = null

    var i4: Int = 5
    // i4 = null // ошибка

    val s1: String? = null
              // true       // false
    val res = s1?.length ?: "var is null"

    println("s1.length= $res") // если одна переменная - то не нужны фигурные скобки

    // можно  в одну строчку
    //val xx = if (true) "xx" else 'dfdg'


}
// default values
// String - null - ссылочный тип
// boolean - false
// the rest is 0

// обертки -
// мы не можем создать примитивы
// val i1 = 5  - new Integer(5) - обертка

// примитивы с маленькой буквы boolean boo = false
// String,
// Integer i3 = new Integer(5)

// auto unboxing


// JAVA
// == сравнение по ссылке
// для сравнения обектов испольуй .equals
// сравнивает объекты по значению

// сравнение строк
// буфер строк
// хитрая JAVA
// .intern() - закешить в памяти

// Float - меньше
// Double - больше
