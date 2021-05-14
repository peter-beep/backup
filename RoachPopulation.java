
public class RoachPopulation 



{

	private int size;
	
	public RoachPopulation(int size)
	{
		
		this.size = size;
		
	}
	
	
	public void breed()
	{
		size*=2;
		
	}
	
	public void spray()
	
	{
		size*=.9;
	
		
	}
	

	public int getRoaches()
	{
		
		return size;
	}
	
}


