
public class Product 



{

	/**
	 	Creates a class product.
	 
	 */
	
	
	private String name;
	private double price;
	
	public Product(String name, double price) //Creates an object of type product.
	
	{
		
		this.name = name;
		this.price = price;
		
	}
	
	public String getName() //Returns the name of the product.
	
	{
		
		return name;
		
	}
	
	
	public double getPrice() //Returns the price of the product.
	
	{
		
		return price;
		
	}
	
	
	public void reducePrice(double reduction) //Reduces the price of the product.
	
	{
		
		price-= reduction;
	}
	
	
}
