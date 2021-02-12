
import scala.io.Source
object splitting_file {
  def main(args: Array[String]): Unit = {
    val read = Source.fromFile("C:\\Users\\ag16000\\OneDrive - Anthem\\Desktop\\GITHUB\\Scala_samples\\src\\main\\scala\\test2.txt").mkString
        println(read)
//    for (i <- read.splitAt()){
//      println(i)
//    }
    val count = read.split(" ").groupBy(x=>x).mapValues(x=>x.length)
    println(count)
  }
}
