package basics

object StringInterpolation {
    // Strings = 0-indexed

    val aString = "Scala Rocks"

    def stringOperations(): Unit = {
        println(aString + " " + aString)
        println(aString.length)
        println(aString.isEmpty)
        println(aString.startsWith("Scala"))
        println(aString.indexOf("Rocks")) // -1 will be returned if the element is not present

    }

    /**
     * Interpolation: inject values or expressions inside a String
     */

    def stringInterpolation(): Unit = {
        val name = "Harry Potter"
        val age = 15
        val greeting1 = "Hi, my name is " + name + " and I am " + age + " years old."

        // s-interpolated Strings
        val greeting2 = s"Hi, my name is $name and I am $age years old."
        val greeting3 = s"Hi, my name is $name and I am ${age + 1} years old."

        println(greeting1 + "\n" + greeting2 + "\n" + greeting3)
    }

    def main(args: Array[String]): Unit = {
        stringOperations()
        stringInterpolation()
    }
}
