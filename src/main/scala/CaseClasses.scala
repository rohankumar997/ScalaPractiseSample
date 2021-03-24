case class CaseClasses(name:Int,address:String,pincode:Int)
// case class is used to use the data base object values
// very useful for data tranfer objects like copy load hashcode
object UsingCase {
  def main(args: Array[String]): Unit = {

    val row_1 = new CaseClasses(1,"ron",43);
    val row_2 = row_1.copy()

    println(row_1==row_2)

    println(row_1.hashCode())

  }
}