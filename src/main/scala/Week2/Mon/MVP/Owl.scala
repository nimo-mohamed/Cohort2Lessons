package Week2.Mon.MVP

class Owl (override val name: String, override val age: Int) extends Animal (name, age) with Bird {
def canFly: Boolean = true
}
