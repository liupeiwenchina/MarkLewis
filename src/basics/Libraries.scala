package basics
import scala.io.StdIn._
import scala.io.Source
import java.io.PrintWriter

object Libraries {
  def main(args: Array[String]): Unit = {
    val source = Source.fromFile("matrix.txt")
    val lines = source.getLines()
    val matrix = lines.map(_.split(" ")).toArray
    source.close()

    val pw = new PrintWriter("rows.txt")
    matrix.foreach { row => pw.println(row(1)) }
    pw.close()

    //    println("What is your name?")
    //    val name = readLine()
    //    
    //    println("How old are you?")
    //    val age = readInt()
    //    
    //    val st = buildList()
    //    println(st)
    //    
    //    val lst = buildList()
    //    println(concatStrings(lst))
  }

//  def buildList(): List[String] = {
//    println("enter:")
//    val input = readLine()
//    if (input == "quit") Nil
//    else input :: buildList()
//  }
//
//  def concatStrings(words: List[String]): String = {
//
//    if (words.isEmpty) ""
//    else words.head + " " + concatStrings(words.tail)
//
//  }
//
//  def concatStringsPattern(words: List[String]): String = words match {
//    case Nil => ""
//    case h :: t => h + " " + concatStringsPattern(t)
//
//  }

}