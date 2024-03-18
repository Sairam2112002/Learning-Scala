package learning.scala.basics

object InstructionsAndVariablesAndLoops {

    // This lesson is about Instructions and Variables and Loops

    /**
     * Instructions are executed Vs expressions are evaluated
     * Various forms of specifying the computer step by step, what it's supposed to do : Imperative Programming (instructions): specifying computer exactly what to do step by step
     * structures that evaluate to a value which is up to the computer to evaluate the value: Functional Programming (expressions)
     */

    /**
     * Example: In this example, in "main" we aren't performing anything, the printing will actually take place.
     * Because in the process of evaluating below expression, we are actually performing what is called a side effect what otherwise would be an expression in Scala
     *
     * Everything is an expression in Scala.
     * This is an expression that returns an interesting type called "Unit".
     * Expressions returning unit are things that don't actually return or aren't actually evaluated to anything meaningful, but they do perform an instruction.
     *
     * As everything is an expression in Scala, we model instructions in Scala using an expression that return an "Unit"
     * In Scala, an instruction is an expression returning "Unit"
     */
    val printing: Unit = println("This is an instruction") // side effect

    /**
     * If we want to see the value of Unit, this little token is the actual value of the unit, which has no meaningful value
     */
    val theUnit: Unit = () // the only possible value of token

    /**
     * Instructions - can be code blocks returning unit
     * Now, in the process of evaluating this code block, both the print statements are performed
     */
    val instructionCodeBlock: Unit = {
        println("Instruction - 1")
        println("Instruction - 2")
    }

    // Variables in Scala - can be modified

    var aVariable = 47
    aVariable = 46

    // Loops in Scala

    var i = 1
    while(i <= 10) {
        print(i + " ")
        i += 1
    }
    println

    // in for loop in Scala, both the boundaries are inclusive
    for(i <- 1 to 10) {
        print(i + " ")
    }
    println
    
    def main(args: Array[String]): Unit = {
        // As above, printing and theUnit are returning Unit and we know () is the value of Unit, let's see if printing and theUnit are equal
        println(printing == theUnit)

        println(aVariable)
    }
}
