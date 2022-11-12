package programs

/* Chapter 3
Extending class 
*/

//?? parent Class
class ClassOne(val xc: Int, val yc: Int) {
  var x: Int = xc
  var y: Int = yc

  def move(dx: Int, dy: Int): Unit = {
    x = x + dx
    y = y + dy
  }
}

//?? child class
class ClassTwo(override val xc: Int, override val yc: Int, val zc: Int) extends ClassOne(xc, yc) {
  var z: Int = zc

  def move(dx: Int, dy: Int, dz: Int): Unit = {
    x = x + dx
    y = y + dy
    z = z + dz
    println("Value of X:" + x)
    println("Value of Y:" + y)
    println("Value of Z:" + z)
  }
}

//?? declared main method
object PartTwo {
  def main(args: Array[String]): Unit = {
    val classTwo = new ClassTwo(10, 20, 30)
    classTwo.move(40, 50, 60)
  }
}
