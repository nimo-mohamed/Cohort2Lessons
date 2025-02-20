package Week3.Thur

object Options extends App {

  trait Pizza {
    val size: Int
    val crust: Option[String]

  }

  object Personal extends Pizza {
    override val size: Int = 7
    override val crust: Option[String] = Some("classic") // Must wrap in a some if we are giving is 'SOMEthing'

  }

  object Small extends Pizza {

    override val size: Int = 9
    override val crust: Option[String] = None // If its NONE im not giving a default
  }

  object Medium extends Pizza {
    override val size: Int = 11
    override val crust: Option[String] = Some("classic")
  }

  object Large extends Pizza {

    override val size: Int = 14
    override val crust: Option[String] = None
  }

  val newPizzaOrder: Pizza = new Pizza {
    override val size: Int = 14
    override val crust: Option[String] = Some("I'm inside the stuffed")
  }

  //  def whatCrust(pizza: Pizza): String = {
  //    pizza.crust match {
  //      case Some("classic") => "Classic crust"
  //      case Some("italian") => "Italian crust"
  //      case Some("stuffed") => "Stuffed crust"
  //      case None => "just the default classic crust"
  //    }
  //  }
  //
  //  println(whatCrust(newPizzaOrder))

  // get or else
  println(newPizzaOrder.crust.get)

  // TASK: chocolateBar

  case class ChocolateBar(filling: Option[String])

  def getFilling(chocolateBar: ChocolateBar): String =
    chocolateBar.filling.getOrElse("just chocolate")

  object Snickers extends ChocolateBar(Some("nuts"))
  object DairyMilk extends ChocolateBar(None)

  println(getFilling(Snickers))
  println(getFilling(DairyMilk))

}
