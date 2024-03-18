package basics

object Expressions {
    def main(args: Array[String]): Unit = {

        // structure that evaluate to a value
        val expression = 40 + 7
        //               ^^^^^^ expression

        // expressions that compose operations: Arithmetic + - * / %, Bitwise | & >> <<
        val aMathExpression = 2 + 3 * 4

        // boolean expressions
        val equalityTest = 1 == 2

        // if expressions
        val anIfExpression1 = if(equalityTest) 45 else 99
        val anIfExpression2 = if(equalityTest) 45 else 99

        // code blocks are also expressions
        val aCodeBlock1 = {
            // can add local values
            val localValue1 = 10

            // can add expressions
            val localExpression1 = 2 + 3 * 5

            // final value of this code block = the value of final value or final expression
            localExpression1 + localValue1
            // ^^^^^^^^^^^^^^^^^^^^^^^^^^^ is the value of this code block
            // can also give this entire block inside a print statement and it will do the same job
        }

        // if expression with code blocks
        val anIfExpressionWithCodeBlocks = if(equalityTest) {
            "equalityTest is true"
        } else {
            "equalityTest is false"
        }

        // Everything in Scala is an expression

        // pattern matching: switch expression
        val matchingValue = 3
        val matchedValue = matchingValue match {
            case 1 => "one"
            case 2 => "two"
            case 3 => "three"
            case 4 => "four"
            case 5 => "five"
        }

        println("Expressions:         " + expression + ", " + aMathExpression)
        println("Boolean expression:  " + equalityTest)
        println("If expressions:      " + anIfExpression1 + ", " + anIfExpression2 + ", " + anIfExpressionWithCodeBlocks)
        println("Code block:          " + aCodeBlock1)
        println("Pattern matching:    " + matchedValue)
    }
}
