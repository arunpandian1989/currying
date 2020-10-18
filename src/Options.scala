  object Options extends App {
    val input = args(0)
    val capitals = Map("France" -> "Paris", "Japan" -> "Tokyo", "India" -> "New Delhi", "Russia" -> "Moscow")
    val inputCapital = capitals.get(input)
    //#write show function here and print result
    println(input + " :" + show(capitals.get(input)) )
    def show(x: Option[String]) = x match {
      case Some(s) => s
      case None => "invalid"
    }
  }