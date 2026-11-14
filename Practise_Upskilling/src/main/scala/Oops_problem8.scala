class Student(val name: String, val age: Int) {

  // Auxiliary constructor: accepts only name
  def this(name: String) = {
    this(name, 23)
  }

  // Auxiliary constructor: accepts no arguments
  def this() = {
    this("Unknown", 18)
  }

  def displayDetails(): Unit = {
    println("Student Name: " + name)
    println("Student Age: " + age)
  }
}

object Problem8 {

  def main(args: Array[String]): Unit = {

    // Using primary constructor
    val student1 = new Student("Harshita", 22)

    // Using auxiliary constructor with name
    val student2 = new Student("Hitanshu")

    // Using auxiliary constructor without arguments
    val student3 = new Student()

    student1.displayDetails()
    student2.displayDetails()
    student3.displayDetails()
  }
}
