import java.io.IOException

object tryCatch {

  def main(args: Array[String]): Unit = {

    try{
      val number = 5/0
    }
    catch {
          case _: ArithmeticException => println("arithmetic exception")
          case _: IOException => print("io exception")
    }
  }
}
