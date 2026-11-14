object IntExtensions {
  implicit class RichInt(val num: Int) {
    def square(): Int = {
      num * num
    }
  }

}

@main
def problem7(): Unit = {

  import IntExtensions._

  val num1 = 4
  val num2 = 7

  println("Square of 4: " + num1.square())
  println("Square of 7: " + num2.square())
}
