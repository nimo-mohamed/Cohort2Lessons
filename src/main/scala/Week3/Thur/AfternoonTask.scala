package Week3.Thur

import java.time.LocalDate

object AfternoonTask extends App {

  // 1. Country to Capital City Mapping using Pattern Matching
  // - Uses pattern matching to return the capital city of a given country.
  //- Handles case insensitivity and trims whitespace.
  //- Provides a default response for unknown countries.

  val country: String = "FraNce"
  country.toLowerCase match {
    case "france" => println("Paris")
    case "england" => println("London")
    case "germany" => println("Berlin")
    case "italy" => println("Rome")
    case "spain" => println("Madrid")
    case _ => "Unknown country"

  }

  // 2. Animal Trait and Pattern Matching for Facts
  //- Defines a sealed trait Animal.
  //- Extends Animal with different animal case objects.
  //- Uses pattern matching to return facts about each animal.

  sealed trait Animal

  case object Dog extends Animal
  case object Cat extends Animal
  case object Elephant extends Animal
  case object Pig extends Animal
  case object Eagle extends Animal

  val animalFact: String = "Pig"
  animalFact match {
    case "Dog" => println("Loyal companion")
    case "Cat" => println("Curiousity killed the cat")
    case "Elephant" => println("Has excellent memory")
    case "Pig" => println("Very messy")
    case "Eagle" => println("Can fly at high altitudes")
  }


  // 3. Person Case Class and Data Calculation
  // - Defines a Person case class with required and optional fields.
  // - Implements createPerson, which derives missing fields.
  // - Implements horoscope, which determines the star sign based on date of birth

  case class Person(
                     fullName: String,
                     dateOfBirth: LocalDate,
                     age: Int,
                     starSign: String,
                     occupation: Option[String],
                     lastCountryLivedIn: String,
                     dateOfDeath: Option[Int],
                     ageAtDeath: Option[Int]
                   )

  case class InPutPerson(
                        fullName: String,
                        dateOfBirth: LocalDate,
                        occupation: Option[String],
                        lastCountryLivedIn: String,
                        dateOfDeath: Option[LocalDate]
                        )

  def calculateAge(dateOfBirth: LocalDate, dateOfDeath: Option[LocalDate]): Int = {

  }

  def createPerson(inPutPerson: InPutPerson): Person = ???
}
