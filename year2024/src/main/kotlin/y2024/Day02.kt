package y2024

import kotlin.math.abs
import utils.removeAt

class Day02(val input: List<String>) {
    private val rows = input.map { it.split(" ").map { it.toInt() } }

    fun part1() = rows.count {
        it.windowed(2).map { (current, next) ->
            abs(current - next) in 1..3 && current < next
        }.all { it } ||  it.windowed(2).map { (current, next) ->
            abs(current - next) in 1..3 && current > next
        }.all { it }
    }

    fun part2() = rows.count { l ->
        l.indices.any { i ->
            l.removeAt(i).let { it ->
                it.windowed(2).map { (current, next) ->
                    abs(current - next) in 1..3 && current < next
                }.all { it } ||  it.windowed(2).map { (current, next) ->
                    abs(current - next) in 1..3 && current > next
                }.all { it }
            }
        }
    }
}