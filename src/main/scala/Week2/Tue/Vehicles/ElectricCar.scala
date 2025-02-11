package Week2.Tue.Vehicles
// override val - why?
// Class -> Case class. case class will autogenerate the val field, we also have the val field being passed down with inheritance.
// we need to explicitly redefine the inherited val
case class ElectricCar(override val brand: String) extends Car (brand, "Electric") with Electric {
  override val timeToCharge: Int = 8

  val noisyToDrive: Boolean = false // this is specific to electric car
}
