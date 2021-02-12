object string_concat {
  def main(args: Array[String]) {
    var str1:String =scala.io.StdIn.readLine();
    var str2:String=scala.io.StdIn.readLine();
    var str3:String=str1.concat(" "+str2);
    println(str3)
  }
}
