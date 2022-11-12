package programs

import scala.annotation.tailrec

//?? nested function
object PartNine {
  def main(args: Array[String]): Unit = {
    for(i <- 0 to 4){
      println("factorial of " + i + " = " + factorial(i))
    }
  }

  //?? nested function
  def factorial(a:Int): Int ={
    @tailrec
    def fact(x:Int, y:Int): Int ={
      if (x <= 1) y else fact(x-1, x*y)
    }
    fact(a, 1)
  }
}
