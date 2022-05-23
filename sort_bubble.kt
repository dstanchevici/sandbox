package sandbox

// Bubble sort

private fun bubbleSort(a: IntArray){
    for (pass in 0 until a.size){
        var alreadySorted = true

        for (i in 0 until a.lastIndex - pass){
            if (a[i] > a[i+1]){
                val t = a[i]
                a[i] = a[i+1]
                a[i+1] = t
                alreadySorted = false
            }
        }

        if (alreadySorted) break
    }

}

fun main(){
    val a = intArrayOf(7, 5, 9, 6, 0, 1, 10, 6)
    bubbleSort(a)
    println(a.joinToString())
}