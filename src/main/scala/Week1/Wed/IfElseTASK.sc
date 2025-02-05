//Use conditions to calculate somebody's grade given the percentage they scored.
//90%+ = "A"
//80%+ = "B"
//70% + = "C"
//60%+ = "D"
//50%+ = "E"
//49%- = "F"



//TASK 1
val studentGrade: Int = 58

if (studentGrade >= 90 && studentGrade <= 100) {
  "A! Well done!"
} else if (studentGrade >=80 && studentGrade <= 89){
  "B"
}else if (studentGrade >=70 && studentGrade <= 79){
  "C"
}else if (studentGrade >=60 && studentGrade <= 69){
  "D"
}else if (studentGrade >=50 && studentGrade <= 59){
  "E"
} else if (studentGrade >=40 && studentGrade <= 49) {
  "F"
} else if (studentGrade >=0 && studentGrade <= 39){
  s"$studentGrade is a U grade"
} else {
  s"$studentGrade is not valid"
}



//Use conditions to work out for a given age, what film ratings they can see Make sure your conditions are exhaustive, and any age will get a response (what if they're younger than 4, what if they're exactly 8).
//4+ = "U"
//8+ = "PG"
//12+ = "12A"
//15+= "15"
//18+ = "18"

//TASK 2
val givenAge: Int = 3

if (givenAge >= 18){
  println("Films ratings: U, PG, 12A, 15 or 18")
} else if (givenAge >= 15){
  println("Films ratings: U, PG, 12A or 15")
} else if (givenAge >= 12){
  println("Films ratings: U, PG or 12A")
} else if (givenAge >= 8){
  println("Films ratings: U or PG")
}  else if (givenAge >= 4 && givenAge >= 0 ){
  println("Films ratings: U only")
} else {
  println(s"$givenAge is too young to attend the cinema")
}