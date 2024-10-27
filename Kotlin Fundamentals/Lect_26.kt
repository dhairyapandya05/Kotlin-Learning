fun main() {
    val name error beacuase it is immutable object
    name="Dhairya"

    print(name)
}

// THis is also not allowed 
fun main() {
    var name
    name="Dhairya"

    print(name)
}
//Important: We ahve to specify what type of oeject we are going to store in var variable 
this is correct 
fun main() {
    val name:String
    name="Dhairya"

    print(name)
}
also this one 
fun main() {
    var name:String
    name="Dhairya"

    print(name)
}

fun main() {
    var name:String
    name="Dhairya"
	name="hhhhh"
    print(name)
}//Output: hhhhh