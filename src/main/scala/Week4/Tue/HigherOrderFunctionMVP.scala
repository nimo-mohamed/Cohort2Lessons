package Week4.Tue

object HigherOrderFunctionMVP extends App {

  /** MVP */
  //Question 1.
  //a. Create a function called `intDoubler` that takes an input of type `Int` and returns an `Int`. This method will return the input `Int` doubled.

  def intDoubler(number: Int): Int = number * 2

  //b. Create a second function called `applyTwice` that takes two parameters.
  //i. The first parameter is an `input:Int`.
  //ii. The second parameter is a function called `f` that takes an `Int` and returns an `Int`. (Having this as a parameter makes the `applyTwice` method a higher order function.)
  //iii. The `applyTwice` function must apply `f` twice in succession to the `input`.
  def applyTwice(input: Int, f: Int => Int): Int = f(f(input))


  //c. Call the `applyTwice` function passing in the `intDoubler` as your `f`.
  //(E.g. `applyTwice(4, intDoubler)` should equal 16)
  println(applyTwice(4, intDoubler))

  //Question 2.
  //a. Create 4 functions (addition, multiplication, division, subtraction), each taking two doubles as inputs and returning a `Double` as the result.
  def add(x: Double, y: Double): Double = x + y

  def multiply(x: Double, y: Double): Double = x * y

  def division(x: Double, y: Double): Double = x / y

  def subtract(x: Double, y: Double): Double = x - y

  //b. Create a function called `IntManipulator` that takes in two doubles and a mathematical operation (as made above) as a function and returns the result as a double.
  def intManipulator(x: Double, y: Double, operation: (Double, Double) => Double): Double = operation(x, y)

  println(intManipulator(10, 5, add))
  println(intManipulator(10, 5, multiply))
  println(intManipulator(10, 5, division))
  println(intManipulator(10, 5, subtract))


  //### Returning a function:
  //Question 3.
  //a. Create a function called `convertToUpperCase` that takes any string input and returns that string as uppercase.
  //b. Create a function called `convertToLowerCase` that takes any string input and returns that string as lowercase.
  def convertToUpperCase(str: String): String = str.toUpperCase
  def convertToLowerCase(str: String): String = str.toLowerCase


  //c. Create a third function called `stringConverter` that takes a Boolean input with parameter name `makeStringUpperCase`. If the input is `true`, return the `convertToUpperCase` method; if `false`, return the `convertToLowerCase` method.
  def stringConverter(makeStringUpperCase: Boolean): String => String = {
    if (makeStringUpperCase) convertToUpperCase else convertToLowerCase
  }

  //d. Copy `val testString = "cOnVeRtMe"` and apply your `stringConverter` method to your `testString` and print the result when the input is `true` and when it is `false`.
  val testString = "cOnVeRtMe"
  println(stringConverter(true)(testString))
  println(stringConverter(false)(testString))

  //Question 4.
  //a. Create a `calculate` method that takes an input called `operation: String` and pattern matches it to return one of the previously written methods from question 2; `add`, `subtract`, `multiply`, and `divide`.
  //(Example: `calculate("add")` will return the `add` method from Q2)
//  def calculate(operation: String): (Double, Double) => Double = {
//    operation match {
//      case "add" => add
//      case "multiply" => multiply
//      case "divide" => "divide"
//      case "subtract" => subtract
//      case _ => throw new IllegalArgumentException("Invalid operation")
//    }
//  }

  //b. Try applying different string inputs to the `calculate` method to return each of the arithmetic methods.
//  println(intManipulator(8, 2, calculate("add")))
//  println(intManipulator(8, 2, calculate("multiply")))
//  println(intManipulator(8, 2, calculate("divide")))
//  println(intManipulator(8, 2, calculate("subtract")))

  //c. What happens if you enter an input that doesn’t match any of the methods? Should we account for this in our pattern match? What would change if we did?
//  try {
//    println(intManipulator(8, 2, calculate("modulus"))) // Should throw an error
//  } catch {
//    case e: IllegalArgumentException => println(e.getMessage) // Output: Invalid operation
//  }
}
