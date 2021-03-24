import java.io.File
import java.io.PrintWriter

object WriteFile {

  def main(args: Array[String]): Unit = {

  val file = new File("C:\\Users\\ag16000\\OneDrive - Anthem\\Desktop\\GITHUB\\ScalaPractiseSample\\src\\main\\scala\\test.txt" )

  val writer = new PrintWriter(file)

    writer.write("sup man ")


  }
}

