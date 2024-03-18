package learning.scala.oop

object Inheritance {

    /**
     * Inheritance is a mechanism that allows one class to inherit the features (attributes and methods) of another class.
     * This helps to reuse, extend, or modify the attributes and methods of an existing class.
     */

    /**
     * 1. Single Inheritance: In single inheritance, subclasses inherit the features of one superclass.
     *
     * 2. Multilevel Inheritance: In Multilevel Inheritance, a derived class will be inheriting a base class,
     * and as well as the derived class also acts as the base class for other classes.
     *
     * 3. Hierarchical Inheritance: In Hierarchical Inheritance, one class serves as a superclass (base class) for more than one subclass.
     *
     * 4. Multiple Inheritance: In Multiple inheritances, one class can have more than one superclass and inherit features from all parent classes.
     *
     * 5. Hybrid Inheritance: It is a mix of two or more of the above types of inheritance.
     */

    private class Person(val name: String, val gender: String, val age: Int) {
        def greet(): Unit =
            println(s"Hi, I'm $name and I'm $age years old.")

        def isAdult: Boolean =
            age > 18
    }

    private class Employee(name: String, gender: String, age: Int, val employeeID: Int, val department: String) extends Person(name, gender, age) {
        def work(): Unit =
            println(s"$name is working in the $department department.")

        def showEmployeeID(): Unit =
            println(s"My employee ID is $employeeID.")
    }

    private class Engineer(name: String, gender: String, age: Int, employeeID: Int, department: String, val level: Int) extends
            Employee(name, gender, age, employeeID, department) {
        def currentLevel(): Unit =
            println(s"$name is currently in $level level")
    }

    private class Architect(name: String, gender: String, age: Int, employeeID: Int, department: String, val field: String) extends
            Employee(name, gender, age, employeeID, department) {
        def fieldOfExpertise(): Unit =
            println(s"$name is an architect having expertise in $field architecture")
    }

    private val person1 = new Person("John", "Male", 30)
    private val person2 = new Person("Jane", "Female", 25)

    private val employee1 = new Employee("Jack", "Male", 32, 101, "Marketing")
    private val employee2 = new Employee("Jill", "Female", 28, 102, "Finance")

    private val engineer1 = new Engineer("Ashley", "Male", 35, 103, "Engineering", 4)
    private val engineer2 = new Engineer("Bella", "Female", 33, 104, "Engineering", 5)

    private val architect1 = new Architect("Carlos", "Male", 40, 105, "Architecture", "Solution")
    private val architect2 = new Architect("Diana", "Female", 38, 106, "Architecture", "Quality")

    def main(args: Array[String]): Unit = {
        person1.greet()
        println(person1.isAdult)
        println(person1.name)
        println("----------------------------------------")

        person2.greet()
        println(person2.isAdult)
        println(person2.age)
        println("----------------------------------------")

        employee1.work()
        employee1.showEmployeeID()
        println(employee1.department)
        println("----------------------------------------")

        employee2.work()
        employee2.showEmployeeID()
        println(employee2.department)
        println("----------------------------------------")

        engineer1.currentLevel()
        println(engineer1.level)
        println(engineer1.gender)
        println("----------------------------------------")

        engineer2.currentLevel()
        println(engineer2.level)
        println(engineer2.gender)
        println("----------------------------------------")

        architect1.fieldOfExpertise()
        println(architect1.field)
        println(architect1.name)
        println("----------------------------------------")

        architect2.fieldOfExpertise()
        println(architect2.field)
        println(architect2.name)
        println("----------------------------------------")
    }
}
