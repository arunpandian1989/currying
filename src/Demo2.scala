object Demo2 extends App {
  val input1 :Int = args(0).toInt
  //val input1 = 5
  val numberList :List[Int]=(1 to input1).flatMap((x:Int)=>List(x)).toList
  def findeven (x:Int):Option[Boolean] =
  {
    if (x%2==0)
      Some(true)
    else
      None
  }
  for (n <- numberList) {
    print(n)
    findeven(n) match {
      case Some(true) => println(" is even.")
      case None => println(" is odd.")
    }
  }
}