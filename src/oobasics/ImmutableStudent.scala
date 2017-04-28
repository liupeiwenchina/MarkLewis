package oobasics

class ImmutableStudent (
    val firstName: String, 
    val lastName: String,
    val quizzes: List[Int] = Nil, 
    val assignments: List[Int] = Nil, 
    val tests: List[Int] = Nil ) {
  //validity check
  private def validGrade(grade: Int) : Boolean = grade >= -20 && grade <= 120
  
  
  def addGrade(grade:Int): ImmutableStudent = { if(validGrade(grade)) new ImmutableStudent (
    firstName,
    lastName,
    grade::quizzes,
    assignments,
    tests
     )
  else this
  }
  
  def quizAverage: Double = if (quizzes.isEmpty) 0.0
    else if (quizzes.length == 1) quizzes.head
    else (quizzes.sum - quizzes.min).toDouble/(quizzes.length-1)
  def assignmentAverage: Double = if (assignments.isEmpty) 0.0
    else assignments.sum.toDouble/assignments.length
  def testAverage: Double = if (tests.isEmpty) 0.0 
    else tests.sum.toDouble/tests.length
  def average: Double = quizAverage * 0.1 + assignmentAverage * 0.5 + testAverage * 0.4
}