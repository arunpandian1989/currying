import scala.language.implicitConversions
object ImplicitConversions extends App {
  class CustomString(val s: String) {
    def isNumeric = s forall Character.isDigit
  }

  implicit def StrToCustomString(s: String): CustomString =
    new CustomString(s)

  val output1 = "100".isNumeric
  val output2 = "100s".isNumeric

  println(output1)
  println(output2)
}