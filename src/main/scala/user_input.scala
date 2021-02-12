package com.FirstProgramme

object user_input {
    // Main method
    def main(args: Array[String]) {
      // Applying a loop
      while (true) {

        // Reads the line from the Console
        print("enter the string: ")
        val result = scala.io.StdIn.readLine()

        // Displays the string that is
        // given by the user
        printf("the string entered is : %s", result)
        println("\n-----------------------------------")

        //prints newline
        println()
      }
    }
}
