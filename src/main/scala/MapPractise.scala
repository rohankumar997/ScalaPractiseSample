object MapPractise {
  def main(args: Array[String]): Unit = {
    val finding = Map(1->"rohan",2->"kumar")
    val finding1 = Map(3->"mon",4->"tue")
    println(finding(1))
    println(finding.keys)
    println(finding.values)
    println(finding.isEmpty)

    for((k,y) <- finding){
      println(s"$k:$y")
    }

    println(finding.contains(1))

    println(finding ++ finding1)

    println(finding.size)

  }
}
