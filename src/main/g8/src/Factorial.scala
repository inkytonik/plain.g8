/**
 * Factorial module.
 */
object Factorial {

    def factorial (i : Int) : Int =
        if ((i == 0) || (i == 1))
            1
        else
            i * factorial (i - 1)
    
}
