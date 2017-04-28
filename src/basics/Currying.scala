package basics

class Currying {
  
  def main(args: Array[String]): Unit = {
    val plus3 = add(3)_
    val eight = plus3(5)
    println(threeTuple(Math.random))
    
  }
  
 def add(x: Int)(y: Int): Int = x+y
 
 
 def threeTuple(a: Double): (Double,Double,Double) = {
   (a,a,a)
 }
 
}