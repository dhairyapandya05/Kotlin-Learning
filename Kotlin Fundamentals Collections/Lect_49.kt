val mylist=listOf("Dhairya","Tarun","Maarja")
    
println(mylist)

// foreach loop in kotlin (immutable)
val mylist=listOf("Dhairya","Tarun","Maarja")
    
    mylist.forEach{
        print("$it ");
    }

// Mutable list of list
val Mutablemylist=mutableListOf(12,45,26)
    
    
    Mutablemylist.forEach{
        print("$it ");
    }
    println("")
    Mutablemylist.add(123)
    Mutablemylist.forEach{
        print("$it ");
    }

