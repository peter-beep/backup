
public class RoachSimulation 


{

	
	
	public static void main(String args[])
	{
		
		RoachPopulation x = new RoachPopulation(10);
		
		x.breed();
		x.spray();
		
		System.out.println("The population is " + x.getRoaches());
		
		x.breed();
		x.spray();
		
		System.out.println("The population is " + x.getRoaches());
		
		
		x.breed();
		x.spray();
		
		System.out.println("The population is " + x.getRoaches());
		
		
		x.breed();
		x.spray();
		
		System.out.println("The population is " + x.getRoaches());
		
		
	}
}
