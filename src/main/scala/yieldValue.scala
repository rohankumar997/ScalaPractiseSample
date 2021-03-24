object yieldValue {

  def main(args: Array[String]): Unit = {
//    in yield ech values is stored in form of list
    val a = for ( x <- 1 to 10 ; if x !=0 ) yield(x)
    println(a)
  }
}
