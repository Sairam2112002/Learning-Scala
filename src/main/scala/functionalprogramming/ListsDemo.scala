package functionalprogramming

object ListsDemo {

    /**
     * Scala Lists:
     */

    // List has a companion object with apply method, so we can create a list using apply method
    private val aList: List[Int] = List.apply(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    // Since we know that we can call apply method without its name, we can also create a list as below
    private val anEmptyList: List[Int] = List()
    private val aNonEmptyList: List[Int] = List(1, 2, 3, 4, 5)

    /**
     * List datatype in Scala is a singly linked list: first element = head, rest of the list = tail
     */

    private val head = aList.head
    private val tail = aList.tail
    private val tailOfN = aList.tail(5) // gives the nth element in the tail (excluding head)

    // adding (prepend) an element to a List
    private val bigList1 = 0 :: aList // this will return be a new List, original List would be the same as before

    // adding (append) an element to a List
    private val bigList2 = aList :+ 11 // this also will return be a new List, original List would be the same as before

    /**
     * Utility methods:
     */

    private val aListWithNElements = List.fill(10)("Scala") // creates a list with 10 elements and each element will be  "Scala", specifying element is OPTIONAL
    private val reversedList = aList.reverse // returns a reversed list
    private val concatenatedList = List(1, 2, 3) ++ List(4, 5, 6) // concatenation
    private val sumOfElements = List(1, 2, 3, 4, 5).sum

    //formatting a List into String
    private val formattedListString = aList.mkString("*") // returns a string with all elements in the List separated by the specified argument
    private val formattedListString2 = aList.mkString("[", "|", "]") // arguments = "character before first element", "separator", "character after last element"

    /**
     * Finding the sum of elements in a List using reduce function:
     * The below is a simple reduce function (reduce function can be implemented in many different ways)
     *  - This reduce function performs the specified operation (a+b) for consecutive elements until only one element is left and that element is returned
     *  - The operation is as follows:
     *      - (1,2,3,4,5) -> (1+2,3,4,5) = (3,3,4,5)
     *      - (3,3,4,5) -> (3+3,4,5) = (6,4,5)
     *      - (6,4,5) -> (6+4,5) = (10,5)
     *      - (10,5) -> (10+5) = (15) : 15 is returned
     */

    private val sumOfList = List(1, 2, 3, 4, 5).reduce((a, b) => a+b)

    def main(args: Array[String]): Unit = {
        println("Scala Lists:")
        println(aList + " " + anEmptyList + " " + aNonEmptyList)
        println

        println("Head and Tail of List:")
        println(s"Head: $head, Tail: $tail, nth element in the tail: $tailOfN")
        println

        println("Adding elements:")
        println(s"Original List: $aList, Prepended List: $bigList1, Appended List: $bigList2")
        println

        println("Utility methods:")
        println(s"List with N specified elements: $aListWithNElements")
        println(s"Reversing a List: $reversedList")
        println(s"Concatenation: $concatenatedList")
        println(s"Sum of elements in the List: $sumOfElements")
        println(s"List to String format - 1: $formattedListString")
        println(s"List to String format - 2: $formattedListString2")
        println(s"Sum of elements in the List using reduce function: $sumOfList")
    }
}
