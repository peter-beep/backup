
public class Car 

/**
 
 Creates a class called Car.
 
 */

{

	private double fuelEfficiency;
	
	private double fuelLevel;
	
	
	public Car (double efficiency) //Takes in the efficiency of the car as input, and makes a car.
	{
		fuelEfficiency = efficiency;
		
		fuelLevel = 0.0; //Sets initial fuelLevel to zero.
		
	}
	
	
	
	public void drive(double distance) //Re-calculates the fuelLevel after car drives a specified distance.
	{
		fuelLevel = (fuelLevel - (distance/fuelEfficiency));
		
		
//		fuelLevel-= (distance/fuelEfficiency); ---> Another way to calculate fuelLevel after driving. 
		
	}
	
	
	public double getGasInTank ()
	{
		
		return fuelLevel;
		
	}
	
	
	public void addGas(double gasoline)
	{
		
		fuelLevel+= gasoline;
		
		
}
	
}
