class objndcls(val id:Int,val code:String) {

  def printStatus():Unit={
    println("the id and code are "+id+" & "+code)
  }

  def this(id:Int){
    this(id,"mon")
  }

}


object objcls_test {
  def main(args: Array[String]): Unit = {
    val defined = new objndcls(12,"man")
    defined.printStatus()
    val defined_again  = new objndcls(19)
    defined_again.printStatus()
  }
}