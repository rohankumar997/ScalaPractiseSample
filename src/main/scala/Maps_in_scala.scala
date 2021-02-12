package com.FirstProgramme

object Maps_in_scala {
  def main(args: Array[String]): Unit = {
    println("immutable maps example")
    var map_in = Map("rohan"-> 1,"kumar"-> 2 ,"dubey"->3)
    var map_op = if(map_in.contains("rohan")) map_in("rohan") else 0
    println(map_op)

    println("mutable map example")
    var map_in_1 = scala.collection.mutable.Map("rohan"->2,"kumae"-> 4,"dubey"->6)
    println("before changing")
    println(map_in_1("rohan"))
    println("after chaning")
    map_in_1("rohan")=13
    println(map_in_1("rohan"))
    println("-----------------")
    println("adding elements ")
    println("-----------------")
    var mapp = scala.collection.mutable.Map("ron"->1,"ronn"-> 5 , "ronn3"-> 7)
    println("before entry ")
    println(mapp)

    println("after entry")
    mapp += ("ronn4"-> 9)

    println(mapp)
    println("-----------------------------")
    println("deleting the elements in map")
    println("-----------------------------")
    println(mapp)

    mapp -= ("ronn4")
    println("elements after deleting")
    println(mapp)

  }
}
