package Week2.Tue.Vehicles

trait Electric {
  val timeToCharge: Int // I can leave this empty which will mean it's an abstract field - BUT must declare at subclass level (as soon as I extend)

  def charge: String= s"Charge me from $timeToCharge hours"
}
