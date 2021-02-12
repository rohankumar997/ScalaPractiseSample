
import scala.io.StdIn
object EvenCalculate {
  def main(args: Array[String]): Unit = {
    println("enter the value to check!!!")
    var b :Int = StdIn.readInt()
    var valueEven:Boolean = isEven(b)
    if(valueEven)
      println(s"$b is even ")
    else
      println(s"$b is old ")

  }

  def isEven(a :Int):Boolean={
    var value:Int=0
    if(a %2 ==0){
      true
    }
    else{
      false
    }
  }

}
