package basics

object Recursion {
    // Recursion - A mechanism by which a function can refer to itself

    def sumOfNaturalNumbers(n: Int): Int = {
        if(n > 0) n+sumOfNaturalNumbers(n-1) else 0
    }

    def printStringNTimes(s: String, n: Int): Unit = {
        if(n > 0) {
            print(s + " ")
            printStringNTimes(s, n-1)
        }
    }

    def isPrime(n: Int): Boolean = {
        def testDivisors(d: Int): Boolean = {
            if(d > n/2) true else if(n%d == 0) false else testDivisors(d+1)
        }

        if(n <= 0) false else if(n == 1) false else testDivisors(2)
    }

    def main(args: Array[String]): Unit = {
        println(sumOfNaturalNumbers(100))

        printStringNTimes("Scala", 10)
        println

        println(isPrime(7))
    }
}
