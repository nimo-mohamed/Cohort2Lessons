package Week2.Mon.Family

class Child (val forename: String) { // in the () we put the class parameters! in the {} we put the body of the class. all the logic goes in the body.
  val under18: Boolean = true
  private def idPlease: String = "can I see your Id?"

}

// Companion Object

object Child {
  def apply (forename: String): Child = new Child(forename) // an apply method is a short hand to make new instances of you class.


  // Access the companion classes private methods
  val bob = Child.apply("bob")
  println(bob.idPlease)
}