package sandbox

// Quick sort algorithm

private fun swap(a: IntArray, x: Int, y: Int){
    val t = a[x]
    a[x] = a[y]
    a[y] = t
}


private fun partition(a: IntArray, start: Int, end: Int): Int{
    val pivot = a[end]
    var partitionIndex = start // initial setting

    for (i in start until end){
        if (a[i] <= pivot){
            swap(a, i, partitionIndex)
            partitionIndex++
        }
    }

    swap(a, partitionIndex, end)
    return partitionIndex
}


private fun quickSort(a: IntArray, start: Int, end: Int){
    if (start < end){
        val partitionIndex = partition(a, start, end)
        quickSort(a, start, partitionIndex-1)
        quickSort(a, partitionIndex+1, end)
    }
}


fun main(){
    val a = intArrayOf(7, 2, 1, 6, 8, 5, 3, 4)
    quickSort(a, 0, a.lastIndex)
    for (ch in a){
        print("${ch}, ")
    }
}