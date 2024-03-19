package functionalprogramming

object AnonymousFunctions {

    /**
     * Function Types = short form notations for Function Traits
     * Eg:
     *  - Equivalent of Function1[Int] = Int => Int
     */

    private val doubler = new Function1[Int, Int] {
        override def apply(n: Int): Int = 2 * n
    }

    private val doubler2: Int => Int = n => n*2 // It is called a lambda, which is the equivalent of above

    private val doubler3 = (n: Int) => n*2 // can also write lambda as this, the return type will be automatically inferred (type - inference)

    // This is the shortest lambda notation possible

    private val doubler4: Int => Int = _ * 2 // same as above, underscore takes the place of argument if it is a one liner

    // we can also use the above shortest notation for multiple arguments (only for one liners)

    private val adder3: (Int, Int) => Int = _ + _ // first underscore = first argument, second underscore = second argument, etc.,
                                                  // but, we cannot re use the parameters

    // Similarly for Function2

    private val adder = new Function2[Int, Int, Int] {
        override def apply(a: Int, b: Int): Int = a+b
    }

    private val adder2: (Int, Int) => Int = (a, b) => a+b

    // Zero-arg function = Function0[Int] = only returns

    private val giveSomething = new Function0[Int] {
        override def apply(): Int = 100
    }

    private val giveSomething2: () => Int = () => 100

    // we can also use a block of code for some complex logic

    private val lambdaWithCodeBlock: String => Int = { string =>
        val stringLength = string.length
        stringLength + 10
    }

    private val lambdaWithCodeBlock2: String => Int = string => {
        val stringLength = string.length
        stringLength + 10
    }

    def main(args: Array[String]): Unit = {
        println(s"Function1 Trait = ${doubler(100)}, Equivalent lambda - 1 = ${doubler2(100)}, Equivalent Lambda - 2 = ${doubler3(100)}, Shortest Lambda Notation = ${doubler4(100)}")
        println(s"Function2 Trait = ${adder(100, 200)}, Equivalent lambda = ${adder2(100, 200)}")
        println(s"Function0 Trait = ${giveSomething()}, Equivalent lambda = ${giveSomething2()}")
        println(s"Lambda with code block - 1 = ${lambdaWithCodeBlock("Scala")}")
        println(s"Lambda with code block - 2 = ${lambdaWithCodeBlock2("Scala")}")
    }
}
