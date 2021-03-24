object VariableArgumentsFunction {

  def main(args: Array[String]): Unit = {
    VariableArguments("Hello", "Scala", "Python")

  }

  def VariableArguments(args:String*): Unit ={
    var j:Int = 0
    for (i <- args){
      println("["+j+"] : "+i)
      j=j+1
    }
  }

}
