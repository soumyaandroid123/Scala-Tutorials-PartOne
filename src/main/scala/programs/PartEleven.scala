package programs

import Array._
//?? multi-dimensional array
object PartEleven {
  def main(args: Array[String]): Unit = {
    //?? 1st import the array
    val multiDim = ofDim[Int](3,3, 3)
    for(i <- 0 to 2){
      for( j <- 0 to 2){
        for (k <- 0 to 1){
          multiDim(i)(j)(k) = k
        }
      }
    }

    for (i <- 0 to 2) {
      for (j <- 0 to 2) {
        for (k <- 0 to 1) {
          print("   "+multiDim(i)(j)(k))
        }
      }
      println()
    }
  }
}
