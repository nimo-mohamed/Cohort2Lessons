package Week3.Thur

object PatternMatching extends App {

  val weather: String = "Cold"

  if (weather.toLowerCase() == "cold") {
    println(s"It is $weather! Take a coat.")
  } else if (weather == "raining") {
    println(s"It is $weather! Take an umbrella.")
  } else {
    println(s"$weather is not valid")
  }

  weather.toLowerCase() match {
    case "cold" => println(s"It is $weather! Take a coat.")
    case "raining" => println(s"It is $weather! Take an umbrella.")
    case _ => println(s"$weather is not valid") // this what we call a wildcard - this will catch anything else
  }

  val numOfwatermelons: Int = 9

  numOfwatermelons match {
    case 1 | 2 | 3 => println("he can carry them without a bag")
    case 4 | 5 => println(" he needs a bag ")
    case x => println(s"$x is invalid") // if you want to use interpolation with an int, need to assign it to x rather than _
  }

  abstract class Notification // I have to extend this - it's abstract

  case class Email(sender: String, title: String, body: String) extends Notification

  case class Text(sender: String, body: String) extends Notification

  case class voiceNote(sender: String, lengthOfTheBody: Int) extends Notification

  val notification: Notification = Text("Mum", "Where are you?")


  notification match {
    case Email(sender, title, body) => println("Email from " + sender)
    case Text(sender, body) if sender == "Mum" => println("Text from " + sender + ". Message: " + body)
    case Text(sender, body) => println("Text from " + sender)
    case voiceNote(sender, lengthOfTheBody) => println("Voice note from " + sender + "Length: " + lengthOfTheBody)
  }

  // patter matching task - pizza shop

  // Task 1: Flavor to Pizza Type Mapping

  val flavour: String = "spicy"
  flavour.toLowerCase match {
    case "spicy" => println("American Hot")
    case "bbq" => println("BBQ Chicken")
    case "vegetarian" => println("Garden Veggie")
    case "cheese" => println("Four Cheese")
    case "meat" => println("Meat Feast")
    case _ => println("Unknown Flavor: Defaulting to Margherita")

  }

  // Task 2
  val pizzaSize: Int = 9
    pizzaSize match {
      case 7 => println("personal")
      case 9 => println("small")
      case 11 => println("medium")
      case 14 => println("large")
      case _ => println("Enter a valid size ")
    }

}
