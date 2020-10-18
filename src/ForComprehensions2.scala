object ForComprehensions2 extends App {
  val input : Int = args(0).toInt
 // val input = 3
  val x = List.tabulate(input)(n => (n+1) * 5)
  //println(x)
  val yieldedList = for (a <- x if a <50 && a%2 != 0)
      yield a
println(yieldedList)
  for(z <- yieldedList ){
    if (z%3 == 0) {
      println(z)
    }
  }
}