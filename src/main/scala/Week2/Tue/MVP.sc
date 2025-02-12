// MVP:
//1. What are three main differences between a class and a case class?
/** - A case class has special built-in features like apply, copy, equals
 *  - In case classes, there is no need for new! objects are created directly
 *  - In case class, (==) compares values and not memory location*/

//2. Without coding it, which of the following lines of code is runnable and which will produce an error? Then, code it and check!
//a) case class Person(name: String, age: Int, nationality: String, isStudent: Boolean) ✅ Correct case class definition
//b) val firstPerson = new Person("Carlos", 23, "Spanish", true) ❌Case classes do not use new
//c) val secondPerson = Person("Carlos", 23, "Spanish", true)✅ Correct case class instantiation
//d) val thirdPerson = Person("Chloe", 25, "British", false) ✅ Correct case class instantiation
//e) class Animal(name: String, colour: String, pet: Boolean) ✅ Correct class definition
//f) val cat = Animal("cat", "black", true) ❌ Regular classes require new
//g) val dog = new Animal("dog", "white", true)✅Correct regular class instantiation

// Coded:
// Defining a case class
case class Person(name: String, age: Int, nationality: String, isStudent: Boolean)

// Defining a regular class
class Animal(name: String, colour: String, pet: Boolean)

// Valid case class instantiations
val secondPerson = Person("Carlos", 23, "Spanish", true) // ✅ Correct
val thirdPerson = Person("Chloe", 25, "British", false) // ✅ Correct

// Invalid case class instantiation (Will Cause Error)
 val firstPerson = new Person("Carlos", 23, "Spanish", true) // this will work but we dont need the word new!

// Valid regular class instantiation
val dog = new Animal("dog", "white", true) // ✅ Correct

// Invalid regular class instantiation (Will Cause Error)
// val cat = Animal("cat", "black", true) ❌ ERROR


//3. After reviewing all combinations, which ones are true when compared using the “==“ operator? Once decided, code it and check!
//a) case class Muffin(flavour: String, price: Double, storeBoughtFrom: String)
//b) val chocolateMuffin = Muffin("chocolate", 3.50, "Mercator Bakery")
//c) val blueberryMuffin = Muffin("blueberry", 3.50, "Mercator Bakery")
//d) val vanillaMuffin = Muffin("vanilla", 3.50, "Mercator Bakery")
//e) val anotherChocolateMuffin = Muffin("chocolate", 3.50, "Mercator Bakery")
//f) val oneMoreChocolateMuffin = Muffin(”Chocolate", 3.50, "Mercator Bakery")
//g) val finalChocolateMuffin = Muffin("choocolate", 2.50, "MercatorBakery")

/**
 - Case classes compare values, not memory locations.
 - Capitalisation matters! "Chocolate" != "chocolate" in Scala.
 - If all field values match, two case class objects are == true.
 - Small differences in spelling, price, or store name make objects unequal.
*/

 case class Muffin(flavour: String, price: Double, storeBoughtFrom: String)
 val chocolateMuffin = Muffin("chocolate", 3.50, "Mercator Bakery")
 val blueberryMuffin = Muffin("blueberry", 3.50, "Mercator Bakery")
 val vanillaMuffin = Muffin("vanilla", 3.50, "Mercator Bakery")
 val anotherChocolateMuffin = Muffin("chocolate", 3.50, "Mercator Bakery")
 val oneMoreChocolateMuffin = Muffin("Chocolate", 3.50, "Mercator Bakery")
 val finalChocolateMuffin = Muffin("choocolate", 2.50, "MercatorBakery")

// Compare using ==
println(chocolateMuffin == blueberryMuffin) // false
println(chocolateMuffin == vanillaMuffin) // false
println(chocolateMuffin == anotherChocolateMuffin) // true
println(chocolateMuffin == oneMoreChocolateMuffin) // false (case-sensitive)
println(chocolateMuffin == finalChocolateMuffin) // false (different values)



//4. Go back to your animal sanctuary and begin by refactoring if you need to. Then change aspects of your code and experiment with scope. When/where can you access information?
//• Add variables/values and methods in different places.
//• Use keywords like ‘private’ and ‘abstract’. How can you use this? How does it affect access?
//• Work with case classes. What needs to change when you change a class to a case class?