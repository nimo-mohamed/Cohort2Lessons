package Week2.Mon.MVP

class Warthog (override val name: String, override val age: Int) extends Animal(name, age) with Mammal {
  def talk: String = "im a warthog"
}
