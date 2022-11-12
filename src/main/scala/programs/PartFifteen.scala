package programs

//?? map
object PartFifteen {
  def main(args: Array[String]): Unit = {
    val names = Map("a" -> "Soumya", "b" -> "Ashis", "c" -> "Shubhrat")
    val numbers = Map("d" -> "1", "e" -> "2", "f" -> "3")

    //!! combine method
    //!! first method
    val combineMethodOne = names.++ (numbers)
    println(combineMethodOne)
    //!! second method
    val combineMethodTwo = names ++ numbers
    println(combineMethodTwo)

    //?? main method of map (keys, values, isEmpty)
    println(numbers.keys)
    println(numbers.values)
    println(names.isEmpty)

    //?? contains method
    if(names.contains("soumya")){
      println("a is exist" + names("a"))
    }
  }
}
