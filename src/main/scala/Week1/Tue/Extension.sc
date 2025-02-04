// Extension:

//1. “STRING” == “string”
//Is this true or false? Why?
"This is false because in scala and most programming languages string comparison is case-sensitive by default."

//2. Can you convert the string “one” to the int 1?

"no because they are different data types e.g. string and Int."

//In Scala, you cannot directly convert a String like "one" to an Int using a built-in method, because "one" is a text representation of a number, not a numeric value. However, you can convert strings like "1" or "42" to an integer, but converting words like "one" to the number 1 requires a bit more effort.
val number: Int = "1".toInt  // This works fine!

//3. Can you convert the int 1 to string “one”?
"Yes this is possible! For numbers like 1, you can easily map or define patterns to convert them into words and use a more complex algorithm."

//4. Can you convert int 1 to a string? Is the result as you would expect? NEED HELP WITH THIS AND WHY IT DOESNT WORK????
"Yes this is possible and can be done using the toString method which is available for all scala objects (since every class inherits from Any, which provides this method)."

val number: Int = 1
val numberAsString: String = number.toString

println(numberAsString)

//5. Convert a lowercase string to uppercase.
"yes this can be done using built in methods like .toUpperCase"

val lowerCaseString: String = "nimo"
val upperCaseString: String = lowerCaseString.toUpperCase


//6. Convert on the first letter of a string to uppercase.

"also possible using the  built in .capitalize method"

val noCapName: String = "nimo"
val withCapName: String = noCapName.capitalize