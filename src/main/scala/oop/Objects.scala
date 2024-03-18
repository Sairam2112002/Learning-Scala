package oop

object Objects {

    /**
     * Objects in Scala:
     *  - Objects in Scala are special, they are not the same as objects in general OOP (instances of classes)
     *  - Singleton Design Pattern:
     *      - Creating a type ensuring that there is only single possible instance of that type
     *      - In Scala, singleton pattern is defined by declaring an "object"
     *      - In scala, if an "object" is defined, it is the only possible instance of that type
     *  - Can define fields and methods, which can be referred with the "object" name
     */

    private object MySingleton {
        val aField: Int = 100
        def aMethod(x: Int): Int = 2*x
    }

    private val mySingleton = MySingleton
    private val mySingleton2 = MySingleton

    /**
     * checking if the instances "mySingleton" and "mySingleton" are equal, of course they will be equal because,
     * they are of type "MySingleton" which is a Scala "object" i.e "MySingleton" is the only single possible instance of its type
     */
    private val equality: Boolean = mySingleton == mySingleton2

    /**
     * Companions:
     *  - Combination of class + object with same name in the same file = companions
     *  - Companions can be identified using special half-circle-tokens marked ny IntelliJ beside the line numbers
     *  - object with same name as class = companion object
     *  - Usually, companion objects are created to define static fields and methods which will be common for all instances of
     *      the companion class that can be referred using Object's name (or Class which are same)
     *  - objects can extend classes and traits
     */

    private class Person(val name: String) {
        def sayHi(): String = s"Hi, my name is $name"
    }

    private object Person {
        val numberOfEyes: Int = 2
    }

    private object BigFoot extends Person("Big Foot")

    /**
     * Why do we have to use "main" method, otherwise the application won't run ?
     *  - We need to compile Scala to JVM byte code
     *  - In order to compile to the JVM bytecode, that JVM bytecode needs to map to what the JVM understands.
     *      And what JVM understands is a "public static main method that returns void"
     *      - The main method acts as the entry point for a Scala or Java program.
     *      - When you run a Scala or Java application, the Java Virtual Machine (JVM) looks for the main method and runs it.
     *      This method must be public, static, return void("Unit" in Scala), and accept a single argument, which is an array of strings (String[]).
     *      - This is the standard defined by the Java language specification, which Scala also follows since it runs on the JVM.
     *      - "main" method in Java:
     *          - public static void main(String[] args) {}
 *          -
 *          -
 *          - The equivalent "main" method in Scala:
     *          - def main(args: Array[String]): Unit = {}
     *          - The above "main" method is static, as it will be defined in an "object". We already know that fields and methods defined in
     *              Scala "object" are static
     *          - So, we can only run the application by defining the main method in Scala object, not by defining main method in Scala class
     */

    def main(args: Array[String]): Unit = {
        println("Objects:")
        println(s"""Checking if two instances of a Scala "object" "MySingleton" are equal: $equality""")
        println(s""""MySingleton": field = ${MySingleton.aField}, method = ${MySingleton.aMethod(5)}""")
        println

        val person1 = new Person("Harry")
        val person2 = new Person("Ron")

        println(s"Person-1: ${person1.name} have ${Person.numberOfEyes}")
        println(s"Person-2: ${person2.name} have ${Person.numberOfEyes}")
        println(BigFoot.name)
    }
}
