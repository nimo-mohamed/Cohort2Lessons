//MVP:
//  John from primary school maths is trying to buy as many watermelons as possible and we need to give him a reality check. John can reasonably carry 3 watermelons without a bag, and 5 with one bag.
//1. Create a value to store a number of watermelons.

val  watermelons: Int = 4

//2. Use an if/else statement to print out appropriate messages based on the criteria above to tell John whether he:
//  a) Doesn't need a bag --> <= 3
//  b) Needs a bag --> <=5 && >3
//  c) Can't carry them
//Consider how you will handle invalid numbers.

if (watermelons.toInt <=3){
  println("John you don't need a bag")
} else if (watermelons <=5 || watermelons >3){
  println("John you need a bag!")
} else (watermelons >5 || watermelons <= 0)
println("Cant carry them!")


//3. Use string interpolation to add to each message the number of watermelons John is trying to buy - which type of string interpolation is most appropriate here?

println(s"John is trying to buy $watermelons watermelons!") //NO SURE IF I DID THIS RIGHT


//4. Create a value to store a boolean that indicates whether John has a bag with him or not.

val hasABagWithHim: Boolean = false

//5. Use an if statement and this boolean value to tell John whether he can or cannot by the desired number of watermelons in Task 1. Can this be done without using "else if"?

if (watermelons >3 && !hasABagWithHim){
  println("John can't by the desired number of watermelons🥲")
} else {
  println("John is good to go! ✅")
}


//  6. The store puts their prices in a foreign currency, so the conversion rate to £ means one watermelon is £1.397. Calculate and use string interpolation to display the total cost of John's purchase to 2 decimal places - which type is most appropriate here?

val pricePerWatermelon: Double = 1.397 // conversion rate to £

val totalCost = watermelons * pricePerWatermelon

// common format specifiers (type safety)
//%f - Float, Double
//%d - Int, Long
//%s - String

println(f"The total cost of johns purchase is £$totalCost%.2f")
