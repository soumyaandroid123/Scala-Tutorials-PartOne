package programs

/* Chapter 1
Class , variable, Method declaration
*/

// Scala Class
class PartOne(val xc: Int, val yc: Int) {
  var x: Int = xc
  var y: Int = yc

  def move(dx: Int, dy: Int): Unit = {
    x = x + dx
    y = y + dy
    println("Value of x :" + x)
    println("Value of y :" + y)
  }
}

object PartOne {
  def main(args: Array[String]): Unit = {
    val demoClass = new PartOne(30, 50)
    demoClass.move(10, 20)
  }
}