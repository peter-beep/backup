
public class CarTester 



{

	public static void main(String args[])
	
	{
		
		Car toyota = new Car(35.5);
		
		System.out.println("Car's current fuel level is " + toyota.getGasInTank());
		System.out.println("Expected output is 0.0");
		
		
		toyota.addGas(9.0);
		
		
		System.out.println("Car's new fuel level is " + toyota.getGasInTank());
		System.out.println("Expected output is 9.0");
		
		toyota.drive(15.0);
		System.out.println("Car's updated fuel level is " + toyota.getGasInTank());
		System.out.println("Expected output is " + (9-(15/35.5)));
		
	}
	
}
