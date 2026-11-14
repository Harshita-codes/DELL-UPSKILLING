// Parent class
class Employee(val name: String, val salary: Double) {

  def displayDetails(): Unit = {
    println("Name: " + name)
    println("Salary: " + salary)
  }

  def workDescription(): Unit = {
    println("Employee performs general tasks.")
  }
}

// Child class Manager
class Manager(name: String, salary: Double, val teamSize: Int)
  extends Employee(name, salary) {

  def conductMeeting(): Unit = {
    println(name + " conducts team meetings.")
  }

  override def workDescription(): Unit = {
    println(name + " manages the team and assigns tasks.")
  }
}

// Child class Developer
class Developer(name: String, salary: Double, val programmingLanguage: String)
  extends Employee(name, salary) {

  def writeCode(): Unit = {
    println(name + " writes code using " + programmingLanguage + ".")
  }

  override def workDescription(): Unit = {
    println(name + " develops and maintains software.")
  }
}

// Main object
object Problem9 {

  def main(args: Array[String]): Unit = {

    val manager = new Manager("Rahul", 80000, 10)
    val developer = new Developer("Amit", 60000, "Scala")

    println("Manager Details")
    manager.displayDetails()
    println("Team Size: " + manager.teamSize)
    manager.conductMeeting()

    println()

    println("Developer Details")
    developer.displayDetails()
    println("Programming Language: " + developer.programmingLanguage)
    developer.writeCode()

    println()
    println("Runtime Polymorphism")

    val employees: List[Employee] = List(manager, developer)

    for (emp <- employees) {
      emp.workDescription()
    }
  }
}
