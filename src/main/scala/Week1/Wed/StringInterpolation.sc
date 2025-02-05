/** String Interpolation */

// S
val person: String = "nimo"
println(s"my name is $person") // $ tells scala what val to look for!

println(s"3 x 3 = ${3*3}")

val a: Int = 1976
val b: Int = 6

println(s"a X b = ${a * b}")
// helpful when debugging code. print the result at certain points in a method.

//F
// common format specifiers (type safety)
//%f - Float, Double
//%d - Int, Long
//%s - String

val height: Double = 1.9
println(f"$person%s is $height%.2f metres tall") //2 d.p
println(s"$person%s is $height%.2f metres tall") // s interpolation wont recognise formatting.

math.Pi // build in library
println(f"Pi to 2 d.p is ${math.Pi}%.2f")
println(f"Pi to 5 d.p is ${math.Pi}%.5f")
println(f"Pi to 5 d.p is ${math.Pi}%20.5f")// Add padding
println(f"Pi to 5 d.p is ${math.Pi}%20.5f"  + "     ' ")// Add padding after (badly..

// printf - string
printf("'%s'", "Hello")
printf("'%20s'", "Hello") //padding before
printf("'%-20s'", "Hello") //padding after
printf("'%25%-20s'", "Hello") //padding before and after


// raw interpolation
println(s"Im going onto a \nnew line") // this wil drop into a new line with 's' interpolation
println(raw"im going onto a \nnew line")

// common use raw is for something called --> Regex


//TASK:

// 1. Create 2 strings for two peoples names. Then using those names use string interpolation to print "A is older than B"

val person2: String = "Tom"
println(s"$person2 is older than $person")



//2. Create 2 integers for the age of each person. Then use string interpolation to calculate how much older the first person is and print "A is X years older than B"

val personAge: Int = 25
val person2Age: Int = 40

println(f"$person2 is ${person2Age - personAge} years older than $person")


//3. Change your 2 integers to doubles and provide new decimal point values. Using string interpolation update the previous task so that the sentence remains the same but will give the answer to ld.p.

val personAge: Double = 25.1234
val person2Age: Double = 40.1234
println(f"$person2 is ${person2Age-personAge}%.2f years older than $person")



//4. Use string interpolation to avoid the new lines from this string.
//"In|n\n\n\n\n\n\nsameline/n\n"

println(raw"\In|n\n\n\n\n\n\nsameline/n\n")