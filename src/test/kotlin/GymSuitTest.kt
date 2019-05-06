import org.junit.Test
import kotlin.test.assertEquals

class GymSuitTest {
    @Test
    fun `기본 결과값1`() {
        assertEquals(
            5,
            GymSuit.solution(5, intArrayOf(2, 4), intArrayOf(1, 3, 5))
        )
    }

    @Test
    fun `기본 결과값2`() {
        assertEquals(
            4,
            GymSuit.solution(5, intArrayOf(2, 4), intArrayOf(3))
        )
    }

    @Test
    fun `기본 결과값3`() {
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

    @Test
    fun `1명만 여벌이 있는 경우`() {
        assertEquals(
            2,
            GymSuit.solution(6, intArrayOf(1, 2, 3, 4, 5), intArrayOf(6))
        )
    }

    @Test
    fun `여별을 가져왔지만 도난당한 경우1`() {
        assertEquals(
            2,
            GymSuit.solution(6, intArrayOf(1, 2, 3, 4, 5, 6), intArrayOf(4, 5))
        )
    }

    @Test
    fun `여별을 가져왔지만 도난당한 경우2`() {
        assertEquals(
            1,
            GymSuit.solution(6, intArrayOf(1, 2, 3, 4, 5, 6), intArrayOf(6))
        )
    }

    @Test
    fun `여별을 가져왔지만 도난당한 경우3`() {
        assertEquals(
            5,
            GymSuit.solution(5, intArrayOf(1, 2, 3, 4, 5), intArrayOf(1, 2, 3, 4, 5))
        )
    }

    @Test
    fun `여별을 가져왔지만 도난당한 경우4`() {
        assertEquals(
            5,
            GymSuit.solution(5, intArrayOf(1), intArrayOf(1, 4, 5))
        )
    }

    @Test
    fun `여별을 가져왔지만 도난당한 경우5`() {
        assertEquals(
            4,
            GymSuit.solution(5, intArrayOf(1, 2), intArrayOf(1, 4, 5))
        )
    }

    @Test
    fun `여별을 가져왔지만 도난당한 경우6`() {
        assertEquals(
            4,
            GymSuit.solution(5, intArrayOf(1, 2, 3), intArrayOf(1, 3, 4, 5))
        )
    }

    @Test
    fun `여별을 가져왔지만 도난당한 경우7`() {
        assertEquals(
            2,
            GymSuit.solution(4, intArrayOf(1, 2, 3, 4), intArrayOf(2, 4))
        )
    }

    @Test
    fun `여별을 가져왔지만 도난당한 경우8`() {
        assertEquals(
            3,
            GymSuit.solution(5, intArrayOf(1, 2, 4, 5), intArrayOf(2, 5))
        )
    }

    @Test
    fun `여별을 가져왔지만 도난당한 경우9`() {
        assertEquals(
            4,
            GymSuit.solution(5, intArrayOf(4, 5), intArrayOf(5))
        )
    }
}