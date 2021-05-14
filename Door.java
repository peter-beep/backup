
public class Door 
{
	private String state = ""; //stores the state of the door
	private String name = ""; //stores the name of the door
	
	
	public Door(String name, String state)
	{
		this.state = state;
		this.name = name;
	}
	
	public void close() //sets the state of the door to "closed"
	{
	
		state = "closed"; //changes the state of the door to "closed"
		
		
		
	}
	public void open() //sets the state of the door to "open"
	{
		
		state = "open"; //changes the state of the door to "open"
		
		
	}

	public String getState() //returns the state of the door
	{
		return state; 
	}

	public String getName() //returns the name of the door
	{
		return name;
	}
	
	
	public void setName(String newName) //changes the name of the door to the user specified name
	{
		
		name = newName;
		
	}
	
	public void setState(String newState) //changes the state of the door to the user specified state
	{
		
		state = newState;
		
	}
	
	
	
	
	
}

