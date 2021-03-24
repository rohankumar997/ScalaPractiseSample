
import scala.io.Source
object converting_to_upper {
def main(args:Array[String]): Unit ={

  var location = "C:\\Users\\ag16000\\OneDrive - Anthem\\Desktop\\GITHUB\\ScalaPractiseSample\\src\\main\\scala\\test.txt";
  var file = Source.fromFile(location);
  println("before conversion");
  for(i <- file.getLines()){
    println(i);
  }
  var file_1 = Source.fromFile(location);
  println("after conversion");
  for(j <- file_1.getLines()){
    println(j.toUpperCase());
  }
  println("after conversion");
  var file_2 = Source.fromFile(location);
  for(k <- file_2.getLines()){
    println(k.toLowerCase())
  }
 }
}
