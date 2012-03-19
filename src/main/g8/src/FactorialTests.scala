import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner
import org.scalatest.prop.Checkers

/**
 * Tests of the factorial function.
 */
@RunWith(classOf[JUnitRunner])
class FactorialTests extends FunSuite {

    import Factorial.factorial

    test ("factorial zero is one") {
        expect (1) (factorial (0))
    }

    test ("factorial one is one") {
        expect (1) (factorial (1))
    }

    test ("factorial two is two") {
        expect (2) (factorial (2))
    }

    test ("factorial three is six") {
        expect (6) (factorial (3))
    }

    test ("factorial four is twenty four") {
        expect (24) (factorial (4))
    }

}
