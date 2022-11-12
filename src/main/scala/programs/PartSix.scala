package programs

//?? while & do-while loop in Scala
object PartSix {
  def main(args: Array[String]): Unit = {
    var a = 0
    //?? while loop
    while (a<20){
      println("value of a is : " + a)
      a +=1
    }
    //!! Do while loop
    /*  do {
      println("a = " + a)
      a += 1
    } while (a < 10)*/
  }
}