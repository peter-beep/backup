
public class PiggyBank 


{

	private int numberOfPennies;
	private int numberOfNickels;
	private int numberOfDimes;
	private int numberOfQuarters;
	private double balance;
	private final double PENNY_VALUE;
	private final double NICKEL_VALUE;
	private final double DIME_VALUE;
	private final double QUARTER_VALUE;
	
	
	
	
	
	public PiggyBank() 
	{
		PENNY_VALUE = .01;
		NICKEL_VALUE = .05;
		DIME_VALUE = .10;
		QUARTER_VALUE = .25;
	}
	
	public PiggyBank(double valueOfPenny, double valueOfNickels, double valueOfDimes, double valueOfQuarters)
	{
		PENNY_VALUE = valueOfPenny;
		NICKEL_VALUE = valueOfNickels;
		DIME_VALUE = valueOfDimes;
		QUARTER_VALUE = valueOfQuarters;
		
	}
	
	
	
	
	public int getNumberOfPennies()
	
	{
		
		return numberOfPennies;
	}
	
	public int getNumberOfNickels()
	{
		
		
		return numberOfNickels;
		
	}
	
	public int getNumberOfDimes()
	{
		
		
		return numberOfDimes;
	}
	
	
	public int getNumberOfQuarters()
	{
		
		return numberOfQuarters;
	}
	
	public void addPennies(int pennyNumber)
	{
		numberOfPennies = pennyNumber + numberOfPennies;
		
	}
	
	
	public void addNickels(int nickelNumber)
	
	{
		
		numberOfNickels = nickelNumber + numberOfNickels;
		
	}
	
	public void addDimes(int dimeNumber)
	
	{
		
		numberOfDimes = dimeNumber + numberOfDimes;
		
	}	
	
	
	public void addQuarters(int quarterNumber)
	
	{
		
		numberOfQuarters = quarterNumber + numberOfQuarters;
		
	}
	
	
	
	

	public double totalValue()
	
	{
		
		balance = PENNY_VALUE*numberOfPennies + NICKEL_VALUE*numberOfNickels + DIME_VALUE*numberOfDimes + QUARTER_VALUE*numberOfQuarters;
		
		
		return balance;
	}
	


}
