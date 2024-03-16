package task5

object Negate extends App :
    val neg: (String => Boolean) => (String => Boolean) =
        f => i => !f(i)
    val empty: String => Boolean = _ == "" // predicate on strings
    val notEmpty = neg(empty) // which type of notEmpty?
    println(notEmpty("foo")) // true
    println(notEmpty("")) // false
    println(notEmpty("foo") && !notEmpty("")) // true.. a comprehensive test

    def neg2(f: (String => Boolean)): (String => Boolean) = !f(_)
    val notEmpty2 = neg2(empty)
    println(notEmpty2("foo")) // true
    println(notEmpty2("")) // false
    println(notEmpty2("foo") && !notEmpty2("")) // true.. a comprehensive test

    def neg3[x](f: (x => Boolean)): (x => Boolean) = !f(_)
    val eqZero: Int => Boolean = _ == 0 // predicate on int
    val divZero = neg3(eqZero)
    println(divZero(1)) // true
    println(divZero(0)) // false

