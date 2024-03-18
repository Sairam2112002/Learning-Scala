package learning.scala.oop

// Exercise
/**
 * 1. Imagine we are creating an app for car registration
 *      - Create Car and Driver Classes
 *      - Driver will have: first name, last name : Strings, year of birth: Int
 *          - method to create full name from first and last names
 *      - Car will have: make, model : Strings, year of release : Int, owner : Driver
 *          - method to determine the owner age at the year of release
 *          - method isOOwnedBy(driver: Driver): Boolean = if the driver is same as the owner
 *          - method copy(newYearOfRelease: Int): Car = returns a Car instance with same data, but with updated year of release
 */

object OOPExercise {

    class Driver(val firstName: String, val lastName: String, val yearOfBirth: Int) {
        def getFullName: String = {
            s"$firstName $lastName"
        }
    }

    class Car(val make: String, val model: String, var yearOfRelease: Int, val owner: Driver) {
        def ownerAgeAtTheYearOfRelease: Int = {
            yearOfRelease - owner.yearOfBirth
        }

        def isOwnedBy(driver: Driver):Boolean = {
            driver == owner
        }

        def copy(newYearOfRelease: Int): Car = {
            new Car(make, model, newYearOfRelease, owner)
        }
    }

    def main(args: Array[String]): Unit = {
        val driverHarry = new Driver("Harry", "Potter", 1980)
        val driverRon = new Driver("Ron", "Weasley", 1980)
        val driverHermione = new Driver("Hermione", "Granger", 1979)
        val driverAlbus = new Driver("Albus", "Dumbledore", 1881)
        val driverSnape = new Driver("Severus", "Snape", 1960)

        val car1 = new Car("Tesla", "Model S", 2020, driverHarry)
        val car2 = new Car("Mercedes", "E-Class", 2021, driverAlbus)
        val car3 = new Car("BMW", "7 Series", 2021, driverHermione)
        val car4 = new Car("Audi", "A8", 2020, driverHermione)
        val car5 = new Car("Lexus", "LS", 2021, driverSnape)
        val car6 = new Car("Porsche", "Panamera", 2021, driverRon)
        val car7 = new Car("Bentley", "Continental GT", 2020, driverSnape)
        val car8 = new Car("Rolls-Royce", "Phantom", 2021, driverHarry)
        val car9 = new Car("Aston Martin", "DB11", 2020, driverAlbus)
        val car10 = new Car("Maserati", "Quattroporte", 2021, driverRon)

        println(s"Harry's full name is ${driverHarry.getFullName}")
        println(s"${driverSnape.getFullName} was born in ${driverSnape.yearOfBirth}")
        println

        println(s"${car2.make} ${car2.model} was released in ${car2.yearOfRelease} and is owned by ${car2.owner.getFullName}")
        println(s"${car4.owner.getFullName} was ${car4.ownerAgeAtTheYearOfRelease} years old when her ${car4.make} ${car4.model} was released")
        println(s"Is ${car6.make} ${car6.model} owned by ${driverRon.getFullName} ? : ${car6.isOwnedBy(driverRon)}")

        val updateCar: Unit = {
            println(s"${car8.owner.getFullName} have a ${car8.yearOfRelease} ${car8.make} ${car8.model}")

            val car8New = car8.copy(2024)

            println(s"${car8New.owner.getFullName} also bought a new ${car8New.yearOfRelease} ${car8New.make} ${car8New.model}")
        }
    }
}
