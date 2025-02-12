package Week2.Wed

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class UsernameSpec extends AnyWordSpec with Matchers {

  // Make a new instance of my class.
  // I can do this at top level because my class doesn't take parameters.
  // Because it is at the top level, I can access this class anywhere between the yellow {} - class body.
  val username = new UserName

  "checkUsername" should {

    "return true" when {
      "the username is 8 characters long and all lowercase" in {
        val input = username.checkUsername("mercator")
        val expectedResult = true
        input shouldBe expectedResult
      }

      "the username is MORE than 8 characters long and all lowercase" in {
        val input = username.checkUsername("mercatordigital")
        val expectedResult = true
        input shouldBe expectedResult
      }

    }

    "return false" when {
      // this is a passing test, but I have written it to prove my method can fail (can get to my else case)
      "the username is less than 8 characters long but all in lower case" in {
        val input = username.checkUsername("merc")
        val expectedResult = false
        input shouldBe expectedResult
      }

      "the username is 8 characters long but contains uppercase" in {
        val input = username.checkUsername("Mercator")
        val expectedResult = false
        input shouldBe expectedResult
      }

      // Edge Case
      "username is entered as an empty string" in {
        val input = username.checkUsername("")
        val expectedResult = false
        input shouldBe expectedResult
      }

    }

  }
}
