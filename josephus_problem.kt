package sandbox

// Sedgewick Program 3.8
// Use of a (circular) linked list for solving a Josephus problem
// in which people stand in a circle and the person on whom
// the specified count falls steps out. The game continues until the last person.

private class Node (val i: Int) {
    var item = i
    var next = this
}

fun main(){
    val numberOfPeople = 9
    val countOff = 5

    val first = Node(1) // Until changed first.next refers to itself (contains a reference/address/link to itself)
    var x = first // Use x to create multiple objects of Node
    println("x.item: ${x.item}; x.next: ${x.next}")
    println("------------------------------------")

    for (i in 2..numberOfPeople){
        val temp = Node(i)
        println("temp.item: ${temp.item}; temp.next: ${temp.next}")
        x.next = temp
        println("x.item: ${x.item}; x.next: ${x.next}")
        x = temp
        println("x.item: ${x.item}; x.next: ${x.next}")
        println("------------------------------------")
    }
    x.next = first
    println("x.item: ${x.item}; x.next: ${x.next}")

    while (x != x.next){
        for (i in 1 until countOff)
            x = x.next
        x.next = x.next.next
    }

    println("Survivor is ${x.item}")

}