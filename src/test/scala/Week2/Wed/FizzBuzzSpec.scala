package Week2.Wed

import org.scalatest.flatspec.AnyFlatSpec

class FizzBuzzSpec extends  AnyFlatSpec {

  val fizzBuzz = new FizzBuzz // declaring my new FizzBuzz class

  " FizzBuzz" should "return 'Fizz' for numbers divisible by 3" in {
    assert(fizzBuzz.fizzBuzz(6) == "Fizz")
  }

  " FizzBuzz" should "return 'Buzz' for numbers divisible by 5" in {
    assert(fizzBuzz.fizzBuzz(10) == "Buzz")
  }

  " FizzBuzz" should "return 'FizzBuzz' for numbers divisible by 3 and 5" in {
    assert(fizzBuzz.fizzBuzz(15) == "FizzBuzz")
  }

//  "FizzBuzz" should "if not divisible by 3 or 5 "

}
