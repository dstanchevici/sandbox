package sandbox

/***
Insertion sort is a simple sorting algorithm that works similar to the way you sort playing cards in your hands.
The array is virtually split into a sorted and an unsorted part.
Values from the unsorted part are picked and placed at the correct position in the sorted part.

Characteristics of Insertion Sort:
This algorithm is one of the simplest algorithm with simple implementation
Basically, Insertion sort is efficient for small data values
Insertion sort is adaptive in nature, i.e. it is appropriate for data sets which are already partially sorted.
 */


private fun insertionSort(a: IntArray){
    for (i in 1..a.lastIndex){
        val currentValue = a[i] // taking turn to sort each element from left to right.
        var vacantIndex = i // It is possible that the sorted elements on the left will have to be shifted one position to the right.

        while (vacantIndex > 0 && a[vacantIndex-1] > currentValue){
            a[vacantIndex] = a[vacantIndex-1] // right shift of greater values
            vacantIndex-- // moving left to next comparison in the sorted part of the array
        }

        a[vacantIndex] = currentValue // Placing the currentValue into the slot that has become vacant as the result of the right shift
    }
}


fun main(){
    val a = intArrayOf(7, 4, 8, 0, 3)
    insertionSort(a)
    println(a.joinToString())
}