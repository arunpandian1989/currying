import scala.language.implicitConversions
object ImplicitConversion extends App {
  class CustomString(val s: String) {
    def findLength = s.length
  }
  class CustomInt(val number : Int) {
    def multiply = number * 5
  }
  implicit def StrToCustomInt(number: Int): CustomInt = new CustomInt(number)
  implicit def StrToCustomString(s: String): CustomString = new CustomString(s)
  //Complete the code
  val output1 = "100".findLength
  val output2 = 100.multiply
  println(output1, output2)
}