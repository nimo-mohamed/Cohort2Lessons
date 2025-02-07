// MVP:
//a) Make a List of the numbers from 1-5, and a Seq of the primary colours.
val numbers: List[Int] = List(1,2,3,4,5)
val primaryColours: Seq[String] = Seq("red", "yellow", "blue")

//b) Write a function to multiply all the values in your List by 3.
val numbersX3: List[Int] = numbers.map(
  numbers => numbers *3
)

//c) Write a function that removes “Blue” from your Seq.
val removeBlue: Seq[String] = primaryColours.init

val removeBlue: Seq[String] = primaryColours.filter(
  word => !(word == "blue") // this is the same us the one above ^^
)

//d) Write a function that returns ‘true’ if your Seq contains “Orange”.
val containsOrange: Boolean = primaryColours.contains("orange")

//2. Write a function that maps each value in your List to true or false, depending on whether they are odd.

val oddMappedList: List[Boolean] = numbers.map(
  num => num % 2 != 0) // Check if the number is odd (if remainder after division by 2 is not 0)

//3. David has many pets; 2 dogs, 1 fish and 1 cat.
//a) Make a Map which details the key -> value pair of “Name” -> “Animal”.

val davidsPets: Map[String, String] = Map(
  "Max" -> "dog",
  "Charlie" -> "dog",
  "dory" -> "fish",
  "Bella" -> "cat"
)

//b) Write a function that returns a List of the names of David’s dogs.

val filteredAnimals: Map[String, String] = davidsPets.filter(
  dogs => dogs._2 == "dog")
