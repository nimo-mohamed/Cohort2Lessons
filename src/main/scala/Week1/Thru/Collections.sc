// Seq, List, Map (notice the upperCase)

val firstSeq: Seq[Int] = Seq(1,2,3,4,5)
val firstList: List[Int] = List(1,2,3,4,5)
val firstMap: Map[String, Int] = Map(
  "one" -> 1,
  "two" -> 2,
  "three" -> 3,
  "four" -> 4,
  "five" -> 5
)
// Map has key value pairs (key -> value)
// Must declare the types of both key and value in the parameters

/** Accessing data*/
// SEQ
val getSeqData: Int = firstSeq(0)
val getSeqData: Int = firstSeq.head // this means get the first element (index position 0)
val getSeqtail: Seq[Int] = firstSeq.tail // this is get everything except the head (so get everything except index position 0)

val getSeq2Data: Int = firstSeq(2)
//val getSeqTooMuchData: Int = firstSeq(12) // out of bounds exception thrown as we dont have any data in the 12th index position.

//LIST

val getList1Data: Int = firstList(1)
val getListTail: List[Int] = firstList.tail
val getListInList: Int = firstList.last

//MAP
val getMapData = firstMap("three") // we enter the key to get the value

/** Manipulation data - Using map (LOWCASE m) */

val tripledList: List[Int] = firstList.map{
  number => number * 3
}

val tripledSeq: Seq[Int] = firstSeq.map{
  number => number * 3
} // bad practice to not name your data type

val tripledMap: Map[String, Int] = firstMap.map {
  case (key, value) => (key, value *3)
}

val changeKey: Map[String, Int] = firstMap.map {
  case (key, value) => (key.capitalize, value *3)
}

/** Manipulating data with filtering */
// filter
//filterNot (this works similar to !=)


val filteredSeq: Seq[Int] = firstSeq.filter(
  number => number >= 2
)

val filteredList: List[Int] = firstList.filter(
  number => number >= 2
)

filteredSeq == filteredList // this is true despite the val names not being the same. we are checking for the resulting value.

val filteredMap: Map[String, Int] = firstMap.filter(
  number => number._2 >= 2
)
// _1 --> is when we want to access the key
// _2 --> is when we want to access the key

val filterNotList: List[Int] = firstList.filterNot(
  number => number >= 2 // this is saying if there are any numbers more than or equal to 2 I DONT WANT THEM RETURNED
)

// this is the same as the ^^ this code
val notFilteredList: List[Int]
= firstList.filter(
  number => !(number >= 2)
)

/** Manipulating data - check if an element is present */
// get boolean result


  // exists
val existsSeq: Boolean = firstSeq.exists(number => number >= 7)

val existsList: Boolean = firstList.exists(number => number >= 2)

val exesitsMap: Boolean = firstMap.exists(number => number._2 >= 2)

// CONTAINS - give it a specific piece of data to look for.

val containsSeq: Boolean = filteredSeq.contains(2)
val containsList: Boolean = filteredList.contains(7)

val containsMap: Boolean = firstMap.contains("two") // checks the keys! - ONLY CHECKS FOR KEYS NOT VALUES

val containsOrSeq: Boolean = filteredSeq.contains(7) || firstSeq.contains(2)


/** Making addition - prepend or append */
// prepend means put something at the start  // append means put something at the end

val x: Seq[Int] = Seq[Int]()
x :+ 1
x :+ 2
x // this wont work because its immutable (remember val & var)

val y: Seq[Int] = Seq(3,4,5)
// Append (add to end)
val appendY = y:+ 5
// prepend (add to start)
val prependY = 2 +: appendY
val multipleInts = Seq(0,1,2) +: y
val multipleInts = Seq(0,1,2) ++ y

// Append Map
val appendMap = firstMap + ("six" -> 6)
// To order use ListMap rather than Map. (Remember April went back up and changed to ListMap

/** Deleting */
val removeHead = firstSeq.tail //remove head
val removeLast = firstSeq.init //remove last index position
//Removing Map
val removeValueInMap = firstMap - "three" //call to the key
val removeMultipleValuesInMap = firstMap - ("three", "one") //call to the key

