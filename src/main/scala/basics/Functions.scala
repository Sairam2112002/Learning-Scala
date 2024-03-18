package learning.scala.basics

import scala.math._

object Functions {
    // Function = a min-program or reusable piece of code that can be parameterized
    // Syntax = def functionName(param1: type, param2: type, .... ): returnType = {}

    def addTwoNumbers(num1: Int, num2: Int): Int = {
        num1 + num2
    }

    // Not always necessary to add the return type
    def multiplyTwoNumbers(a: Int, b: Int) = {
        a * b
    }

    // Function returning an Unit
    def aVoidFunction(): Unit = {
        println("This is a void function")
    }

    // Nested functions - The inner functions can only be called inside it's parent function
    def solutionsOfAQuadraticEquation(a: Int, b: Int, c: Int): Unit = {
        def squareRootOfANumber(number: Double): Double = {
            sqrt(number)
        }

        def discriminant(a: Int, b: Int, c: Int): Double = {
            b*b - 4*a*c
        }

        if(discriminant(a, b, c) >= 0) {
            val solution1 = -b + (squareRootOfANumber(discriminant(a, b, c))) / (2 * a)
            val solution2 = -b - (squareRootOfANumber(discriminant(a, b, c))) / (2 * a)
            println("The solutions are: " + solution1 + ", " + solution2)
        } else {
            println("The solution doesn't exist")
        }
    }

    def main(args: Array[String]): Unit = {
        println(addTwoNumbers(1, 2))
        println(multiplyTwoNumbers(2, 3))
        aVoidFunction()
        solutionsOfAQuadraticEquation(2, 10, 10)
    }
}
