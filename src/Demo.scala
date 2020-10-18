object Demo extends App {
  //val input1 :Int = args(0).toInt
  val input1 = 5;

  implicit val y = 5
  val x = List.tabulate(input1)(n => (n+1))
  println(x)
  def add(n: Int)(implicit y: Int) = n + y
  println(add(input1))
  val newList = for (a <- x)
    yield add(a)
  println(newList)
}


//Declare an implicit integer variable 5. Generate a List with input1 such that the number of elements is equal to input1,
// and the numbers are from 1 to input1 (when input is 3 -> List(1,2,3)).
// Write a curried function add which takes two integer variables in which one variable is an implicit variable.
// Using a for comprehension, apply the add function on the generated list and print the result.