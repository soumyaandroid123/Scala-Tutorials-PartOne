package programs

trait Equal {
  def add(a: Int, b : Int): Unit
  def sub(x: Int, y : Int): Unit
}

class Point() extends Equal {
  def add(a: Int, b:Int): Unit = {
    val c = a + b
    println("value of c = " + c)
  }

  def sub(x: Int, y: Int): Unit = {
    val z = x - y
    println("value of z = " + z)
  }
}

object PartSixteen {
  def main(args: Array[String]) : Unit = {
    val obj = new Point()
    obj.add(5,4)
    obj.sub(5,4)
  }
}