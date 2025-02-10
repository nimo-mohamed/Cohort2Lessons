// MVP:
//1. Write a method to calculate the square of an Int. It should have an input parameter, Int and return type, Int.

def squaredInt(number: Int): Int = number * number
squaredInt(6)


//2. Write a method to check if a number is odd. It should have an input parameter, Int and return type, Boolean.

def isOdd(number: Int): Boolean = !(number % 2 == 0)
isOdd(4)
isOdd(7)

//3. Using a for comprehension and your methods from MVP Q1 and Q2, write a method called sumOfOddNumbers that has an input parameter of List[Int] and return type of Int.
//This method should:
//• Will iterate over a List of Ints
//• Will square each Int in the List
//• Will filter and keep only the odd squared values
//• Then, return the sum of these odd squared numbers.

val numbers: List[Int] = List(1,2,3,4,5,6,7,8,9,10) // made a list of numbers

def sumOfOddNumbers(numbers: List[Int]): Int = { // method that takes in list of numbers and returns Int
  // Note to self: made a val named oddSquares. It uses a for-comprehension, which is a concise way to iterate over a collection in Scala.
  val oddSquares = for {
    number <- numbers // This is a loop that goes through each number in the numbers list.
    square = squaredInt(number) // calculate square (each value). Need to use = as the function returns a value.
    if isOdd(square) // use an if guard, filter and keep only the odd values of square
  } yield square // yield collects all squares that passed the isOdd(square) check.

  oddSquares.sum // .sum calculates the sum of all numbers in oddSquares.
}


//4. Make a simple grading system that calculates a student’s overall grade based on their scores in different subjects (Math, Science and English). The grades are given in the table
//below:
//For example, if a student achieves 45 in Maths, 89 in
//History and 60 in science, the average score would be
//64.67 - they would average at a grade D overall.
//Your grading system will:
//o Calculate the average score from a list of scores.
//o Determine the grade based on the average score.

