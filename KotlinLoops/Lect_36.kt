for(i in 1..3){
    print(i)
}

// parameterised function
fun sayHello(name:String){
    print("Hello World $name")
}
fun main() {
    sayHello("Dhairya")
}

// default arguments
fun sayHello(name:String="Dhairya"){
    print("Hello World $name")
}
fun main() {
    sayHello()
}

// A function returning a value 
fun sayHello(name:String="Dhairya"):Int{
    print("Hello World $name")
    return 1;
}
fun main() {
    var a:Int =sayHello()
    print("Value of a is $a");
} 

// Type 2
fun calculateAge(catage:Int):Int{
    return catage*7;
}
fun main() {
    var catage:Int=7
    catage=calculateAge(catage);
    print("Value of cat age: $catage");
} 

// Another way of writing this is 
fun calculateAge(catage:Int):Int=catage*7  //Important:


fun main() {
    var catage:Int=7
    catage=calculateAge(catage);
    print("Value of cat age: $catage");
} 

// Lambda functions 
val sum: (Int,Int)->Int={
    a,b->a+b
}

fun main() {
    print(sum(12,45))
} 
// Type 2
var calculateAge: (Int)->Int={a->7*a}


fun main() {
    print(calculateAge(7))
} 

var calculateAge: (Int)->Int={7*it}  //Important: it is the default argument that is passed if there is only one argument in the lambda function 

var calculateAge: (Int)->Int={7*it}
var printHelloworld: (String)->Unit={
    name->
    print("Hello World $name");
}

fun main() {
    printHelloworld("Dhairya")
} //Important: lambda function that does not return anything



// Trailing lambda
fun performOperation(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}

fun main() {
    // Calling performOperation with a trailing lambda
    val sum = performOperation(5, 3) { x, y -> 
        x + y 
    }
    
    println("Sum: $sum")
}
// It is vvvvvv Important: in Letc 48