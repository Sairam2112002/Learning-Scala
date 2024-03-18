package oop

object CaseClasses {

    /**
     * Case Classes:
     *  - Can define methods and fields like normal classes
     */

    private case class Pet(name: String, age: Int) {

    }

    /**
     * 1. Constructor arguments of case classes are automatically promoted to fields
     */

    private val dino = new Pet("Dino", 2)
    private val dinoAge = dino.age

    /**
     * 2. Instances can be created without new keyword
     */

    private val dino2 = Pet("Dino", 2)

    /**
     * 3. Case classes have already some representations set up by the compiler
     * Eg: equals, hashCode, toString (these three belong to "Any" type in Scala, which is the parent of all types in Scala)
     * In general, all classes and traits implicitly extend "Any" type which is the parent of all types
     * In general, instances if normal classes have dummy representations of the above methods, whereas case classes some good representations
     *
     * For normal classes, if tho instances have same data and if we check them using "equals" method, it will return class. But for normal classes,
     *  it will return true because "equals" method is pre-defined for case classes
     */

    private class PetSimple(name: String, age: Int) {

    }

    private val dinoSimple = new PetSimple("Dino", 2)

    /**
     * 4. Some utility methods
     *  - copy method:
     *      - Can create a copy of an existing instance with its data or modified data
     */

    private val dinoCopy = dino.copy()
    private val dinoCopyYounger = dino.copy(age = 1)

    /**
     * 5. Case classes have companion objects already created
     *  - In that companion object, "apply" method is already created with the same signature as the constructor i.e we can create
     *      an instance of case class using "apply" method
     *  - We know that "apply" method can be called without its name
     */

    // creating new instance using "apply" method
    private val dino3 = Pet.apply("Dino", 4)

    // same as above, but "apply" method can be called without its name, *** THIS IS WHY WE CAN CREATE INSTANCE OF A CASE CLASS WITHOUT "new" KEYWORD ***
    private val dino4 = Pet("Dino", 4)

    /**
     * 6. Case classes are Serializable
     */

    /**
     * 7. Case objects:
     *  - Can define fields and methods same as case classes, but we cannot create multiple instances of a case object, as it is an object,
     *      so it is the only instance of its type
     */

    def main(args: Array[String]): Unit = {
        println("toString representations:")
        println(s"Normal class instance toString = ${dinoSimple.toString}")
        println(s"Case class instance toString = ${dino.toString}")
        println

        println("equals method:")
        val normal1 = new PetSimple("petSimple", 4)
        val normal2 = new PetSimple("petSimple", 4)
        val normalCheck = normal1 == normal2
        val case1 = new Pet("pet", 2)
        val case2 = new Pet("pet", 2)
        val caseCheck = case1 == case2
        println(s"Normal class instances with same data: $normalCheck")
        println(s"Case class instances with same data: $caseCheck")
        println

        println("copy method:")
        println(s"dino = ${dino.toString}, dinoCopy = ${dinoCopy.toString}, dinoCopyYounger = ${dinoCopyYounger.toString}")
        println
    }
}
