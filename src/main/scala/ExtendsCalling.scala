class ExtendsCalling(a:Int,b:Int) {
  var x:Int=a;
  var y:Int=b;

  def move(dx:Int,dy:Int): Unit ={
    x=x+dx;
    y=y+dy;

    println("moved coordinates for x is : "+x)
    println("moved coordinates for y is : "+y)

  }
}

class NewExtendsCallingClass( val a:Int, val b:Int, c:Int) extends ExtendsCalling(a:Int,b:Int){

  var z:Int = c;

   def move(dx:Int,dy:Int,dz:Int): Unit ={
    x=x+dx;
    y=y+dy;
    z=z+dz;
    println("moved coordinates for x is : "+x)
    println("moved coordinates for y is : "+y)
    println("moved coordinates for z is : "+z)

  }



}


object ExtendsCallingClass{
  def main(args: Array[String]): Unit = {

    val Value = new NewExtendsCallingClass(1,2,3)

    Value.move(1,2,3)

  }
}