// These operations work on monadic types such as Seq, List, Option, Either, and Future.
// They will NOT work directly on standard types like Int, String, and Boolean.
// Monadic types represent computations that can be chained together, allowing operations like flatMap, map, and foreach.

// The `<-` (backwards arrow) is used inside a `for` comprehension to iterate over a collection.
// It is a shorthand way to apply flatMap, filter, and map functions.
// The `yield` keyword is used to collect and return a transformed collection from the for-comprehension.

// Basic for-comprehension: generating a sequence of numbers from 1 to 10.
def retrieveNumbers: Seq[Int] = for (number <- 1 to 10) yield number
retrieveNumbers  // Returns Seq(1, 2, 3, ..., 10)

// Equivalent way using foreach:
(1 to 10).foreach(number => println(number)) // Prints each number from 1 to 10

// Using `for` comprehension to generate squared numbers:
def squaredNumbers: Seq[Int] = for (number <- 1 to 5) yield number * number
squaredNumbers  // Returns Seq(1, 4, 9, 16, 25)

// Using `if guard` inside for-comprehension to filter out even numbers:
def useIfGuard: Seq[Int] = for (number <- 1 to 10 if number % 2 == 0) yield number
useIfGuard  // Returns Seq(2, 4, 6, 8, 10)

// Define a list of animals
val animals: List[String] = List("Cat", "Dog", "Pig", "Bear")

// Function to append "s" to each animal name using `map` (higher-order function).
def addS(animalList: List[String]): List[String] = animalList.map(animal => animal + "s")
addS(animals)  // Returns List("Cats", "Dogs", "Pigs", "Bears")

// Function to convert all animal names to lowercase.
def lowerCaseAnimals(animalList: List[String]): List[String] = animalList.map(animal => animal.toLowerCase)
lowerCaseAnimals(animals)  // Returns List("cat", "dog", "pig", "bear")

// Function to both lowercase and append "s" to each animal name.
// This is written using a for-comprehension, which internally calls `flatMap` and `map`.
def lowercaseAndAddS(animalList: List[String]): List[String] = for {
  addAnS <- addS(animalList)              // Step 1: Append "s" to each animal name
  lowerCase <- lowerCaseAnimals(List(addAnS)) // Step 2: Convert the modified name to lowercase
} yield lowerCase

lowercaseAndAddS(animals)  // Returns List(List("cats"), List("dogs"), List("pigs"), List("bears"))

// `.flatten` is used to flatten a nested list (List of Lists) into a single list.
lowercaseAndAddS(animals).flatten  // Returns List("cats", "dogs", "pigs", "bears")

// `.mkString(", ")` converts the list into a comma-separated string.
lowercaseAndAddS(animals).flatten.mkString(", ")  // Returns "cats, dogs, pigs, bears"
