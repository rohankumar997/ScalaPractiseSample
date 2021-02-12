object nested_for {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 10 ; j <- 1 to 10 ){
      if (i==j) {
        println(s"($i,$j)")
      }
    }
  }
}
