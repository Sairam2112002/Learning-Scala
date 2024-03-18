package learning.scala.oop

object OOPBasics {

    /**
     * Class:
     * A class is a blueprint, or prototype that defines the variables and the methods (functions) common to all objects (instances) of a certain kind.
     * A class can be seen as a specification or a concept of an object.
     * For example, if you have a class called "Car", it can have properties (variables) like "color", "make", "model" and behaviors (methods) like "accelerate", "break", "turn".
     *
     * Instance:
     * An instance is a specific object created from a particular class. It is an instantiation of a class.
     * When a class is defined, no memory is allocated but when it is instantiated (i.e. an instance is created) memory is allocated.
     * Using the previous "Car" class example, an instance of the Car class might be "a red 2022 Tesla Model 3".
     */

    /**
     * In Scala, the primary constructor of a class is interwoven with the class definition itself.
     * It's included as part of the class parameters in the class definition.
     * Constructor parameters (name and age in this Class) are not (necessarily) fields:
     *      - They cannot be accessed through the created instances, only fields can be accessed through the instance
     *      - If we want to make them as fields we have make them val or var
     */
    class Person(name: String, age: Int) {
        // fields (val or var)
        val allCaps: String = name.toUpperCase

        //methods
        def greeting(): Unit = {
            println(s"My name is $name")
        }

        /**
         * Can create multiple methods with the same name but signature must differ (Overloading)
         */
        def greeting(someone: String): Unit = {
            println(s"$name says: Hi $someone !")
        }
    }

    /**
     * Scala also has the concept of auxiliary constructors, which are optional and defined using def this().
     * These constructors call the primary constructor
     */
    class Student(id: Int, name: String) {
        // auxiliary constructor
        def this(id: Int) = {
            this(id, "Default Name")  // calls primary constructor
        }
    }

    def main(args: Array[String]): Unit = {
        // Starting from Scala 3, "new" keyword is optional
        val person1 = new Person("Harry Potter", 15)
        val person2 = new Person("Ron Weasely", 15)
        person1.greeting()
        person1.greeting("Ron")
    }
}
