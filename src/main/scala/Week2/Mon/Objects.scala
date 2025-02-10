package Week2.Mon

object Objects extends App {

    object PrimaryColours { // grouping!
      val blue: String = "blue"
      val yellow: String = "yellow"
      val red: String = "red"
    }

  // calling the objects
  println(PrimaryColours.red)
  println(PrimaryColours.red.toUpperCase)

  object WeekDays {
    val Mon: String = "Monday"
    val Tue: String = "Tuesday"
    val Wed: String = "Thursday"
    val Thur: String = "Monday"
    val Fri: String = "Friday"
    val Sat: String = "Saturday"
    val Sun: String = "Sunday"
  }
  println(WeekDays.Mon)
  println(WeekDays.Tue)
  println(WeekDays.Wed)

}
