package `lesson-6`

class A(val arg: Int) {

    var a1: String = ""

    // переопределить getter/setter
    get() = "zxzx $arg"
    /*get() { // для большого кода
        return "zxzx $arg"
    }*/

        // закрыть getter
        //private get() = "zxzx $arg"

    set(value){
        // this.a1 = value // будет рекурсия через this
        field = value + "чсвыаап" //  ссылка на конкретно это поле
    }

    companion object{
        const val v = "xxx"
    }
}