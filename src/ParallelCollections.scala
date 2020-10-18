object ParallelCollections extends App {
  var intList = List(1,12,2,4,15,5)
  //complete the code
  def factorial(x : Int) : Int = {
    if(x==0 || x==1){
      return 1
    }
    else{
      return x*factorial(x-1)
    }
  }
  for(i <- intList)
    println(factorial(i))
}
