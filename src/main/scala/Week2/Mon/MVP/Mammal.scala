package Week2.Mon.MVP


// Adds mammal-specific attributes (furColour, hasTail). - adds specific attributes.
class Mammal(name: String, age: Int, val furColour: String, val hasTail: Boolean) extends Animal(name, age)

//trait Mammal {
//val furColour: String = "brown"
//  def hasTail: Boolean = true
//}