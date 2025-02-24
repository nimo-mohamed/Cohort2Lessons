package Week4.Mon

import scala.annotation.tailrec

object Recursion extends App {
  // standard recursion
  // recursive calls which call the original method inside the method
  // each new call adds to the call stack
  // method will remember all of these calls before completing
  // will continue to recursively call until the base case is reached
  // once when base case is reached, it will resolve in reverse order

  // Factorial method - multipy all positive Ints in a list (input = 4 --> 4x3x2x1)

  def factorial(n: Int): Int = {
    if (n <= 1) { // HOW I ESCAPE TP RECURSION
      1 // base case - when you get to one, return one and then the stored call stack can start unwinding
    } else {
      println(s"Incoming n is $n")
      println(s"new n: ${n - 1}")
      val finalResult = n * factorial(n - 1)
      println(s"final n call: $n")
      finalResult
    }
  }

  println(factorial(4))
  // Pseudocode - factorial (4)
  // Recursive loop -- call stack -- not yet evaluated  (waiting until the loop ends to evaluate)
  // factorial (4) --> 4 X factorial (4-1) -- > factorial (3) BOTTOM of the stack
  // factorial (3) --> 3 x factorial (3-1) --> factorial (2)
  // factorial (2) --> 2 x factorial (2-1) --> factorial (1) TOP
  // factorial (1) --> hitting the base case(exit the recursive loop) --> return 1
  // unwind --> Top to bottom
  //UNWIND - -> top to bottom
  // factorial(2) --> 2 X factorial(2-1) --> 2 X factorial(1) --> 2 X 1 = 2
  // factorial(3) --> 3 X factorial(3-1) --> 3 X factorial(2) --> 3 X 2 = 6
  // factorial(4) --> 4 X factorial(4-1) --> 4 X factorial(3) --> 4 X 6 = 24
  // Final result = 24

  // Stack overflow error - there is only so much memory in the call stack. if this is exceeded we get this error.
  // println(factorial(10000))

  /** TAIL RECURSION */
  // smarter way to write recursion because it stops stack overflow errors
  // key differences
  //1. recursive call must be the last operation a function performs. (@tailrec - will check this)
  //2. prevents stack overflow error:
  //2a. doesn't need to remember all previous values, all necessary information is passed through as an accumulator(acc).
  //b. scala replaces recursive calls with a simple loop under the hood, called tail call optimization(TCO)
  // Replaces and updates the acc with every recursive call.

  //1st - with a helper method
  def smarterFactorial(n: Int): Int = {
    @tailrec
    def factorialHelper(x: Int, acc: Int): Int = { // helper - don't have to change the original method signature
      // write our method
      if (x <= 1) acc // acc = superstar - stores the intermediate value, don't need ti have a large memory as call stack is being updated each time
      else {
        println(s"current x: $x")
        println(s"value of current acc inside else: $acc")
        factorialHelper(x - 1, acc * x) // last expression - tail rec. Override old values and pass in a new updated acc each time.
        // x - 1 --> moving down our numbers list
        // acc * x --> running total
      }
    }

    factorialHelper(n, 1) // call the helper, pass in the original n so we start the recursion at the top level, acc will start at the if case.
  }

  println("\nTail rec with helper:" + smarterFactorial(4))

  // Tail rec without helper method
  @tailrec
  def smartFactorialWithoutHelper(n: Int, acc: Int = 1): Int = { // if this is the first time a tailrec is being used, you can use acc if not you need a method helper ^^
    if (n <= 1) acc
    else smartFactorialWithoutHelper(n - 1, acc * n)
  }

  println("\n Tail rec without helper: " + smartFactorialWithoutHelper(4))

  // Example with string
  @tailrec
  def concatenateWords(aWord: String, n: Int, acc: String): String = {
    if (n <= 0) acc
    else concatenateWords(aWord, n - 1, aWord + acc)
  }

  println(concatenateWords("Hello World!", 3, ""))

  // TASK:
  val lettersList: List[String] = List("A", "B", "C")
  def getListLength(list: List[String]): Int = {
    if (list.isEmpty) 0
    else 1 + getListLength(list.tail)
  }

  println("getListLength:" + getListLength(lettersList))

  @tailrec
  def getListLengthTailRec(list: List[String], acc: Int = 0): Int = {
    if (list.isEmpty) acc
    else getListLengthTailRec(list.tail, acc + 1)
  }
  println("getListLengthTailRec: " + getListLengthTailRec(lettersList, 0))

}



