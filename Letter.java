
public class Letter 



{

	private String from, to, letter;
	
	
	public Letter(String from, String to)
	
	{
		this.from = from;
		this.to = to;
		
		letter = "Dear " + this.to + ":\n\n";
		
		
	}
	
	public void addLine(String line)
	{
		letter+=line +"\n";
		
	}
	
	public String getText()
	{
		
		return letter+ "\nSincerely,\n"+this.from ;
		
		
		
	}

	
	
	
}
