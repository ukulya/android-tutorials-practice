package `lesson-5`

class B(val a1:Int,val a2: Int) : BaseB(a1,a2) // val стал серым - если используется только в конструкторе - не нужно
open class BaseB(val a1p: Int,val a2p: Int)