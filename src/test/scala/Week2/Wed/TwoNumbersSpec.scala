package Week2.Wed

import org.scalatest.flatspec.AnyFlatSpec

class TwoNumbersSpec extends AnyFlatSpec {

  "add" should "add x and y" in {
    val numbers = new TwoNumbers(1, 2) // I'm making a new instance of my class so i can access the method
    assert(numbers.add == 3) // This will return a Boolean. This is the method the same as whats expected?
  }
"subtract" should "subtract x from y" in { // y-x = 2-1
  val numbers = new TwoNumbers(1,2)
  assert(numbers.subtract == 1)
}

  "multiply" should "multiply x and y" in {
    val numbers = new TwoNumbers(1, 2)
    assert(numbers.multiply == 2)
  }
/** we want to test edge cases. we want our tests to be able to fail, but they still need to compile. */
//  "multiply" should "error when the input is a double" in {
//    val numbers = new TwoNumbers(1.3, 2)
//    assert(numbers.multiply != 2.6)
//  }

}
