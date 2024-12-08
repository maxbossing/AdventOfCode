import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import y2024.Day01
import kotlin.system.measureNanoTime
import kotlin.test.Test

@DisplayName("Year 2024 Day 1")
class Day01Test {

    @Nested
    @DisplayName("Part 1")
    inner class Part1 {
        @Test
        fun `Example Input`() {
            val input = Resources.resourceAsListOfString("Day01_Test.txt")
            val answer = Day01(input).part1()
            assertThat(answer)
                .isEqualTo(11)
        }
        @Test
        fun `Actual Input`() {
            val input = Resources.resourceAsListOfString("Day01.txt")
            var answer: Int
            val time = measureNanoTime {
                answer = Day01(input).part1()
            }
            println("Answer: $answer, took ${time / 1_000_000}ms")
        }
    }

    @Nested
    @DisplayName("Part 2")
    inner class Part2 {
        @Test
        fun `Example Input`() {
            val input = Resources.resourceAsListOfString("Day01_Test.txt")
            val answer = Day01(input).part2()
            assertThat(answer)
                .isEqualTo(31)
        }
        @Test
        fun `Actual Input`() {
            val input = Resources.resourceAsListOfString("Day01.txt")
            var answer: Int
            val time = measureNanoTime {
                answer = Day01(input).part2()
            }
            println("Answer: $answer, took ${time / 1_000_000}ms")
        }
    }

}