package task5

object Numbers extends App :
    def positive(x: Int): String = x match
        case x if x >= 0 => "positive"
        case _ => "negative"

    val num = 5
    val pos = num match
        case num if num >= 0 => "positive"
        case _ => "negative"

    val f: Int => String = _ match
        case x if x >= 0 => "positive"
        case _ => "negative"

    println(positive(10))
    println(pos)
    println(f(-5))