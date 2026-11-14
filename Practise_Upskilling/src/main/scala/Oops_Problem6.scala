class Book(val title: String, val author: String, val price: Double) {

  def displayDetails(): Unit = {
    println(s"Book Title: $title")
    println(s"Author: $author")
    println(s"Price: $price")
  }
}

object BookProgram {
  def main(args: Array[String]): Unit = {

    val book1 = new Book("The Alchemist", "Paulo Coelho", 350.0)
    val book2 = new Book("Atomic Habits", "James Clear", 450.0)

    book1.displayDetails()
    book2.displayDetails()
  }
}