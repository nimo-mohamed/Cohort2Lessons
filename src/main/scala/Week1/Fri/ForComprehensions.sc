// these work on monadic types -- Seq, List, Option, Either, Future
// will not work in standard Int, String, Boolean

// <- (backwards arrow) is a simple way of writing a function (flatmap, filter, map foreach)
// yield -- call the map

// classic
def retrieveNumbers: Seq[Int] = for (number <- 1 to 10)yield number
retrieveNumbers
// (1 to 10). foreach (number => printIn(number))

// use operators
def squaredNumbers: Seq[Int] = for (number <- 1 to 5) yield number * number
squaredNumbers

// if guard

def useIfGuard: Seq[Int] = for (number <- 1 to 10 if number % 2 == 0) yield number
useIfGuard

val animals: List[String] = List("Cat", "Dog", "Pig", "Bear")

def addS(animalList: List[String]): List[String] = animalList.map(animals => animals +"s")
addS(animals)

def lowerCaseAnimals(animalList: List[String]): List[String] = animalList.map(animal => animal.toLowerCase)
lowerCaseAnimals(animals)

def lowercaseAndAddS(animalList: List[String]): List[String] = for {
  addAnS <- addS(animalList)
  lowerCase <- lowerCaseAnimals(List(addAnS))
} yield lowerCase

lowercaseAndAddS(animals) // give a list
lowercaseAndAddS(animals).flatten
lowercaseAndAddS(animals).mkString(", ")// change a list to string