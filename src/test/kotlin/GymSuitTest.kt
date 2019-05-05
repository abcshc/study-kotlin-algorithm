import org.junit.Test
import kotlin.test.assertEquals

class GymSuitTest {
    @Test
    fun `기본 결과값`() {
        assertEquals(
            5,
            GymSuit.solution(5, intArrayOf(2, 4), intArrayOf(1, 3, 5))
        )

        assertEquals(
            4,
            GymSuit.solution(5, intArrayOf(2, 4), intArrayOf(3))
        )
        assertEquals(
            2,
            GymSuit.solution(3, intArrayOf(3), intArrayOf(1))
        )
    }

    @Test
    fun `최소값 2명`() {
        assertEquals(
            2,
            GymSuit.solution(2, intArrayOf(1), intArrayOf(2))
        )
    }

    @Test
    fun `최대값 30명`() {
        assertEquals(
            27,
            GymSuit.solution(30, intArrayOf(1, 2, 3, 4), intArrayOf(5))
        )

    }
}