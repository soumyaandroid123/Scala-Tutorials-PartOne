package programs

//?? if else statement
object PartFive {
  def main(args: Array[String]): Unit = {
    val x = 10
    if (x < 5) {
      println("false condition")
    } else if (x > 5) {
      println("true condition")
    }else{
      println("statement wrong")
    }
  }
}