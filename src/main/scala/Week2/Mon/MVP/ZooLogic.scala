package Week2.Mon.MVP

object ZooLogic extends App {

  val pumba: Warthog = new Warthog("pumba", 4) // this is an object now. (instance of my warthod class)
  println(pumba.animalClass)

  val barbie: Owl = new Owl("barbie", 2)
  println(barbie.name)
}
