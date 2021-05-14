
public class StudentTester 



{

	/**	
	 To test the methods of the student class.
	 */
	
	public static void main(String args[])
	{
		
		Student student = new Student("Pete Rigas");
	
		
		System.out.println("The student's name is "+ student.getName());
		System.out.println("Expected name: Pete Rigas");
		System.out.println("Student's initial quiz score is " + student.getTotalScore());
		System.out.println("Expected score: 0.0");
		
		student.addQuiz(80);
		System.out.println("Student's quiz score is " + student.getTotalScore());
		System.out.println("Expected score: 80.0");
		System.out.println("Student's avearge score is " + student.getAverageScore());
		System.out.println("Expected average is: 80.0");
		
		
		
		student.addQuiz(75);
		System.out.println("Student's quiz score is " + student.getTotalScore());
		System.out.println("Expected score: 155.0");
		System.out.println("Student's avearge score is " + student.getAverageScore());
		System.out.println("Expected average is: 77.5");
		
		
	}
	
	
	
	
}
