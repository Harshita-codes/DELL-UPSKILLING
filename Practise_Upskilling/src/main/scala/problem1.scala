@main
def problem1():Unit={
  val num1=20
  val num2= 10
  val sum=num1+num2
  println("Sum:"+sum)
  val diff=num1-num2
  println("Difference:"+diff)
  val prod=num1*num2
  println("Product:"+prod)
  val quot=num1/num2
  println("Division:"+quot)

  val name="Harshita"
  println(s"Hello $name")

  def add(a:Int, b:Int):Int={
    a+b
  }
  println(add(15,25))
}