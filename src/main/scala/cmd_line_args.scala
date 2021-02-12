package com.FirstProgramme

object cmd_line_args {
  // Scala Program on command line argument
    // Main method
    def main(args: Array[String]): Unit = {
      println("command line arguments programme: ")
//to loop over the arguements
      for ( i <- args){
        println(i)
      }

      //to display only one argument
      //println(args(0))
    }
}
