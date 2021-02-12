object SingleTon {
  def test(): Unit ={
    println("hi there this is object singleton")
  }

}

object non_singleton{
  def test(): Unit ={
    println("hi this is non singleton")
  }
}


object main_func{
  def main(args: Array[String]): Unit = {
    SingleTon.test()
    non_singleton.test()
  }
}