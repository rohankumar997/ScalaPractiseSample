package com.FirstProgramme
import java.io._
object writing_file {
  def main(args: Array[String]): Unit = {
    val writer = new PrintWriter(new File("C:\\Users\\ag16000\\Desktop\\GIT\\PRACTISE\\SCALA_PRACTISE\\" +
      "FirstScalaProgramme\\src\\main\\scala\\com\\FirstProgramme\\test.txt"))
    writer.write("hello man")
    writer.close()
  }
}
