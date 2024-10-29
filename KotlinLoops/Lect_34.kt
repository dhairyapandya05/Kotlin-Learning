var age =29
    when(age){
        18->print("You are elegible to vote")
        22->print("You are eligible to marriage")
        28->print("You are eligible to buy a house")
        else->{
            print("You are a normal citizen");
        }
    }

    var age =29
    when(age){
        in 1..100->print("This number is between 1 and 100")
        !in 1..100->print("THis number is outside 1 to 100")//Important: ranges in switch 
        22->print("You are eligible to marriage")
        28->print("You are eligible to buy a house")
        else->{
            print("You are a normal citizen");
        }
    }