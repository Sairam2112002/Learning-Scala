package oop

object AbstractClassesAndTraits {

    /**
     * Abstract Classes:
     *  - Fields and methods without implementation called abstract fields and methods can be provided
     *  - Can also provide normal methods and fields i.e with implementation
     *  - Cannot be instantiated on its own
     *  - Derived classes must be either abstract or implement all abstract fields and methods.
     *  - Anonymous classes must implement all abstract fields and methods
     */

    private abstract class VideoGame {
        val gameType: String
        def play(): String

        val runningPlatform: String = "PC"
    }

    // Derived class
    private class Shooter extends VideoGame {
        override val gameType: String = "FPS"

        override def play(): String = "fire!"
    }

    // Anonymous class
    private val sampleVideoGame: VideoGame = new VideoGame {
        override val gameType: String = "A custom genre"
        override def play(): String = "action!"
    }

    /**
     * Traits:
     *  - Cannot be instantiated on its own
     *  - Fields and methods without implementation called abstract fields and methods can be provided
     *  - Can also provide normal methods and fields i.e with implementation
     *  - Traits can be extended by other traits and classes
     *  - Derived traits need not implement abstract fields and methods
     *  - Derived classes must be either abstract or implement all abstract fields and methods.
     *  - Anonymous classes must implement all abstract fields and methods
     *
     *  - "A class can extend ONLY ONE class, but can extend MULTIPLE traits (Multiple Inheritance)"
     */

    private trait ThirdPerson {
        def showPerspective(): String
    }

    private trait Storyline {
        val mainCharacters: String
    }

    private trait OpenWorld extends ThirdPerson {
        override def showPerspective(): String = {
            "I see myself from back and also see an open world"
        }
    }

    private class RPG extends ThirdPerson {
        override def showPerspective(): String = {
            "I see myself from front, back, side and also see an open world"
        }
    }

    private val sampleVideoGame2 = new ThirdPerson {
        override def showPerspective(): String = "A custom perspective"
    }

    private class GTAV extends VideoGame with OpenWorld with Storyline {

        override val gameType: String = "open-world story"
        override def play(): String = "taking down rivals"
        override val mainCharacters: String = "Michael De Santa, Franklin Clinton, Trevor Phillips"
    }

    def main(args: Array[String]): Unit = {
        println("Abstract Classes:")

        val counterStrike = new Shooter

        println(s"${counterStrike.gameType}, ${counterStrike.play()}, ${counterStrike.runningPlatform}")
        println(s"${sampleVideoGame.gameType}, ${sampleVideoGame.play()}, ${sampleVideoGame.runningPlatform}")
        println

        println("Traits:")

        val witcher3: RPG = new RPG
        val gtaV: GTAV = new GTAV

        println(witcher3.showPerspective())
        println(s"${sampleVideoGame2.showPerspective()}")
        println(s"${gtaV.gameType}, ${gtaV.play()}, ${gtaV.runningPlatform}, ${gtaV.mainCharacters}")
    }
}
