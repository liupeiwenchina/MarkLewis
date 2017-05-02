package polymorphism

import scalafx.scene.canvas.GraphicsContext


class Shape {
  def area: Double = 0.0
  def perimeter: Double = 0.0
  def draw(gc: GraphicsContext): Unit = {}
}


object Shape {
  def main(args: Array[String]): Unit = {
    val rect = new Rectangle(3,4)
    printShapeData(rect)
  }
  
  def printShapeData(s: Shape): Unit = {
    println(s"Area = ${s.area}.")
    println(s"Perimeter = ${s.perimeter}.")
  }
}