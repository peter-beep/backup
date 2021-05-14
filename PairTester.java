import java.util.Scanner;


public class PairTester
{
	public static void main(String args[])
	{
		
		Scanner kbReader = new Scanner(System.in);
		
		
		
		System.out.print("Input the first number: ");
		double x = kbReader.nextDouble();
	
		System.out.print("Input the second number: ");
		double y = kbReader.nextDouble();
	
		
		
		Pair  numbers = new Pair(x,y);
		
		System.out.println(numbers.getSum());
		
		
		System.out.println(numbers.getDifference());
		
		System.out.println(numbers.getProduct());
		
		System.out.println(numbers.getAverage());
		
		
		
		
		
		
	}
}
