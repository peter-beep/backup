

/** 
  A class to test the Door class
 */

public class DoorTester
{
	/**
	  Tests the methods of the Door class
	  @param args not used
	  
	 */
	
	public static void main (String[] args)
	{
		
		Door frontDoor = new Door("Front", "open");
		System.out.println("The front door is " + frontDoor.getState());
		System.out.println("Expected:open");
		Door backDoor = new Door("Back", "closed");
		System.out.println("The back door is " + backDoor.getState());
		System.out.println("Expected: closed");
		// use the mutator to change the state variable
		backDoor.setState("open");
		System.out.println("The back door is " + backDoor.getState());
		System.out.println("Expected: open");
		//Add code to test the setName mutator here
		backDoor.setName("insideDoor"); // changes the name of backDoor to insideDoor
		System.out.println("The new name of the door is " + backDoor.getName());
		System.out.println("Expected: insideDoor");
		
		frontDoor.setName("outsideDoor"); // changes the name of frontDoor to outsideDoor
		System.out.println("The new name of the door is " + frontDoor.getName());
		System.out.println("Expected: outsideDoor");
		
	
		Door sideDoor = new Door("Side", "closed");
		sideDoor.open();
		System.out.println("The side door is " + sideDoor.getState());
		System.out.println("Expected: open");
		
		
		
		
	}

}

