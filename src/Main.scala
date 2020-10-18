object Main extends App {
  class User(email: String, password: String) {
    var userName = None: Option[String]
  }
  val u = new User("john@example.com", "secret")
  u.userName = Some("John")

  // print the object information
  println(s"User Name: ${u.userName.getOrElse("not assigned")}")

}
