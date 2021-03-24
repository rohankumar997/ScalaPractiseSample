object SetsPractise {


  def main(args: Array[String]): Unit = {
    val finding = Set(1, 2, 3, 4, 5, 6)
    val finding2 = Set(1, 2, 3, 4, 5, 6)



    println(finding+10)
    println(finding(3))
    println(finding.max)
    println(finding.head)
    println(finding.tail)
    println(finding.isEmpty)
    println(finding++finding2)
    println(finding.intersect(finding2))

  }
}
