package sandbox


class Matrix(val size: Int) {
    private val data = IntArray(size * size)

    fun getAt(x: Int, y: Int)           = data[y * size + x]
    fun setAt(x: Int, y: Int, n: Int)   { data[y * size + x] = n }

    private operator fun get(x: Int, y: Int) = getAt(x, y)
    operator fun set(x: Int, y: Int, n: Int) = setAt(x, y, n)

     override  fun toString(): String {
        val builder = StringBuilder()

        for (y in 0..size-1) {
            for(x in 0.. size-1) {
                builder.append(get(x, y))
                builder.append(" | ")
            }
            builder.append("\n")
        }

        return builder.toString()
    }
}


fun main() {
    val m = Matrix(3)
    m.setAt(0, 0, 7)
    m.setAt(1, 1, 7)
    m.setAt(2, 2, 7)

    println(m)

    m[2, 0] = 5
    m[1, 1] = 5
    m[0, 2] = 5

    println(m)

    println(m.getAt(1, 1))

    m[1, 1] = 15
    println(m)

    m[0, 0] = 22
    println(m)
}
