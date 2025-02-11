package Week2.Mon.MVP

case class Owl (name: String, age: Int, beakLength: Double, featherColour: String,hootsPerNight: Int) extends Bird(name, age, beakLength, featherColour) with Species {

//  override val speciesName = "Owl"
//  override val conservationStatus = "Stable"
//  override val avgLifespanRange = (5, 20)
//  override val numOfYoungRange = (2, 6)
}
