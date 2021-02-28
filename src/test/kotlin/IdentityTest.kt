import kotlin.test.Test
import kotlin.test.assertEquals

class IdentityTest {
    @Test
    fun `does compose`() {
        val numberList = listOf(1, 2, 3).size
        val composedNumber = compose(numberList, { size -> size + 1 }, { it - 100 })
        assertEquals(composedNumber, -96)
    }

    @Test
    fun `composition respects identity`() {
        val numberslist = listOf<Int>(1, 2, 3)
        val composition = compose(numberslist, { size -> size + 1 }, { it - 100 })
        val identity = identity(composition)
        assertEquals(composition, identity)
    }
}