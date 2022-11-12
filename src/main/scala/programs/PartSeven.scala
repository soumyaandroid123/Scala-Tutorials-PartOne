package programs

import scala.util.control.Breaks

//?? break Statement
// !! multiple break statement using in multiple loop
object PartSeven {
  def main(args: Array[String]): Unit = {
    var (a,b) = (0,0)
    var numList = List(1, 2, 3, 4, 5)
    var numListOne = List(11, 12, 13, 14, 15)
    val firstLoop = new Breaks
    val innerLoop = new Breaks
    firstLoop.breakable {
      for (a <- numList) {
        println("a = " + a)
        innerLoop.breakable{
          for (b <- numListOne) {
            println("b = " + b)
            if (b == 12) innerLoop.break
          }
        }
        println("after the inner breakable loop")
        if(a==2) firstLoop.break
      }
    }
    println("after the breakable loop")
  }
}
