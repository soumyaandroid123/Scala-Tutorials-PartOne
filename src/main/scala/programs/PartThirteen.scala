package programs

//?? List in Scala
object PartThirteen {
  def main(args: Array[String]): Unit = {
    val fruit: List[String] = List("apple", "oranges", "grapes")
    val numbs: List[Int] = List(1, 2, 3, 4, 5)
    val dims: List[List[String]] = List(List("Soumya", "Ranjan", "Mishra"), List("s", "o", "m"))
    println(fruit.head)
    println(numbs.appendedAll(List(5, 6, 9)))
    println(dims.isEmpty)
    println(numbs.max)
    println(numbs.min)
    println(numbs.find(x => x == 2))

    // Creating an Iterator
    val item = Iterator(3, 6, 15, 12, 21)
    // Applying find method
    val result = item.find(x => {
      x % 3 == 0
    })
    // Displays output
    println(result)

    var sum = 0
    for(x <- numbs.indices){
      sum += numbs(x)
    }
    println("total value = " + sum)
  }
}
