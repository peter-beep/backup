
public class ProductPrinter 



{
	/**
	 Creates a class to test the methods of the Product class.
	 */
	
	
	public static void main(String args[])
	
	{
		
		Product toaster1 = new Product("toaster" ,50.00);
		
		Product toaster2 = new Product("hi" , 100.00);
		
		System.out.println("The cost of " + toaster1.getName() + " is $" + toaster1.getPrice());
		System.out.println("The cost of " + toaster2.getName() + " is $" + toaster2.getPrice());
		
		
		// System.out.println("The new price of toaster is " + toaster1.reducePrice(5)); ----> can't print void
		
		toaster1.reducePrice(5);
		toaster2.reducePrice(5);
		
		System.out.println("The cost of " + toaster1.getName() + " is $" + toaster1.getPrice());
		System.out.println("The cost of " + toaster2.getName() + " is $" + toaster2.getPrice());
		
		
		
		
		
		
	}
	
	
	
}
