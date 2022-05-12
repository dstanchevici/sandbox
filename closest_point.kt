package sandbox

// Sedgewick Program 3.7
// Counts the number of pairs of [among?] n randomly generated points in the unit square that can be connected by a straight line
// of length less than d, using the data type for points in Point.

fun main(){
    var cnt = 0
    val numberOfPoints = 10
    val distance = 0.4

    val a = Point(1.0, 1.0)
    val b = Point(2.0, 2.0)

    val points: Array<Point> = Array(numberOfPoints){Point()}

    for (i in 0 until numberOfPoints){

        for (j in i +1 until numberOfPoints){
            if (points[i].distance(points[j]) < distance)
                cnt++
        }
    }

    print("$cnt pairs are ")
    println("closer than $distance.")
}