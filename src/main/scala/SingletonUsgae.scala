object SingletonUsage_1 {
  def firstUsage(): Unit ={
    print("hello first singleton");
  }
}

object SingletonUsage_2{
  def secondUsage(): Unit ={
    print("hello second singleton");
  }
}

object mainClass{
  def main(args: Array[String]): Unit = {
    SingletonUsage_1.firstUsage();
    SingletonUsage_2.secondUsage();
    print("hello third singleton");

  }
}
