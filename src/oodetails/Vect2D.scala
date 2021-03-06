package oodetails

class Vect2D(val x: Double, val y: Double) {
  def plus(v: Vect2D) = new Vect2D(x + v.x, y + v.y)
  def minus(v: Vect2D) = new Vect2D(x - v.x, y - v.y)
  def scale(c: Double) = new Vect2D(x * c, y * c)
  def unary_-() = new Vect2D(-x, -y)
  def magnitude = math.sqrt(x * x + y * y)

  def apply(index: Int): Double = {
    index match {
      case 0 => x
      case 1 => y
      case _ => throw new IndexOutOfBoundsException(s"out of boundary at $index.")
    }
  }
}

object Vect2D {
  def main(args: Array[String]): Unit = {
    val v1 = new Vect2D(1, 2)
    val v2 = new Vect2D(2, 2)
    val v3 = v1.plus(v2)
    v1(0)
    println(v3.magnitude)
  }

}