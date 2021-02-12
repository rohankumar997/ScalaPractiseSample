object countingWords {

  def main(args: Array[String]): Unit = {

    val word  = Array("hi how", "are you","doing man","hi how")
    val words = word.flatMap(_.split(" ")).map(_.toLowerCase()).map((_,1))
    val consolidated = words.groupBy(_._1)
    val result = consolidated.mapValues(list=>{list.map(_._2).sum})
    result.foreach(println)

    }
}
