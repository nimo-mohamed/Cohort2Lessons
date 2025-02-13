package Week2.Wed

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class NameLengthSpec extends AnyWordSpec with Matchers {

  val nameLength = new NameLength

  "NameLength" should{

    "return the length of the firstName" when {
      "the firstName.length > surname.length" in {
        val input = nameLength.getNameLength("nimo", "mohamed")
        val expectedResult = 7
        input shouldBe expectedResult
      }
    }
    "return the length of the surname" when{
      "the firstName.length < surname.length" in {
        val input = nameLength.getNameLength("nimonimo", "mohamed")
        val expectedResult = 8
        input shouldBe expectedResult
      }

      // edge cases

    }
  }

}
