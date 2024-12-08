package y2024

class Day05(val input: String) {
    val rules = input
        .split(Regex("\\R\\s*\\R"))
        .toList()[0]
        .split("\n")
        .map { it.trim() }
        .filter { it.isNotBlank() }
        .map { it.split("|") }
        .map { it[0].trim().toInt() to it[1].trim().toInt() }

    val books = input
        .split(Regex("\\R\\s*\\R"))
        .toList()[1]
        .split("\n")
        .map { it.trim() }
        .filter { it.isNotBlank() }
        .map { it.split(",").map { it.toInt() } }

    fun part1() = books.filter { pages ->
        rules.all { (before, after) ->
            if (before !in pages || after !in pages) return@all true
            return@all pages.indexOf(before) < pages.indexOf(after)
        }
    }.sumOf { it[it.size / 2] }

    fun part2(): Int {
        TODO("Unfinished")
        val incorrectly = books.filter { pages ->
            rules.all { (before, after) ->
                if (before !in pages || after !in pages) return@all true
                return@all pages.indexOf(before) < pages.indexOf(after)
            }
        }

        incorrectly.forEach outer@{ pages ->
            pages.forEachIndexed { index, i ->
                rules.filter { it.first == i }
            }
        }
        return 0
    }
}