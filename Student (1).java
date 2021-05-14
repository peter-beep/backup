
public class Student 

{
	
	/**
	  Creates  a class called student.
	  
	  */
	
	
	private String name;
	private double quizScore;
	private int numberOfQuizes;
	
	public Student(String name) //Constructs a student with a specified name.
	{
		
		this.name = name;
		
		quizScore = 0.0;
		
		numberOfQuizes = 0;
	
		
	}

	
	
	public String getName() //Returns the name of the student.
	
	{
		
		return name;
	}
	
	public void addQuiz(int score) //Adds the specified quiz score to the total quiz score.
	{
		
		quizScore = quizScore + score;
		
		numberOfQuizes++;
		
		
	}
	
	public double getTotalScore() //Returns the total quiz score.
	
	{
		
		return quizScore;
		
		
	}

	
	public double getAverageScore() //Returns the average quiz score.
	{
	
		double avg = (quizScore)/(numberOfQuizes);
		return  avg;
		
	}
	
	
	
}


