package oodetails

case class Vect2Dcc(x: Double, y: Double) {
  def plus(v: Vect2Dcc) = Vect2Dcc(x + v.x, y + v.y)
  def minus(v: Vect2Dcc) = Vect2Dcc(x - v.x, y - v.y)
  def scale(c: Double) = Vect2Dcc(x * c, y * c)
  def unary_-() = Vect2Dcc(-x, -y)
  def magnitude = math.sqrt(x * x + y * y)

  def apply(index: Int): Double = {
    index match {
      case 0 => x
      case 1 => y
      case _ => throw new IndexOutOfBoundsException(s"out of boundary at $index.")
    }
  }
}

object Vect2Dcc {
  def main(args: Array[String]): Unit = {
    val v1 = new Vect2Dcc(1, 2)
    val v2 = new Vect2Dcc(2, 2)
    val v3 = v1.plus(v2)
    v1(0)
    println(v3.magnitude)
    println(v3)
  }
}