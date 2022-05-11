package sandbox

// Sedgewick Program 3.2 Coin-Flipping Simulator

// The program runs the experiment of executing n coin flips. This experiment is run m times.
// An array keeps track of the frequency of occurrence of the outcome "i heads" for 0<=i<=n.
// A histogram is printed of the result of the experiments, with one asterisk for each 10 occurrences.

private fun heads(): Boolean {
    return Math.random() < 0.5
}

fun main(){
    val n = 32
    val m = 1000
    val f = IntArray(n + 1){0} // Number of flips plus 1 is the number of possible results.

    // Repeat the experiment m times
    for (i in 0 until m){
        // Reset the cnt to 0 for next experiment.
        var cnt = 0

        // Conduct one experiments of n flips and record the count of heads.

        for (j in 0..n){ // We need n+1 (..n) b/c we're tallying possible results (results + 1), not only flips.
            if (heads()) cnt++
        }
        // Print cnt after every experiment
        println(cnt)

        // Use the cnt of every experiment as the index of the f array.
        // After every experiment with such a cnt increase the int value in f[cnt], thus keeping track
        // of the number experiments with a specific outcome (that is with a specific number of heads).
        f[cnt]++
    }

    // Print out the f array
    println("""
        ------------------------------------------------------------
        After $m experiments of $n flips each, here are the results:""".trimIndent())
    println()
    for (i in 0 ..n){
        println("Result <$i of heads> occurred in ${f[i]} experiments")
    }

    // Print a histogram
    for (j in 0..n){
        if (f[j] == 0)
            print(".")

        var i = 0
        while (i < f[j]){
            print("*")
            i += 10
        }

        println()
    }




}