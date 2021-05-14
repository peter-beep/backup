public class Pair

{
	private double number1;
	private double number2;

	

	public double getSum() // Computes the sum of two numbers.
	{
		double sum = (number1 + number2);
		return sum;
	}

	public Pair(double aFirst, double aSecond)
	{
		number1 = aFirst;
		number2 = aSecond;
		
	}
	public Pair()
	{
		number1 = 0;
		number2 = 0;
	}
	
	public double getDifference() // Computes the difference between two numbers.
	{
		double difference = (number1 - number2);
		return difference;
	}

	public double getProduct() // Computes the product of two numbers.
	{
		double product = (number1 * number2);
		return product;
	}

	public double getAverage() // Computes the average of two numbers.
	{
		double average = (number1 + number2) / 2;
		return average;
	}

	public double getDistance() // Computes the distance between two points.
	{
		double distance = Math.abs(number1 - number2);
		return distance;
	}

	public double max() // Retrieves the maximum value of the two double values in the program.
	{
		if (number1 >= number2)
			return number1;
		else
			return number2;
	}

	public double min() // Retrieves the minimum value of the two double values in the program.
	{
		if (number1 <= number2)
			return number1;
		else
			return number2;
	}
}