package programs

// ?? functions and recursion
object PartEight {
  def main(args: Array[String]): Unit = {
  /*  funcOne("Hello", "I'm", "Soumya")
    def funcOne(args: String*): Unit = {
      var i = 0
      for (a <- args) {
        println("a value [" + i + "] = " + a)
        i += 1
      }
    }*/

    // ####################
    //?? recursion function
    //!! recursive Function is a function that repeats or uses again and again
    //!! Factorial number
    for (i <- 1 to 10) {
      println("factorial of " + i + " = " +factorial(i))
    }

    def factorial(a: BigInt): BigInt = {
      if (a <= 1) 1 else a * factorial(a - 1)
    }
  }
}
