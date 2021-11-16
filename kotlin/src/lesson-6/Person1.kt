package `lesson-6`

class Person1(val name: String,val sName: String)  {
    override fun equals(other: Any?): Boolean {
        if(other == null) return false
        //return super.equals(other)
        // println(p1.equals(p2))  - p1 - переменная на которую сравнивается объект
        if (this == other) return true  // === сравнивает по ссылкам
        if (other !is Person1) return false

        // если проверки не прошли , то конкретно начинаем сравнивать
        //if (this.name.equals(other.name))
        //if (this.name == other.name) return true
        if (this.name != other.name) return false
        return true
    }
}
// hashcode - числовое представление объект
// println(p1.hashcode())

//data class DataPerson(val name: "Sara")