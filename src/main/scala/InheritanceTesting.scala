abstract class InheritanceTesting {
  def open():Unit
  def save():Unit
}

class Myfile extends InheritanceTesting(){
  override def open(): Unit = {
    println("opening the file!!")
  }
  override def save():Unit={
      println("saving the file!!")
    }
}

class CompressedFile extends Myfile(){
  override def save(): Unit = {
    println("compressing the file!!")
    println("doing compressing logic!!")
    super.save()
  }
}

object InheritanceTestingObj{
  def main(args: Array[String]): Unit = {
    println("before compression")
    var f : InheritanceTesting = new Myfile()
    f.open()
    f.save()
    println("----------------------")
    println("after compression!!")

    f= new CompressedFile()
    f.open()
    f.save()




  }
}