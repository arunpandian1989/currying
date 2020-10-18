import scala.annotation.tailrec
object Currying extends App{
//  val input1 = args(0).toInt
//  val input2 = args(1).toInt
//  val input3 = args(2).toInt
  val input1 = 3
  val input2 = 4
  val input3 = 5

  def factorial(x: Int): Int = {
    @tailrec
    def iter(n: Int, acc: Int): Int =
      if (n == 0) acc else iter(n-1, n * acc)
    iter(x, 1)
  }
  def add(x : Int)(y : Int) = factorial(x) + factorial(y)
  //complete the code
  def customAdd = add(input1)_
  println(customAdd(input2))
  println(customAdd(input3))
}