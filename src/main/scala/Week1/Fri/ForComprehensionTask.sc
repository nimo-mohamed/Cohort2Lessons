/**TASK ONE:*/
// Write a simple method that will take in a list of names and return them in all lowercase.
//Run both methods using this list: Val name: List[String] = List("aRIa", "BaRT", "ChuCk)"
val listOfNames: List[String] = List("aRIa", "BaRT", "ChuCk")

def lowerCasedNames(nameList: List[String]): List[String] = nameList.map(listOfNames => listOfNames.toLowerCase)
lowerCasedNames(listOfNames)

//Write a simple method that will take in list of names and return them with only the first letter capitalised.

def capitalisedNames(nameList: List[String]): List[String] = nameList.map(listOfNames => listOfNames.toLowerCase.capitalize)
capitalisedNames(listOfNames)

/**TASK TWO:*/
// I want to be to do Task 1 in a single method,  so I don’t always have to call 2 methods.
//Achieve this using for comprehensions.
//Here is a possible start:

def capitaliseList(nameInPut: List[String]): List[String] = for {
  lowerCased <- lowerCasedNames(listOfNames)
  capitalisedName <- capitalisedNames(List(lowerCased))
} yield capitalisedName

capitalisedNames(listOfNames)