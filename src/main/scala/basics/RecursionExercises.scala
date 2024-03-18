package learning.scala.basics

object RecursionExercises {
    // Exercises

    // 1 - Concatenate a string n number of times
    def concatenateStringNTimes(s: String, n: Int): String = {
        if(n==1) s else s+concatenateStringNTimes(s, n-1)
    }

    // 2 - Fibonacci Series
    def fibonacciSeries(n: Int): Int = {
        if(n == 0) 0 else if(n == 1) 1 else  fibonacciSeries(n-1) + fibonacciSeries(n-2)
    }

    def main(args: Array[String]): Unit = {
        println(concatenateStringNTimes("Scala", 10))
        println(fibonacciSeries(9))
    }
}
