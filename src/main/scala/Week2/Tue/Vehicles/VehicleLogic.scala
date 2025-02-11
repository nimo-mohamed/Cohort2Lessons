package Week2.Tue.Vehicles

object VehicleLogic extends App {

  println("\nCar\n")
  // car is a class
  val ford = new Car("Ford", "Petrol") // object of car
println(ford.fuelType) // coming from car
println(ford.drive) // Come from vehicle but we did an override in car
println(ford.brand) // Come from vehicle
println(ford.description) // come from vehicle

  println("\n----Electric Car------\n")
  val electricFord = ElectricCar("Ford") //new ElectricCar object
  println(electricFord.fuelType)
  println(electricFord.drive)
  println(electricFord.brand)
  println(electricFord.description)
  println(electricFord.noisyToDrive) //coming from ElectricCar
  println(electricFord.timeToCharge) //coming from Electric trait
  println(electricFord.charge) //coming from Electric trait

}