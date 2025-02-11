package Week2.Tue.Vehicles

// why make it abstract? -
// 1. prevents me from make (instantiating) a vehicle - i have to extend it
// 2. Then why haven't I made it a trait if it's always going to be extended. this is because in traits i cant have parameters(brand). traits do not allow for this
abstract class Vehicle(val brand: String) {
  def drive: String // abstract method
  val description: String = s"this vehicle is a $brand."
}
