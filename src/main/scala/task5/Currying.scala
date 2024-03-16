package task5

object Currying extends App :
    def checkM(x: Int, y: Int, z: Int): Boolean = x <= y && y == z

    val checkL: (Int, Int, Int) => Boolean = (x, y, z) => x <= y && y == z

    def checkTM(x: Int)(y: Int)(z: Int): Boolean = x <= y && y == z

    val checkTL: Int => Int => Int => Boolean = x => y => z => x <= y && y == z

    println(checkM(5, 7, 7))
    println(checkL(5, 7, 7))
    println(checkTM(5)(7)(7))
    println(checkTL(5)(7)(7))
