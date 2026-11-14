@main
def problem2():Unit={
  val name="Harshita"
  val course="Computer"
  var age=22
  var fee=20000
  age=23
  fee=50000
  println(s"Name: $name")
  println(s"Age: $age")
  println(s"Course: $course")
  println(s"Fee: $fee")

  //name="Jaiswal"
  // gives error since val is immutable i.e no reassignment is allowed
}
