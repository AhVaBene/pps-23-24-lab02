package task5

object Compose extends App :
    //(f ◦ g)(x) = f(g(x))
    def compose(f: Int => Int, g: Int => Int): Int => Int =
        x => f(g(x))

    println(compose(_ - 1, _ * 2)(5)) //10-1 = 9

    def composeG[x, y, z](f: y => z, g: x => y): x => z = a => f(g(a))

    println(composeG[Int, Int, Int](_ - 1, _ * 2)(5)) //10-1 = 9
    println(composeG[Int, Int, String](_ + "!", _ * 2)(5)) //10!