import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import y2024.Day04
import kotlin.system.measureNanoTime
import kotlin.test.Test

@DisplayName("Year 2024 Day 4")
class Day04Test {

    @Nested
    @DisplayName("Part 1")
    inner class Part1 {
        @Test
        fun `Example Input`() {
            val input = Resources.resourceAsText("Day04_Test.txt")
            val answer = Day04(input).part1()
            assertThat(answer)
                .isEqualTo(18)
        }
        @Test
        fun `Actual Input`() {
            val input = Resources.resourceAsText("Day04.txt")
            var answer: Int
            val time = measureNanoTime {
                answer = Day04(input).part1()
            }
            println("Answer: $answer, took ${time / 1_000_000}ms")
        }
    }

    @Nested
    @DisplayName("Part 2")
    inner class Part2 {
        @Test
        fun `Example Input`() {
            val input = Resources.resourceAsText("Day04_Test.txt")
            val answer = Day04(input).part2()
            assertThat(answer)
                .isEqualTo(9)
        }
        @Test
        fun `Actual Input`() {
            val input = Resources.resourceAsText("Day04.txt")
            var answer: Int
            val time = measureNanoTime {
                answer = Day04(input).part2()
            }
            println("Answer: $answer, took ${time / 1_000_000}ms")
        }
    }

}