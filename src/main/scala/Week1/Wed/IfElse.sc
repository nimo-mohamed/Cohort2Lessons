// If Else statements

// depending on the weather, tell me what to wear.

val weather: String = "hot"

if (weather == "hot") {
  s"It is $weather, no coat needed."
} else {
  s"you need a coat, it is $weather"
}
// if TRUE --> hit the first string and its inside the 'if'
// if false --> hit the second string and its inside the 'else'


if (weather.toLowerCase() == "hot") {
  s"it is $weather, no coat needed."
} else if (weather == "raining"){
  s"it is $weather, take a coat with a hood."
} else {
  s"$weather is not valid, please enter raining or hot"
}

//Multiple options
val season: String = "winter"
if (weather.toLowerCase == "cold" || season.toLowerCase == "winter") {
  s"it is $weather, take a coat"
} else {
  "a light jacket is fine"
}