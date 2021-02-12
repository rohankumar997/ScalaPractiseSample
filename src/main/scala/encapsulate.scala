class encapsulate(private val name:String,private val age:Int) // primary constructor
{
//auxillary constructor
  def this(name:String){
    this(name,100)
  }
  println()
  def test(): Unit ={
    print("my name is "+name + " and my age is "+age)
     }

}


object classTesting{
  def main(args: Array[String]): Unit = {

    val a = new encapsulate("rohan",12)
    a.test()

    val b = new encapsulate("hn")
    b.test()
  }

}