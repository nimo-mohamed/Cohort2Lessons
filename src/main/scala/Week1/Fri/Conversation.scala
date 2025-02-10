package Week1.Fri
import scala.io.StdIn.readLine

object Conversation extends App {
  // Function to interact with the terminal and return "Hello X"
  private def greetUser(): Unit = {
    println("Enter your name:")
    val name = readLine() // Read user input from the terminal
    println(s"Hello $name") // Output greeting
  }

  greetUser()
}