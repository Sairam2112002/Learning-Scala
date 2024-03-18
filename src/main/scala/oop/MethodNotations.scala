package oop

object MethodNotations {

    // Infix Method Notations = Alternate syntax in scala to call methods with exactly one argument

    class Person(val name: String) {
        def greet(another: Person): Unit = {
            println(s"${name} says: Hi ${another.name}, how are you ?")
        }

        // methods in Scala can have non-alphanumeric characters as well
        def !!?(): Unit = {
            println("This method name contains Non-Alphanumeric characters")
        }

        /**
         * "apply" is a special method in Scala that can have any no of and any type of parameters and can be called without the method name i.e "apply"
         * "apply" method can be overloaded
         */
        def apply(programmingLanguage: String): Unit = {
            println(s"${name} programs in ${programmingLanguage}")
        }
    }

    val harry = new Person("Harry")
    val ron = new Person("ron")

    def main(args: Array[String]): Unit = {
        println("Infix Notation:")
        harry.greet(ron) // standard way of calling a method
        harry greet ron // exactly the same thing as above, this is called infix notation
        //   harry    greet     ron
        //   ^^^^^    ^^^^^     ^^^
        //  instance  method  argument = infix notation = ONLY works on methods with one argument
        println

        println("Method with non-alphanumeric characters in its name:")
        harry.!!?()
        println

        println("\"apply\" method in Scala:")
        ron.apply("Scala") // standard way of calling a method
        ron("Scala") // "apply" method can be called without explicitly mentioning its name
    }
}
