class CompanionClassesAndObjects {

  CompanionClassesAndObjects.instances+=1;

}

object CompanionClassesAndObjects{
  var instances:Int =0;
  def PrintInstance():Unit={
    print(instances);
  }

}


object TestCompanion {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 10) {
      new CompanionClassesAndObjects()
    }
      CompanionClassesAndObjects.PrintInstance()
  }
}
