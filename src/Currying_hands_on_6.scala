object Currying_hands_on_6 extends App {
  val input1 = args(0).toInt
  val input2 = args(1).toInt
  def modNum(n: Int)(x: Int) = n % x
  //complete the code
  def customMod = modNum(input2)_
  val output = customMod(input1)
  println(output)
}