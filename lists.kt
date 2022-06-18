package sandbox

fun deal(deck: MutableList<Char>, hands: List<MutableList<Char>>){
    for (hand in hands){
        while (hand.size < 3){
            hand.add(deck.first())
            deck.removeFirst()
        }
    }
}

fun main(){
    val deck = mutableListOf('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j')

    val hand1 = mutableListOf<Char>()
    val hand2 = mutableListOf<Char>()
    val hands = listOf(hand1, hand2)

    deal(deck, hands)
    print("Deck:")
    deck.forEach { print(it) }

    print("\nHand 1: ")
    hand1.forEach { print(it) }

    print("\nHand 2: ")
    hand2.forEach { print(it) }





}