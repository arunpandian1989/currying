object options_case_5 extends App {
  val input = args(0)
  def convertToInt(x: String): Option[Int] = {
    val y = Option(x.toInt)
    return y
    // val z = x.toInt
    // if (z.isDigit) return y
  }
  convertToInt(input) match {
    case Some(x) => println("("+x+", Int)")
  }
}