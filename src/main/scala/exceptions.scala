object exceptions {
  def main(args: Array[String]): Unit = {
    val number = 20
    if(number<30){
      throw new ArithmeticException("not eligible")
    }
    else{
      println("eligible")
    }
  }

}
