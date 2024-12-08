package y2024

class Day06(var input: List<String>) {

    private val guardChars = charArrayOf('^', 'v', '<', '>')

    fun solveField(field: MutableList<MutableList<Char>>): Int {
        var y = field.indexOfFirst { s -> guardChars.any { s.contains(it) } }
        var x = field[y].indexOfFirst { it in guardChars }
        var steps = 0
        while ((y  in 0..<field.size && x in 0..<field[0].size)) {
            var guard = field[y][x]
            when (guard) {
                '^' -> {
                    if (y == 0) break
                    if (field[y - 1][x] == '#') {
                        //println("rotate >")
                        guard = '>'
                    } else {
                        //println("incr y")
                        y--
                    }
                }

                'v' -> {
                    if (y >= field.size-1) break
                    if (field[y + 1][x] == '#') {
                        //println("rotate <")
                        guard = '<'
                    }else {
                        //println("decr y")
                        y++
                    }
                }

                '>' -> {
                    if (x >= field.size-1) break
                    if (field[y][x + 1] == '#') {
                        //println("rotate v")
                        guard = 'v'
                    }else {
                        //println("incr x")
                        x++
                    }
                }

                '<' -> {
                    if (x == 0) break
                    if (field[y][x - 1] == '#') {
                        //println("rotate ^")
                        guard = '^'
                    } else {
                        //println("decr x")
                        x--
                    }
                }
            }
            field[y][x] = guard
            steps++
            if (steps > 10_000) return -1
        }
        //field.forEach(::println)
        return field.sumOf { it.count { it in guardChars } }
    }

    fun part1(): Int = solveField(input.map { it.toMutableList() }.toMutableList())

    fun part2(): Int {
        var loop = 0
        y@for (y in input.indices) {
            x@for (x in input[y].indices) {
                if (input[y][x] == '#' || input[y][x] in guardChars) continue@x
                //println("trying with $y $x")
                if (solveField(input.map { it.toMutableList() }.toMutableList().apply { this[y][x] = '#' }) == -1){
                    //println("loop")
                    loop++
                } else {
                    //println("no loop")
                }
            }
        }
        return loop
    }
}