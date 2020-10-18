object ImplicitParams1 extends App {
  val input = args(0).toInt
  //val input = 5
  implicit val y = 5
  def multiply(x: Int)(implicit y: Int) = x * y
  println(multiply(input))
}