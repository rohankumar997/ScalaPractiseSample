
class Value(X:Int,Y:Int){

  var x:Int=X;
  var y:Int=Y;

  def move(dx:Int,dy:Int): Unit ={
    x=x+dx;
    y=y+dy;
    println("update values of x is  : "+x)
    println("update values of y is  : "+y)
  }

}



object ScalaClassObjectRelation {
  def main(args: Array[String]): Unit = {

    val sample = new Value(1,2);
    sample.move(1,2)

  }

}
