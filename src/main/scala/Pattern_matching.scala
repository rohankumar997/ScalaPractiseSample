object Pattern_matching {

  def main(args: Array[String]): Unit = {
      println("please enter integer  input: ")
      val result = scala.io.StdIn.readInt()
      println(func(result:Int))
      println("-----------------------------------")

      println("please enter character input: ")
      val result_1 = scala.io.StdIn.readLine()
      println(conf(result_1:String))
      println("-----------------------------------")
      println("please enter the integer input : ")
      val result_3 = scala.io.StdIn.readInt()
      println(conff_1(result_3:Int))
      println("-----------------------------------")

      println("please enter the boolean input : ")
      val result_4 = scala.io.StdIn.readBoolean()
      println(said(result_4:Boolean))

      println("-----------------------------------")
      val result_5 = scala.io.StdIn.readInt()
      println(con_2(result_5))
  }
  def func(x:Int) = x match {
    case 1 => "First_input"
    case 2 => "Second_input"
    case _ => "enter a valid option"
  }

  def conf(y:String) = y match {
    case "A" => 1
    case "B" => 2
    case _ => 0
  }

  def conff_1(z:Int) = z match {
    case 1 => 2
    case 2 => 3
    case 3 => 4
    case _ => 6
  }

  def said(bool: Boolean):String = bool match {
    case true => "you said true"
    case false => "you said fale"
    case _ => "issue with the input"
  }

  def con_2(b:Int) : String = b match {
    case 1 => "hello man"
    case 2 => "how are you"
    case _ => "not a valid option"
  }
}
