/** Examples*/

(number: Int) => number +1 // this is a anonymous function - they cannot be reused anywhere else

val addition = (number: Int) => number +1 // this is a named function - only name function when we want to reuse it. we cannot override. Immutable

// Methods
def addition (number: Int): Int = number +1 // this is my Method which is also a type of function. - Named so can be reused. Must be named!!

def addition (number: Int): Int = number + 10 // this is Override

val aValue = 2<3
def aDifferentValue: Int = {
  if (aValue) 564 else 865
  42 // this last expression must match the methods return type
}
aDifferentValue // only 42 will be returned because it is the last expression in the method

def makeACoffe: String = {
  "Add coffee to boiling water"
  "Add suger or/and milk if required"
  "stri"
  "enjoy!"
}
makeACoffe

def makeATea(sugar: Int, milk: Int): String = {
  s"add boiling water to your cup with a teabag, add $sugar spoons of sugar and $milk milk, stir and enjoy"
}
makeATea(2, 4)

makeATea(sugar = 2, milk = 6) // we can name the parameter when calling the method. This is helpful for readability when the types are the same.

val vat: Double = 1.2
//def priceIncVat(priceOfItem: Double): Double = {
//  priceOfItem * vat
//}

def priceIncVat(priceOfItem: Double): Double =
  priceOfItem * vat // dont need {} if only one line of code

priceIncVat(2.11)

// TASK ONE:

// Create a method called 'getBigVal that takes in two Integers called input1 and input2 and returns a String.
//The method should return the value "first" if input1 is greater than intput2.
//The method should return the value "second" if input1 is smaller than input2.
//The method should return the value "same" if input1 is equal to input2.

def getBigVal(input1: Int, input2: Int): String = {
  if(input1 > input2)
    "first"
  else if (input1 < input2)
    "second"
  else
    "same"
}
getBigVal(4, 8)


// TASK TWO:
//Create a method called 'nameLength' that takes in two Strings called firstName and surname and returns an Integer.
//The result of the method should return the length/size of the name which is greater. If both names are the same length return O.

// Method to compare the length of firstName and surname
def nameLength(firstName: String, surname: String): Int = {
  if (firstName.length > surname.length)
    firstName.length
  else if (firstName.length < surname.length)
    surname.length
  else
    0 // If both names are of equal length
}

// Testing the function
nameLength("John", "Smith")  // Output: 5
nameLength("Alice", "Bob")   // Output: 5
nameLength("Mark", "Luke")   // Output: 0

/** Referential transparency */
// We say something has referential transparency when a functions return value is based solely on the inputs.
// Example: addition(1,2) always = 3
def addTwoInts(x:Int, y:Int):Int = x + y
3 + 3
3 + addTwoInts(1,2)
addTwoInts(1,2) + addTwoInts(1,2)
6
//Just something to think about when writing more complex code. What is simpler for our brains?
