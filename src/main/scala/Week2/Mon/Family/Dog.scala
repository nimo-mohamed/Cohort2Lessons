package Week2.Mon.Family

class Name(val name: String)
class Breed(val breedType: String)

class Dog (val name: Name, val breedType: Breed) {
  val has4legs: Boolean = true

}

object Dog {
  def apply(name: Name, breedType: Breed): Dog = new Dog(name, breedType)
}
