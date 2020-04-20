import org.scalatest.funsuite.AnyFunSuiteLike

/**
 * Tests of the factorial function.
 */
class FactorialTests extends AnyFunSuiteLike {

    import Factorial.factorial

    test ("factorial zero is one") {
        assertResult (1) (factorial (0))
    }

    test ("factorial one is one") {
        assertResult (1) (factorial (1))
    }

    test ("factorial two is two") {
        assertResult (2) (factorial (2))
    }

    test ("factorial three is six") {
        assertResult (6) (factorial (3))
    }

    test ("factorial four is twenty four") {
        assertResult (24) (factorial (4))
    }

}
