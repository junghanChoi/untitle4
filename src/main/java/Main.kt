import kotlin.jvm.JvmStatic

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        println("hello world")
        branch1()
        imp1Use(Imp1());
    }

    fun branch1() {
        println("ranch!")
    }

    fun imp1Use(inst1: Imp1): Int{
        inst1.some1()
        inst1.some2()
        inst1.some3()
        // hello
        // hello2
        //
        //31234
        return 1
    }
}