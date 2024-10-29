// using sets//stores unique entries
val myset = setOf("US","MZ","AU")

// MUTALBE
val myset = mutableSetOf("US","MZ","AU","AU")
    myset.add("DF");
    println(myset);


    // map
    val mymp = mapOf("US" to 1,"IN" to 2)
    
    println(mymp["US"]);


    // Using filters in list
    fun main() {
        // Create a list of integers
        val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    
        // Filter out even numbers using the filter function with a trailing lambda
        val evenNumbers = numbers.filter { it % 2 == 0 }
    
        // Print the filtered list
        println("Even Numbers: $evenNumbers")
    }
    