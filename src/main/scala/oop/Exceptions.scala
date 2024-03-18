package oop

object Exceptions {
    /**
     * Exceptions:
     *  - Throwable is the parent of all exceptions
     *  - Throwable
     *      - Error = crashes that we can't control, JVM related crashes (eg: out of memory, stack overflow)
     *      - Exception = user-facing crashes, exceptions user throws must be part of this
     *          - Runtime Exception
     */

    def sumOfNNaturalNumbers(n: Int): Int = {
        if(n<0) throw new IllegalArgumentException("Negative numbers are not allowed")
        else if(n > 50000) throw new RuntimeException("Too big of a number - Overflowing Int!")
        else if(n==0) 0
        else n + sumOfNNaturalNumbers(n-1)
    }

    /**
     * try-catch block
     */

    private val attempt1 = try {
        sumOfNNaturalNumbers(1000)
    } catch {
        case e: IllegalArgumentException => -1
        case e: RuntimeException => Int.MaxValue
    }

    /**
     * User defined exceptions
     */

    private class MyException extends RuntimeException("Too big of a number - overflowing Int!")

    private def sampleMethod(n: Int): Unit = {
        if(n == 0) throw new MyException
    }


    def main(args: Array[String]): Unit = {
        println(attempt1)
        println(sampleMethod(0))
    }
}
