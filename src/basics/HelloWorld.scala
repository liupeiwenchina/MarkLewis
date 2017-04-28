

package basics

object HelloWorld extends App {
  val square = (x: Double) => x * x
  //println(square(10))

  val square1: Double => Double = x => x * x
  //println(square1(10))

  val twice: Double => Double = _ * 2

  val lt: (Double, Double) => Boolean = _ < _
  //println(lt(1,1))

  for (i <- 1 to 10 if i % 2 == 0) println(i)

  val fizzbuzz = for (i <- 0 to 20) yield {
    (i % 3, i % 5) match {
      case (0, 0) => "fizzbuzz"
      case (0, _) => "fizz"
      case (_, 0) => "buzz"
      case _ => i.toString
    }
  }
  
  println(fizzbuzz)
  
  
  val str = "123a"
  val num = try {str.toInt  
  } catch {
    case ex: NumberFormatException => 0
  }
  
  println(num)
  
  
}