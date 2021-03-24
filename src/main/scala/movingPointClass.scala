class movingPointClass(a:Int,b:Int) {

  var x:Int = a;
  var y:Int = b;

  def move(dx:Int,dy:Int): Unit ={
    x=x+dx;
    y=y+dx;
    println("value of x is : "+ x)
    println("value of y is : "+ y)

  }

}
