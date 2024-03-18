package learning.scala.oop

object Polymorphism {

    /**
     * Polymorphism allows us to perform a single action in different ways.
     * The word “poly” means many and “morphs” means forms, So it means many forms.
     * In other words, polymorphism allows you to define one interface and have multiple implementations.
     *
     * 1. Compile-time Polymorphism
     * - It is also known as static polymorphism.
     * - This type of polymorphism is achieved by function overloading or operator overloading.
     * - Function overloading is where multiple functions can have the same name but different signature
     * - Operator overloading is where the operators such as +, -, *, etc. can be given additional meanings when applied to user-defined data types.
     * - Scala supports both function and operator overloading where as Java only supports function overloading
     *
     * 2. Runtime Polymorphism
     * - It is also known as Dynamic Method Dispatch.
     * - It is a process in which a function call to the overridden method is resolved at Runtime.
     * - This type of polymorphism is achieved by Method Overriding.
     * - Method overriding, on the other hand, occurs when a derived class has a definition for one of the member functions of the base class.
     *   That base function is said to be overridden.
     */

    private class ArithmeticOperations {
        def add(a: Int, b: Int): Int = a+b
        def subtract(a: Int, b: Int): Int = a-b
        def multiply(a: Int, b: Int): Int = a*b
        def divide(a: Int, b: Int): Int = a/b
        def specialFunction(n: Int): Int = 0

        // Overloading
        def add(a: Int, b: Int, c: Int): Int = a+b+c
        def divide(a: Float, b: Float): Float = a/b
    }

    private class Multiplication extends ArithmeticOperations {
        // function overriding
        override def multiply(a: Int, b: Int): Int = a*b*a*b
    }

    /**
     * Anonymous Classes
     * - Anonymous classes in Scala allow you to create a class and an instance of it at the same time, without giving the class a name.
     * - This comes in handy when a class would have minimal use except for the creation of a single object.
     */

    private val sumOfNNaturalNumbers = new ArithmeticOperations {
        override def specialFunction(n: Int): Int = n * (n+1)/2
    }

    private val operation1 = new ArithmeticOperations
    private val operation2 = new Multiplication

    private val operation3: ArithmeticOperations = new Multiplication // providing an instance of child class to the value of parent class

    def main(args: Array[String]): Unit = {
        println(operation1.add(100, 50))
        println(operation1.divide(100, 50))
        println(operation1.multiply(100, 50))
        println(operation1.add(100, 50, 25))
        println(operation1.divide(100f, 50f))
        println

        println(operation2.add(100, 50))
        println(operation2.divide(100, 50))
        println(operation2.multiply(100, 50))
        println(operation2.add(100, 50, 25))
        println(operation2.divide(100f, 50f))
        println

        println(operation3.add(100, 50))
        println(operation3.divide(100, 50))
        println(operation3.multiply(100, 50))
        println(operation3.add(100, 50, 25))
        println(operation3.divide(100f, 50f))
        println

        println(sumOfNNaturalNumbers.specialFunction(100))
    }
}
