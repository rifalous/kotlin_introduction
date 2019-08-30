import org.junit.Assert
import org.junit.Test

class Test {

    private fun String.checkFunction() {
        val result = mapOf(
                "first" to this[0],
                "last" to this[this.lastIndex]
        )

        Assert.assertEquals("Fungsi getFirstAndLast seharusnya mengembalikan nilai $result" , result, this.getFirstAndLast())
    }

    @Test
    fun test1() = "Kotlin".checkFunction()

    @Test
    fun test2() = "Academy".checkFunction()

    @Test
    fun test3() = "Fundamental".checkFunction()

    @Test
    fun test4() = "Dicoding".checkFunction()
}