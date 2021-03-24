object ConcOperator {

  def main(args: Array[String]): Unit = {
    val finding = List(1, 2, 3, 4, 5, 6)
//conc operator :: used to concat an element to list
    println(0 :: finding)
    println("##############")
    for (i <- finding) {
      println(i)
    }
    println("##############")
    println(finding.head)
    println("##############")
    println(finding.tail)
    println(Nil)
    println(finding.isEmpty)
    println(finding.reverse)
    println(List.fill(3)("rohan"))
    println(finding.max)
  }

}
