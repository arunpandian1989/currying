object Parallel_Collections_case_8 extends App {
  val intList = List(1, 2, 300, 10, 30).par
  //complete the code
  def listGeneration(n : Int){
    print(List.tabulate(n)(n => n+1))
  }
  for (i <- intList)
    println(listGeneration(i))
}