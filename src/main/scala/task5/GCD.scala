package task5

object GCD extends App :
    //a > b, then gcd(a, b) = gcd(b, a mod b).
    def gcd(a: Int, b: Int): Int =
        val (maxV, minV) = max(a, b)
        val mod = maxV % minV
        mod match
            case 0 => minV
            case _ => gcd(minV, maxV % minV)

    def max(a: Int, b: Int): (Int, Int) =
        a match
            case a if a > b => (a, b)
            case _ => (b, a)

    println(gcd(12, 8)) // 4
    println(gcd(14, 7)) // 7
    println(gcd(18, 21)) // 3

    def gcdTail(a: Int, b: Int): Int =
        @annotation.tailrec
        def _gcd(max: Int, min: Int, mod: Int): Int = 
            mod match
                case 0 => min
                case _ => _gcd(min, mod, min % mod)
        val (maxV, minV) = max(a, b)
        _gcd(maxV, minV, maxV % minV)
    
    println(gcdTail(12, 8)) // 4
    println(gcdTail(14, 7)) // 7
    println(gcdTail(18, 21)) // 3
