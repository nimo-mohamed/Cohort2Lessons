package Week4.Tue

object HigherOrderFunctions extends App {

  // Higher Order Functions - HOF
  // Definition: they are a function that EITHER takes in a function as a parameter or return a function as a result.
  // WHY do we use them?
  //1. Modular, reusable code (often easier to read).
  //2. Reduce repeated code (make come more concise).
  // What do they do? Manipulate collections (e.g. map, filter, fold, reduce...)

  /** HOF - functions as parameters */

  //This method will take a function (that is also Int => Int), and it will apply whatever that is, to the given 'x'.
  def firstHigherOrderFunction(x: Int, function: Int => Int): Int = function(x)

  //Now need to write function that can be passed into my HOF - must be Int => Int
  def addTwo(number: Int): Int = number + 2

  def square(number: Int): Int = number * number

  def double(number: Int): Int = number * 2

  println(firstHigherOrderFunction(3, addTwo))
  println(firstHigherOrderFunction(3, square))
  println(firstHigherOrderFunction(3, double))

  //This method will process a List[String]
  def processTheList(listOfString: List[String], function: String => String): List[String] = listOfString.map(function) // must map through the list to access the single element.

  def toUpper(word: String): String = word.toUpperCase

  def addsS(word: String): String = word + "s"

  def toLower(word: String): String = word.toLowerCase

  val newList: List[String] = List("apple", "orange", "mango", "grape")
  processTheList(newList, toUpper) // you would see this in production code
  println(processTheList(newList, addsS)) // Won't see print line. Test to make sure the above is working.
  println(processTheList(newList, toLower))

  /** FOLD LEFT */
  // What does it do?
  // Combines/reduces a collection into a single value.
  // Process the collection from left to right.
  // It will store the intermediate value as an 'acc' at the end, once the full collection, is checked and reduced it will return the 'acc'.

  // acc comes first, then element (acc, element) => acc + element
  //foldLeft(acc) (function: (acc, element) => acc + element

  val numbersList: List[Int] = List(1, 2, 3, 4, 5)
  //Add all numbers in my list
  println(numbersList.foldLeft(0)((acc, nextInt) => acc + nextInt))
  numbersList.foldLeft(0)(_ + _) // - shorthand for the above
  //Pseudocode
  //Start with 0 -> 0 + 1 = 1 (acc = 1)
  //(1, 2) => 1 + 2 = 3 (acc = 3)
  //(3, 3) => 3 + 3 = 6 (acc = 6)
  //(6, 4) => 6 + 4 = 10 (acc = 10)
  //(10, 5) => 10 + 5 = 15 (final element in the list - we return the acc = 15)

  // Write a method that takes a list of "String" and returns them as a "String" (List of words into a sentence)
  val stringList = List("we", "love", "scala")
  println(stringList.foldLeft("")((acc, nextWordInTheList) => acc + " " + nextWordInTheList).trim)

  /** Fold Right */
  //Same as above except you move Right to Left.
  // Element comes first, then acc.
  // foldRight(acc)(function: (element, acc) => element, acc)


  /** Task One: */

  // Using previously written numbers list:
  println(numbersList.foldLeft(1)((acc, nextInt) => acc * nextInt))

  val evenNumbersList = numbersList.filter(_ % 2 == 0)
  println(evenNumbersList)

  //Use the filter method to return only the even Ints from the list.
  val charCount = stringList.foldLeft(0)((acc, nextWordInTheList) => acc + nextWordInTheList.length)
  println(charCount)

  /** HOF - Function is the return type */
  // Commonly seen in pattern matching/if else, where we want to choose the function based on given criteria.

  // Write a function where, given the length of employment, the percentage pay rise is different
  //Return the final amount paid per year to a particular employee

  case class Employee(name: String, lengthOfEmployment: Int, salary: Double)

  val Amanda = Employee("Amanda", 8, 30000.0)

  //For each of these methods, we aren't doing the calculation. we will use these to identify which pay rise they will get, given the criteria of employment length.
  def bigPayRise: Double => Double = salary => salary * 2

  def mediumRise: Double => Double = salary => salary * 1.3

  def smallRise: Double => Double = salary => salary * 1.1

  //This method will look at the employment length, and decide which of the above methods to use.
  def getPayRiseCalc(employee: Employee): Double => Double = {
    employee.lengthOfEmployment match {
      case year if year <= 3 => smallRise
      case year if year <= 5 => mediumRise
      case _ => bigPayRise // wildcard - catch everything else
    }
  }

  //This method will return the new salary for a given employee.
  def getFinalSalary(employee: Employee): Double = {
    val applyThePayRise: Double => Double = getPayRiseCalc(employee) // store the pay rise function
    applyThePayRise(employee.salary) //Do the final calc (big,medium,small pay rise)
  }

  println(getFinalSalary(Amanda))


  /** TASK TWO: */

  case class Item(price: Double)

  val pictureFrame = Item(56.00)

  // Discounts per item
  def bigDiscount: Double => Double = price => price * 1.5

  def mediumDiscount: Double => Double = price => price * 1.4

  def smallDiscount: Double => Double = price => price * 1.2


  def getPriceCalc(item: Item): Double => Double = {
    item.price match {
      case total if total > 50 => bigDiscount
      case total if total <= 50 => mediumDiscount
      case _ => smallDiscount // wildcard - catch everything else
    }

  }


  def getFinalAmount(item: Item): Double = {
    val applyTheDiscount: Double => Double = getPriceCalc(item)
    applyTheDiscount(item.price)
  }

  println(getFinalAmount(pictureFrame))


}