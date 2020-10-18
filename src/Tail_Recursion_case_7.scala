import scala.annotation.tailrec
object Tail_Recursion_case_7 extends App {
  val input1 = args(0).toInt
  val input2 = args(1).toInt
  @tailrec
  def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)
  val output = gcd(input1, input2)
  println(output)
}