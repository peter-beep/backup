
public class LetterPrinter 


{

	
	
	public static void main(String args[])
	
	{
		
		Letter x = new Letter("Pete", "Vatsal");
		
		x.addLine("I am sorry we must part");
		x.addLine("I wish you all the best");
		
		System.out.println(x.getText());
		
	}
}
