package unittests;
import MyWorldSim.Direction;
import MyWorldSim.Door;
import MyWorldSim.DoorKey;
import MyWorldSim.Exit;
import MyWorldSim.Location;
import MyWorldSim.LocationTypes;
import MyWorldSim.World;
import MyWorldSim.WorldLocation;
import MyWorldSim.entryDirection;
public class TestDoor 
{
private Door door;
public TestDoor(int hardwareType, int insideLockType, int outsideLockType)
{
	WorldLocation doorLocation = new WorldLocation((short)(0), (short)(1));
	entryDirection doorDimension = new entryDirection((short)(3), (short)(8));
	
	Location location = new Location(doorLocation, doorDimension, "Front Door", LocationTypes.DOOR);
	
	WorldLocation enterCoordinates = new WorldLocation((short)(2), (short)(1));
	Location enterLocation = new Location(enterCoordinates, World.WORLD_LOCATION_DIMENSION, "entrance hall", LocationTypes.HALLWAY);
	
	WorldLocation exitCoordinates = new WorldLocation((short)(0), (short)(1));
	Location exitLocation = new Location(exitCoordinates, World.WORLD_LOCATION_DIMENSION, "entrance", LocationTypes.ENTRANCE);
	
	Exit enter       = new Exit(Direction.NORTH, enterLocation);
	Exit exit        = new Exit(Direction.SOUTH, exitLocation);
	
	door = new Door(location, doorDimension, enter, exit, hardwareType, insideLockType, outsideLockType);
}
	//Action METHODS
	
		public void run()  
		{
		System.out.println("Openining the door..."); 
		boolean doorOpen=door.open();
		if(doorOpen) 
		{
		System.out.println("The door is Open! Little Humans");
		}
		else
		{
		System.out.println("Can't Open Door!");
		}
			
		System.out.println("Getting key out of my pocket...");
			
		DoorKey key = door.getKey();
			
		// Test for a BLANK key
		if (key != null)
		{
		System.out.println("Found the key.");
		System.out.println("Locking door from inside");
				
		boolean doorLocked = door.lockDoor(key);
				
		if (doorLocked)
		{
		System.out.println("Door is now Locked.");
		}
		else
		{
		System.out.println("Door cannot be locked");
		}
				
		// try to lock the already locked door
				
			System.out.println("Locking the door from the outside..");
		if(!door.isLocked()) {		
		doorLocked = door.lockDoor(key);			
		if (doorLocked){
		System.out.println("Door cannot be locked");
		}
					
		}
		else
		{
		System.out.println("The door is already locked.");
		}
		 //open the locked door
				
		System.out.println("Opening the door..");
		doorOpen = door.open();
				
	    if(doorOpen) 
		{
		System.out.println("The door is Open! Little Humans");
		}
		else
		{
		System.out.println("Can't Open Door! The Door is" + (door.isLocked()? "locked" : door.isBusted()? "busted!" : "blocked, perhaps by a huge T.Rex what will eat you. SO DON'T OPEN IT!! Do you REALLY want to open the door?!") );
		}
				
	     // unlock the door		
		System.out.println("Getting the key out of my pocket");
		System.out.println("Unlocking the door..");
	 
		boolean unlocked = door.unLockDoor(key);
			
		if (unlocked)
		{
		System.out.println("Door is now unlocked");
	
		}
		else
		{
		System.out.println("Can't Open Door! The Door is" + (door.isLocked()? "locked" : door.isBusted()? "busted!" : "blocked, perhaps by a huge T.Rex what will eat you. SO DON'T OPEN IT!! Do you REALLY want to open the door?!") );
		}
			
		//open the locked door
				
						System.out.println("Opening the door..");
						doorOpen = door.open();
						if(doorOpen) 
		{
		 System.out.println("The door is Open! Little Humans");
		}
		 else
		{	
		 System.out.println("Can't Open Door! The Door is" + (door.isLocked()? "locked" : door.isBusted()? "busted!" : "blocked, perhaps by a huge T.Rex what will eat you. SO DON'T OPEN IT!! Do you REALLY want to open the door?!") );
		}
			
		//lock door from inside how can the game telli f the player is inside or outside?? The doorr
						
		System.out.println("Locking the door from inside");
		boolean locked = door.lockDoor();
			
		if (locked)
		{
		 System.out.println("Door is locked");
		}
		 else
		{
		 System.out.println("Can't lock Door! The Door is" + (door.isLocked()? "locked" : door.isBusted()? "busted!" : "blocked, perhaps by a huge T.Rex what will eat you. SO DON'T OPEN IT!! Do you REALLY want to open the door?!") );
	
		}
			
		  // unlock the door
		System.out.println("Getting the key out of my pocket");
		System.out.println("Unlocking the door..");
	 
		unlocked = door.unLockDoor(key);
			
		if (unlocked)
		{
		  System.out.println("Door is now unlocked");
	
		}
		  else
		{
		  System.out.println("Can't Open Door! The Door is" + (door.isLocked()? "locked" : door.isBusted()? "busted!" : "blocked, perhaps by a huge T.Rex what will eat you. SO DON'T OPEN IT!! Do you REALLY want to open the door?!") );
	
		}
			
		// Lock Door from the outside 
		System.out.println("Getting the key out of my pocket");
		System.out.println("Unlocking the door..");
	 
		  unlocked = door.unLockDoor(key);
			
		  if (unlocked)
		{
		  System.out.println("Door is now unlocked");
		}
		
		{
		   System.out.println("Door is now unlocked");
		}
		}
		    else
		{    	
	   	
		}
			
	    {
	    	System.out.println("Can't Open Door! The Door is" + (door.isLocked()? "locked" : door.isBusted()? "busted!" : "blocked, perhaps by a huge T.Rex what will eat you. SO DON'T OPEN IT!! Do you REALLY want to open the door?!") );
	    }
	    }
	    {
	       
	    }
	    { 
			System.out.println("Can't find key!");
		}	
		
	   
}
