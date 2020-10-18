object ForComprehensions1 extends App {
  val input : Int = args(0).toInt
  //val input = 10
  for( x <- 1 to input ){
    if (x % 2 == 0) {
      println("even :" + x)
    }
  }
  //complete the code
  val stringList :List[String] = List("Scala", "Ruby", "Python", "C#", "Java", "Groovy", "JavaScript", "PHP", "Haskell")
  //complete the code
  val result = stringList.filter(_.startsWith("P"))
  println(result)
}