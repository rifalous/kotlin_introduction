import org.junit.Assert
import org.junit.Test

class Test {

    @Test
    fun testNonNull() {
        Assert.assertEquals("Fungsi calculate() seharusnya mengembalikan nilai  39", "Result is 39", calculate(65, 52, 78))
    }
}