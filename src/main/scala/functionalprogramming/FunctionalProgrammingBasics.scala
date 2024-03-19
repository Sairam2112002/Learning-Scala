package functionalprogramming

object FunctionalProgrammingBasics {

    /**
     * In Functional Programming, we work with functions as "first class" elements of the language
     * we can pass functions as arguments, we can return them as results
     * Int => Int can be expresses as a trait that has a method = apply(Int): Int
     * (String, Int) => Int can be expresses as a trait that has a method = apply(String, Int): Int
     */

    private trait MyStringIntFunction {
        def apply(s: String, i: Int): String
    }

    private val myCombinator = new MyStringIntFunction {
        override def apply(s: String, i: Int): String = s"$s, ($i)"
    }

    /**
     * Scala already has Function traits, similar to Functional Interfaces in Java
     * Examples:
     *  - Function1 = takes 1 argument
     *  - Function2 = takes 2 arguments
     *  - etc
     */

    private val combinator = new Function1[Int, Int] {
        override def apply(v1: Int): Int = v1 * 2
    }

    private val combinator2 = new Function2[String, Int, String] {
        override def apply(v1: String, v2: Int): String = s"$v1, ($v2)"
    }

    def main(args: Array[String]): Unit = {
        /**
         * Here, myCombinator just acts as a function by virtue of apply() method
         */
        println(myCombinator("Scala", 100))
        println

        println("Functional Traits")
        println(s"Function1 = ${combinator(5)}")
        println(s"Function2 = ${combinator2("Scala", 100)}")
    }
}
