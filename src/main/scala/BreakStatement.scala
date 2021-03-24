import scala.util.control.Breaks

object BreakStatement {

  def main(args: Array[String]): Unit = {

    val loop = new Breaks;

    val sample = List(1,2,3,4,5,6,7,8,9,10);

    loop.breakable{
      for( i <- sample){
        println(i)
        if(i==7){
          loop.break
        }
      }
    }

  }
}
