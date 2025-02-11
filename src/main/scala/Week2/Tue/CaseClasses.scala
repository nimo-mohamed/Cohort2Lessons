package Week2.Tue

object CaseClasses extends App {

  // standard class
  //  class SuperHero(val realName: String, val heroName: String, val weakness: String)

  //  new SuperHero("Clark Kent", "superman", "kryptonite") // here I have made a new superhero object from the superhero class

  //Case Class
  case class SuperHero(realName: String, heroName: String, weakness: String) // each parameter is a val by default.

  val superMan = SuperHero.apply("Clark Kent", "superman", "kryptonite") // the . apply method is built in. Object made using the superHero case class.

  val superMan2 = SuperHero.apply("Clark Kent", "superman", "kryptonite")
  println(superMan == superMan2) // true - compares the field values not the object reference/memory location (like classes)

  // The .copy methods

  val copiedSuperman = superMan.copy(weakness = "gravity") // Make a new val!
  println(copiedSuperman.weakness)
  println(superMan.weakness) // the original is not being reassigned

  val updatesName = superMan.copy(realName = "Andy Probert", weakness = "pints")
  println(updatesName.realName + updatesName.weakness)

  //Task:
  println("\nTask\n")

  // Create a dog case class with parameters of name, breed and age.
  case class Dog(name: String, breedType: String, age: Int)

  //Create 4 dog objects.
  val dog1 = Dog("Bella", "German shepherd", 4)
  val dog2 = Dog("Daisy", "labrador", 6)
  val dog3 = Dog("Lola", "Bulldog", 7)
  val dog4 = Dog("Kiko", "German Shepherd", 8)

  //Then create a kennel case class with parameters of name and then a list of the dog case class.
  case class Kennel(name: String, dog: List[Dog])

  //Make a new kennel object and add your dogs (Q.2).
  val myKennel = Kennel("Happy Paws Kennel", List(dog1, dog2, dog3, dog4))
  println(s"Original Kennel: $myKennel")

  //The kennel that you have set up wants to change its name but keep the dogs. Use the case class copy method.
  val newKennel = myKennel.copy(name = "Sunny Days Kennel")
  println(s"Updated Kennel with New Name: $newKennel")


}