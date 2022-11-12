package programs

//?? For loop in Scala
object PartFour {
  def main(args: Array[String]): Unit = {
    //?? Example 1
    /*for(a <- 6 to 8){
      println("Value of a is "+a)
    }*/


    //?? Example 2 (Nested for loop) -> multiple condition
    /*  for (a <- 0 to 3; b <- 1 to 3) {
        println("Value of a is " + a)
        println("Value of b is " + b)
      }*/


    //?? Example 3 - > looping using on list
    /*   val numList = List(1, 2, 4, 6, 9,10)
       for (a <- numList){
         println(a)
       }*/


    //?? Example 4 - > looping using on list and using the condition
    val numList = List(1, 2, 4, 6, 9, 10)
    for (a <- numList if a != 2; if a > 9) {
      println("Value of a is " + a)
    }
  }
}
