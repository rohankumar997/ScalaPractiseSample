import scala.io.Source

object ReadFile {
  def main(args: Array[String]): Unit = {

    val file = Source.fromFile("C:\\Users\\ag16000\\OneDrive - Anthem\\Desktop\\GITHUB\\ScalaPractiseSample\\src\\main\\scala\\temp.txt")

    while(file.hasNext){
      print(file.next())
    }

  }

}
