package sandbox

import kotlin.math.sqrt

// Sedgewick Program 3.2, illustrating classes

/*
    The java.lang.Math.random() method returns a pseudorandom double type number
    greater than or equal to 0.0 and less than 1.0.
 */

class Point (var x: Double = Math.random(), var y: Double = Math.random() ) {
    fun r() = sqrt(x*x + y*y)

    fun theta() = Math.atan2(y, x)

    fun distance(p: Point): Double {
        val dx = x - p.x
        val dy = y - p.y
        return sqrt(dx*dx + dy*dy)
    }

    public override fun toString() = "($x, $y)"
}