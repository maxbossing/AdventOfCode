package y2024

import utils.*

class Day04(val input: String) {
    private val regex = Regex("(?=(XMAS|SAMX))")

    private val horizontal = input.lines()

    private val vertical = input.lines()
        .map { it.toList() }
        .transpose()
        .map { it.joinToString { "" } }

    private val diagonalLtoR = input.lines()
        .map { it.toList() }
        .diagonalTranspose()
        .map { it.joinToString { "" } }

    private val diagonalRtoL = input.lines()
        .map { it.toList() }
        .antiDiagonalTranspose()
        .map { it.joinToString { "" } }

    fun part1():Int = horizontal.sumOf { regex.findAll(it).count() } +
            vertical.sumOf { regex.findAll(it).count() } +
            diagonalLtoR.sumOf { regex.findAll(it).count() } +
            diagonalRtoL.sumOf { regex.findAll(it).count() }

    fun part2():Int {
        var result = 0
        (1..horizontal.size - 2).forEach { i ->
            (1..horizontal[i].length - 2).forEach inner@{ j ->
                if (horizontal[i][j] != 'A') return@inner
                if (!((horizontal[i - 1][j - 1] == 'S' && horizontal[i + 1][j + 1] == 'M') || (horizontal[i - 1][j - 1] == 'M' && horizontal[i + 1][j + 1] == 'S'))) return@inner
                if (!((horizontal[i + 1][j - 1] == 'S' && horizontal[i - 1][j + 1] == 'M') || (horizontal[i + 1][j - 1] == 'M' && horizontal[i - 1][j + 1] == 'S'))) return@inner
                result++
            }
        }
        return result
    }
}