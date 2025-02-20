package Week3.Thur

import Week3.Thur.Enums.weekday.Value

object Enums extends App {

  // Finite sets of data.

  // Extends enumeration
  object weekday extends Enumeration {
    val Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday = Value
  }

  println(weekday.values)
  println(weekday.Monday)

  // Below is useful with acronyms
  object BetterWeekday extends Enumeration {
    val Monday = Value("Mon")
    val Tuesday = Value("Tue")
    val Wednesday = Value("Wed")
    val Thursday = Value("Thu")
    val Friday = Value("Fri")
    val Saturday = Value("Sat")
    val Sunday = Value("Sun")
  }

  println(BetterWeekday.values)
  println(BetterWeekday.Sunday)

  // pattern matching example
  def matchWithEnum(weekdays: BetterWeekday.Value)=  {
    weekdays match {
      case BetterWeekday.Monday => println(s"Oh, its ${BetterWeekday.Monday} ")
      case BetterWeekday.Tuesday => println(s"Oh, its ${BetterWeekday.Tuesday}")
      case BetterWeekday.Wednesday => println(s"Oh, its ${BetterWeekday.Wednesday} ")
      case BetterWeekday.Thursday => println(s"Oh, its ${BetterWeekday.Thursday} ")
      case BetterWeekday.Friday => println(s"Oh, its ${BetterWeekday.Friday} ")
      case BetterWeekday.Saturday => println(s"Oh, its ${BetterWeekday.Saturday} ")
      case BetterWeekday.Sunday => println(s"Oh, its ${BetterWeekday.Sunday} ")
    }
  }
  matchWithEnum(BetterWeekday.Saturday)

  // we want an exhaustive matching - all enums are assigned a match case.
  // we don't see an error message/warning if it isn't. (we could miss values)

  object ReorderedBetterWeekday extends Enumeration {
    val Monday = Value(1)
    val Tuesdayval = Value(2)
    val Wednesday = Value(3)
    val Thursday = Value(4)
    val Friday = Value(5)
    val Saturday = Value(6)
    val Sunday = Value(0)
  }

  println(ReorderedBetterWeekday.values)

  // Sealed case objects --> Preferred way
  // does not come with default ordering
  sealed trait Weekday

  case object Monday extends Weekday

  case object Tuesday extends Weekday

  case object Wednesday extends Weekday

  case object Thursday extends Weekday

  case object Friday extends Weekday

  case object Saturday extends Weekday

  case object Sunday extends Weekday

  // Custom errors
  abstract class Error(name: String, errorCode: Int)

  case object NotFound extends Error("Not found", 404)

  case object HairColourError extends Error("Hair colour is invalid", 404)

}