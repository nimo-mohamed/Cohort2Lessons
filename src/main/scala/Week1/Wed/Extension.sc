//  Extension:
//  Logical operators used in IF statements (e.g., && or <) have an order of precedence.
//1. What is this order, or where can we find it?

"In Scala, operators have a precedence order that determines how expressions are evaluated when multiple operators appear in an if statement."

//() (Parentheses) have the highest precedence → Always evaluated first.
// Arithmetic operators (*, /, +, -) are evaluated before logical operators (&&, ||).
// Comparison operators (<, <=, >, >=) come before equality (==, !=).
// Logical AND (&&) is evaluated before Logical OR (||).
// Assignment operators (=) have the lowest precedence.

//Let's try to apply it, try to predict the answer before coding it:
//  2. What would (true || false && false) result in?

"true"

//  3. What about ((true || false) && false)? Note the parentheses used here.

"true"

//4. And finally, how about (1 < 4 && 7 != 10 || 9 + 10 == 21)?

"1 < 4 && 7 != 10 "
