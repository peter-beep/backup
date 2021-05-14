
public class DigitExtractor



{

	
	private int int1;
	
	private int length;
	
	private int i;
	
	public DigitExtractor(int anInteger)
	{
		
		 int1 = anInteger;
		String temp = ""+anInteger;
		length = temp.length(); 
		
		i = 0;
	}
	
	
	
	
	public int nextDigit()
	{
		i++;
		 return (int1%((int)Math.pow(10,i)))/((int)Math.pow(10,i-1));
		 
		 
		 
		 
		
		
		
	}
	
	
	
	
}
