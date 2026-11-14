@main
def problem3():Unit={
  val name:String="Shoe"
  val quantity:Int=2
  val price:Double=1999.0
  val isAvailable:Boolean=true
  val grade:Char='A'

  val totalPrice=quantity*price

  println("Product Name: " +name)
  println("Quantity: " + quantity)
  println("Price: " + price)
  println("Available: " + isAvailable)
  println("Grade: " + grade)
  println("Total Price: " + totalPrice)

  val a:Int=10
  val convertDouble:Double=a.toDouble
  println(convertDouble)

  val b:Double=100.89
  val convertInt:Int=b.toInt
  println(convertInt)
}
