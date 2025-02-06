// 1. Create a Seq of names.

val seqNames: Seq[String] = Seq("lan", "ash", "april", "Tudor", "sandra")

//2. Create a Map of 1-"red", 2-"yellow",
//', 3-"blue"
//', 4-"green".

val mapColours: Map[Int, String] = Map(
  1 -> "red",
  2 -> "yellow",
  3 -> "blue",
  4 -> "green"
)

//'. Filter this map for the colour blue.

val filteredMapColours: Map[Int, String] = mapColours.filter(
  colour => colour._2 == "blue"
)

//3. Add 1 to all numbers in a collection of Ints (you already have one of these).

val newList: List[Int]= List(7,8,9,0)

val add1ToNum: List[Int] = newList.map{
  number => number + 1
}

//4. Remove all even numbers from a collection.

val removeEvenList: List[Int] = newList.filterNot(
  number => number % 2 == 0 // LOOK IN TO THIS AGAIN!!!
)

//5. Return true if a Seq has a String that contains the letter "y'

val seqContainsY: Boolean = seqNames.contains("y")