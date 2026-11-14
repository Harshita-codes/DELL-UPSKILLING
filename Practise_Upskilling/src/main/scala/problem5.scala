@main
def problem5():Unit= {
  val marks1=85
  val marks2=75
  val marks3=95

  val total=marks1+marks2+marks3
  val avg=total/3.0
  println("Total:"+total)
  println("Average:"+avg)

  if(avg<=100 && avg>80)
    println("Grade A")
  else if(avg<=80 && avg>60)
    println("Grade B")
  else {
    println("Grade C")
  }

  if(marks1>=40 && marks2>=40 && marks3>=40){
      println("Pass")
  }
  else {
      println("Fail")
  }

  for(i<-1 to 10) {
    println(i)
  }

  var j=1
  while(j<=5)
  {
    println(j)
    j+=1
  }
}

