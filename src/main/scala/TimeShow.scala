object TimeShow {

  def main(args: Array[String]): Unit = {
    ShowTime(time())
  }

  def time(): Long ={
    println("the time in nano seconds!!!")
    System.nanoTime()
  }

  def ShowTime(t: => Long): Unit ={
    println("the process starts here!!")
    println("the time is :"+t)
  }

}
