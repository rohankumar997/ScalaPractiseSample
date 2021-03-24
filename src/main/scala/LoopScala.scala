object LoopScala {
  def main(args: Array[String]): Unit = {

    var a :Int = 1;
    while(a<10){
      println(a);
      a+=1;
    }
println("------------------")
    var b:Int = 1;
    do {

      println(b);
      b+=1;
    }while(b<10)
println("------------------")
    var c:Int =1;
    for ( c <- 1 to 10){
      println(c)
    }

  }

}
