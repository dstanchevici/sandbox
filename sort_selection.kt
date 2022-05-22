package sandbox

/***
 * The selection sort algorithm sorts an array by
 * repeatedly finding the minimum element (considering ascending order) from unsorted part and
 * putting it at the beginning.
 *
 * Two approaches are possible: Either store the sorted values in a separate array.
 * Or, sort in place by swapping the minimum element with the currently
 * used array element.
 */


private fun swap(a: IntArray, i: Int, j: Int){
    val temp = a[i]
    a[i] = a[j]
    a[j] = temp
}


private fun selectionSort(a: IntArray){
    for (leftIndex in 0 until a.lastIndex){
        var indexOfMin = leftIndex

        for (i in leftIndex+1 .. a.lastIndex){
            if (a[i] < a[indexOfMin])
                indexOfMin = i
        }

        if (a[leftIndex] > a[indexOfMin])
            swap(a, leftIndex, indexOfMin)
    }

}

fun main(){
    val a = intArrayOf(7, 9, 0, 1)
    selectionSort(a)
    println(a.joinToString())
}