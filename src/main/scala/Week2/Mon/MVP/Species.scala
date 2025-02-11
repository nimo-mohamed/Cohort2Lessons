package Week2.Mon.MVP

trait Species {
  val speciesName: String
  val conservationStatus: String
  val avgLifespanRange: (Int, Int)
  val numOfYoungRange: (Int, Int)

}
