  import scala.annotation.tailrec
  object TailRecursion extends App {
    //val input1 = args(0).toInt
    val input1 = 5
  def factorial(n: Int): Int = {
    @tailrec
    def factorialWithAccumulator(n: Int, acc: Int): Int =
      if (n == 0) acc else factorialWithAccumulator(n-1, n * acc)
    factorialWithAccumulator(n, 1)
  }
    println(factorial(input1))
  }