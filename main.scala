import breeze.linalg._

object Main {

  def main(args: Array[String]): Unit = {

    val m1: DenseMatrix[Int] = DenseMatrix((1,2),
                                           (3,4))

    val m2: DenseMatrix[Int] = DenseMatrix((5,1),
                                           (4,8))

    println("--m1--")
    println(m1)
    println("--m2--")
    println(m2)

    // sum
    println("--sum--")
    println( m1 + m2 )

    // multiple
    println("--multiple--")
    println( m1 * m2 )


    m1(::, 0) := DenseVector(4,5)
    m2(0, ::) := DenseVector(2,3).t

    println("--m1--")
    println(m1)
    println("--m2--")
    println(m2)
    println("--sum--")
    println( m1 + m2 )
    println("--multiple--")
    println( m1 * m2 )

  }

}
