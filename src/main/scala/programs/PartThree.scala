package programs

/* Chapter 4
Access Modifier 
*/

//?? private -
// only accessible in the particular class
class PrivateAccessModifier {
  class InnerClass {
    private def fun(): Unit = {
      println("method")
    }

    //?? accessible private method
    class InnerMost {
      fun()
    }
  }
  // ?? not accessible private method
  /*class OuterClass extends PrivateAccessModifier {
    fun()
  }*/
}

// ?? protected
// ?? only accessible in sub class
class ProtectedAccessModifier {
  protected def fun(): Unit = {
    println("method")
  }
}

// ?? accessible protected method
class OuterClass extends ProtectedAccessModifier {
  fun()
}

// ?? public
// ?? accessible in every where
class PublicAccessModifier {
  def fun(): Unit = {
    println("method")
  }
}

object PartThree {
  def main(args: Array[String]): Unit = {
    //!! private
    val privateAccessModifier = new PrivateAccessModifier()
    // ?? not accessible in the private method
    //privateAccessModifier.fun()

    //!! protected
    val outerClass = new OuterClass()
    // ?? not accessible in the protected method
    //outerClass.fun()

    //!! public
    val publicAccessModifier = new PublicAccessModifier()
    // ?? accessible in the public method
    publicAccessModifier.fun()
  }
}


