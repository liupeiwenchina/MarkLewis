package polymorphism

class Rectangle(val width: Double, val height: Double) extends Shape {
  override def area: Double = width * height
  override def perimeter: Double = 2 * (width + height)
}