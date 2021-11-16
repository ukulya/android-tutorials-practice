package `lesson-6`

//class Person(val name: String,val sName: String) {
    // есть еще одно упрощение
    // data-class - внутри сам переопределяет

data class Person(val name: String,val sName: String) { // то что в скобках - первичный конструктор

    // val p = 21

    // lazy init -
    lateinit var x: String // не очень хороша - если не инициализирована - то получим ошибку

    //val Lazy<String> // почти тоже самое что  lateinit var

    // вторичный конструктор
    constructor(name: String,sName: String,age: Int): this(name,sName){
        println("secondary constructor")
    }

    //
    init {
        println("init")
    }

    // принцип SOLID
    // single responsibility
    // нелогично прописывать функцию здесь
    fun print(){
        println("Person: $name,$sName")
    }

    // поэтому

    override fun toString(): String { // у Any есть метод toString
        return "Person: ($name,$sName)"
    }

    // мы хотим чтобы выводилоась строка , а не кусочек памяти

    // это хорошо для проверки на консоли


}

// для работы в банке - класс данных