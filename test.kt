interface Matcher<T> {
    fun test(lhs: Any?)

    infix fun or(other: Matcher<T>): Matcher<T> = object : Matcher<T>{
        override fun test(lhs: Any?) {
            try{
                this@Matcher.test(lhs)
            } catch (e: RuntimeException){
                other.test(lhs)
            }
        }
    }
}

infix fun <T> T.should(matcher: Matcher<T>) {
    matcher.test(this)
}

infix fun <T> Collection<T>.should(fn: CollectionMatchers<T>.()-> Unit){
    val matchers = CollectionMatchers(this)
    matchers.fn()
}

class CollectionMatchers<T>(val collection: Collection<T>){
    fun contains(rhs: T) {
        if (!collection.contains(rhs))
            throw RuntimeException("Collection did not contain $rhs")
    }

    fun notContains(rhs: T) {
        if (collection.contains(rhs))
            throw RuntimeException("Collection should not contain $rhs")
    }

    fun haveSizeLessThen(size: Int) {
        if (collection.size >= size)
            throw RuntimeException("Collection should have size less than $size")
    }
}

fun unitTest(){
    val listOfNames = listOf("April", "May", "June")
    listOfNames should { notContains("Portia")} // so here we test that a list should not contain a certain name
    listOfNames should { contains("June")} // here we are testing that the list must contain "June"
    listOfNames should { haveSizeLessThen(25)}
}

