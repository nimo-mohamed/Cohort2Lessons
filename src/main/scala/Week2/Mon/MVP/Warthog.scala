package Week2.Mon.MVP

case class Warthog (name: String, age: Int, furColour: String, hasTail: Boolean, hasTusks: Boolean) extends Mammal(name, age, furColour, hasTail) with Species
  {

//    override val speciesName = "Warthog"
//    override val conservationStatus = "Least Concern"
//    override val avgLifespanRange = (10, 15)
//    override val numOfYoungRange = (2, 4)
  }
