@main
def problem4():Unit={
  val a=40
  val b=20
  println("Addition:"+(a+b))
  println("Substraction:" +(a-b))
  println("Multiplication:" +(a*b))
  if(b!=0) {
    println("Division:" + (a / b))
    println("Remainder:" + (a % b))
  }
  else{
    println("Division not possible")
  }

  //comparison operators
  println("Greater than:" +(a>b))
  println("Less than:" +(a<b))
  println("Equal to:" +(a==b))

  //Logical Operators
  if(a>0 && b>0)
    println("Both are Positive number")

  if(a%2==0 || b%2==0)
    println("At least one number is even")


}
