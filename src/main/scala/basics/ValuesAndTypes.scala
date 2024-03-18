package basics

object ValuesAndTypes {
  def main(args: Array[String]): Unit = {

    // val is a constant, cannot be reassigned
    val aNumber: Int = 47

    // type inference
    val aSecondNumber = 47
    
    val anInteger: Int = 47 // Integer - 4 bytes
    val aShort: Short = 5234 // Short - 2 bytes
    val aLong: Long = 123456789999L // Long - 8 bytes
    val aFloat: Float = 2.5f // Decimal - 4 bytes
    val aDouble: Double = 4.5 // Decimal - 8 bytes

    val aBoolean: Boolean = true // or false

    val aCharacter: Char = 'a' // Character - 2 bytes
    val aString: String = "Sairam" // String
  }
}
