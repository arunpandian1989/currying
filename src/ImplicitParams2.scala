object ImplicitParams2 extends App {
  val input1 : String = args(0)
  val input2 : Int = args(1).toInt
 // val input1 = "Arun"
 // val input2 = 10
  //write your code here
  implicit val y = 7
  implicit val s1 = "Name"
  def add(x: Int)(implicit y: Int) = x + y
  def greet(x: String)(implicit y: String) = x + " :"+ y
  println(greet(input1))
  println(add(input2))
}