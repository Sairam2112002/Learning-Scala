package oop

object Generics {

    // Creating a prototype of a Linked List of Integers
    // [1 -> 2 -> 3 -> 4 -> 5]
    // [1  ,  2  ,  3  ,  4  ,  5]
    // ^^     ^^^^^^^^^^^^^^^^^^^
    // first         rest
    private abstract class IntList {
        def first: Int
        def rest: IntList
    }

    private class EmptyIntList extends IntList {
        override def first: Int = 0
        override def rest: IntList = new EmptyIntList
    }

    private case class NonEmptyIntList(a: Int, r: IntList) extends IntList {
        override def first: Int = a
        override def rest: IntList = r
    }

    private val intList: NonEmptyIntList = NonEmptyIntList(1, NonEmptyIntList(2, NonEmptyIntList(3, new EmptyIntList)))

    /**
     * What if we want to reuse this logic on Strings
     * 1 - copy everything and use String Type - creates additional code
     * 2- remove the type safety - use Any Type - then, we cannot be sure what type is Any (Int or String or Float or a Person etc.,) i.e
     *      we cannot perform any kind of operation - whole purpose will be defeated
     */

    private abstract class AnyList {
        def first: Any
        def rest: AnyList
    }

    private class EmptyAnyList extends AnyList {
        override def first: Any = 0
        override def rest: AnyList = new EmptyAnyList
    }

    private case class NonEmptyAnyList(a: Any, r: AnyList) extends AnyList {
        override def first: Any = a
        override def rest: AnyList = r
    }

    private val anyList: AnyList = NonEmptyAnyList(1, NonEmptyAnyList(2, NonEmptyAnyList(3, new EmptyAnyList)))

    /**
     * The whole purpose of using types is that we can have some type information at compile time
     * So, strongly typed languages like Java, Scala, C++ and JS introduced the concept of Type Parameters
     *
     * Type Parameters = Generics:
     *  - can use type arguments: specified in [square braces], eg: [A] in below abstract class
     *  By using the below technique, we are reusing the concept of linked list on all possible types
     *
     *  Generics or type arguments are a technique to preserve type-safety and also re use code on potentially unrelated types
     *  We can add type arguments to "classes", "traits", "abstract classes", "case classes", "methods"
     *  We can add multiple type arguments
     */

    private abstract class MyList[A] {
        def first: A
        def rest: MyList[A]
    }

    private class EmptyList[A] extends MyList[A] {
        override def first: A = throw new NoSuchElementException
        override def rest: MyList[A] = throw new NoSuchElementException
    }

    private case class NonEmptyList[A](a: A, r: MyList[A]) extends MyList[A] {
        override def first: A = a
        override def rest: MyList[A] = r
    }

    private val numbers = NonEmptyList(1, NonEmptyList(2, NonEmptyList(3, new EmptyList)))

    private val strings = NonEmptyList("Scala", NonEmptyList("Java", NonEmptyList("C++", new EmptyList)))

    // trait with multiple type arguments
    private trait MyMap[K, V] {}

    // methods with type parameters
    private def printIt[A](value: A): A = {
        value
    }

    def main(args: Array[String]): Unit = {
        println(s"Integer Type List: $intList")
        println(s"Any Type List: $anyList")
        println(s"Generic Integer List: $numbers")
        println(s"Generic String List: $strings")
        println(s"Generic Method: ${printIt("Scala")}")
    }
}
