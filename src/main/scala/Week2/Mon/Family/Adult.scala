package Week2.Mon.Family

class Forename(val name: String)
class Surname(surname: String) // this can NOT be accessed because we havent assigned a val!

class Adult (val forename: Forename, val surname: Surname) { // type safe because we are using in memory
  val under18: Boolean = false
}

object Adult {
  def apply(forename: Forename, surname: Surname): Adult = new Adult(forename, surname)
}

