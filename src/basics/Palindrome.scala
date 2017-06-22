package basics

object Palindrome extends App {
  def isPalindrome(l: List[Int]): Boolean = {
    import scala.collection.mutable.ListBuffer
    
    val l2 = new ListBuffer[Int]()
    
    for (i <- l) l2.+=:(i)
    
    l2.==(l) 
    
  }
  
  val l = List(1,2,3,4,3,2,1)
  println(isPalindrome(l))
  
}