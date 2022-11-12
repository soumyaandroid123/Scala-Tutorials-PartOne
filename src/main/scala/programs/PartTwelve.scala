package programs

import Array._

//?? concat and range array
object PartTwelve {
  def main(args: Array[String]): Unit = {
    //?? concatenate both array
    /* val myListOne = Array(1, 2, 3, 4, 5)
     val myListTwo = Array(5, 7, 8, 9, 10)
     val myListThree = concat(myListOne, myListTwo)

     for(x <- myListThree){
       print(x + ", ")
     }*/

    //?? range of an array
    val myListFour = range(10, 20, 2)
    val myListFive = range(10, 20, 4)

    for (x <- myListFour) {
      print(x + ", ")
    }
    println()
    for (x <- myListFive) {
      print(x + ", ")
    }

    /*val myListSix = concat(myListFour, myListFive)

    for (x <- myListSix) {
      print(x + ", ")
    }*/

  }
}
