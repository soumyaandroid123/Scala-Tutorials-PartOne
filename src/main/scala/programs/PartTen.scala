package programs

//?? Array
object PartTen {
  def main(args: Array[String]): Unit = {
    val myList = Array(0, 1, 2, 3, 10, 19)
    for(x <- myList){
      println("value of myList " + x)
    }

    //?? total of sum
    var total = 0
    for(x <- myList.indices){
      total += myList(x)
    }
    println("total value = "+total)

    //?? max number get of this list
    var max = myList(0)
    for (x <- 1 until myList.length){
      if(myList(x) > max) max = myList(x)
    }
    println("maximum value = "+max)

    //?? min number get of this list
    var min = myList(0)
    for (x <- 1 until myList.length){
      if(myList(x) < min) min = myList(x)
    }
    println("minimum value = "+min)
  }
}
