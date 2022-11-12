package programs

// list methods
object PartFourteen {
  def main(args: Array[String]): Unit = {
    //?? Combine of List
    val fruit = "Apples" :: ("Mangoes" :: Nil)
    val fruitOne = "Grapes" :: ("Oranges" :: Nil)
    //!! first method
    val combineMethod = fruit.concat(fruitOne)
    println(combineMethod)
    //!! second method
    val combineMethodOne = fruit ::: fruitOne
    println(combineMethodOne)
    //!! third method
    val combineMethodTwo = fruit.:::(fruitOne)
    println(combineMethodTwo)

    //?? Reverse order
    val reverseOrder = fruit.reverse
    println(reverseOrder)

    //?? Create a element repeatedly in a list
    val newList: List[String] = List.fill(3) ("Apples")
    println(newList)
  }
}
