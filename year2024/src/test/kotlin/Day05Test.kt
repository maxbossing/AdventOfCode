import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import y2024.Day05
import kotlin.system.measureNanoTime
import kotlin.test.Test

@DisplayName("Year 2024 Day 5")
class Day05Test {

    @Nested
    @DisplayName("Part 1")
    inner class Part1 {
        @Test
        fun `Example Input`() {
            val input = Resources.resourceAsText("Day05_Test.txt")
            val answer = Day05(input).part1()
            assertThat(answer)
                .isEqualTo(143)
        }
        @Test
        fun `Actual Input`() {
            val input = Resources.resourceAsText("Day05.txt")
            var answer: Int
            val time = measureNanoTime {
                answer = Day05(input).part1()
            }
            println("Answer: $answer, took ${time / 1_000_000}ms")
        }
    }

    @Nested
    @DisplayName("Part 2")
    inner class Part2 {
        @Test
        fun `Example Input`() {
            val input = Resources.resourceAsText("Day05_Test.txt")
            val answer = Day05(input).part2()
            assertThat(answer)
                .isEqualTo(31)
        }
        @Test
        fun `Actual Input`() {
            val input = Resources.resourceAsText("Day05.txt")
            var answer: Int
            val time = measureNanoTime {
                answer = Day05(input).part2()
            }
            println("Answer: $answer, took ${time / 1_000_000}ms")
        }
    }

}