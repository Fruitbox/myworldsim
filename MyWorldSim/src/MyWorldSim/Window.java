package MyWorldSim;

public class Window 
{
	private Location windowLocation;//bottom left most corner
	private WindowHardware windowHardware; // OOP composition (the door has doorhardware)
	private Direction windowEntryDirection;
	private Direction windowExitDirection;
	private Direction windowLookInDirection;
	private boolean windowOpened;
	private Direction windowLookOutDirection;
	private WindowHardware lockType; // OOP composition (the door has doorhardware)

//mpa of the indow lasldalsdjwak jaweight of the ovject hitting the glass and the disntance fro mthe windowa
// google
	
	//use untempered glass for od house wdws and tempered glass for new houses
	
	public Window(int type,int lockType,Location location, String locationDescription, Direction entryDirection,Direction exitDirection, Direction lookInDirection, Direction lookOutDirection)
	{
		windowLocation.setType(LocationTypes.Window);
		windowLocation.setDescription(locationDescription);
		
		for (int direction = 0; direction < Direction.values().length; direction++)
		{
			
		}
		
		
		
		    
//check if window cannot be opened		
	
		if(type== WindowHardware.WINDOW_BAY_TYPE)
		{
			windowHardware= new WindowHardware();
			
			windowEntryDirection= Direction.NOWHERE;
			windowExitDirection=Direction.NOWHERE;
		}
		
		else if(entryDirection == Direction.NOWHERE && exitDirection == Direction.NOWHERE)
		{
			windowHardware= new WindowHardware(type,WindowHardware.NO_LOCK_TYPE);
			windowHardware.setBroken();

		}
		else
		{
			windowHardware=new WindowHardware(type, lockType);
			windowLocation=location;
			windowEntryDirection= entryDirection;
			windowExitDirection=exitDirection;
		}
		windowLookInDirection=lookInDirection;
		windowLookOutDirection=lookOutDirection;
		windowLocation=location;
		
	}//next time amoun 
	
	public Direction  lookInDirection()
	{
		return windowLookInDirection;
	}

	public Direction  lookOutDirection()
	{
		return windowLookOutDirection;
	}

	public boolean canLookIn()
	{
		return windowLookInDirection != Direction.NOWHERE;
	}
	
	public boolean canLookOut()
	{
		return windowLookInDirection != Direction.NORTHWEST;
	}
	
	public boolean canWindowLock() {
		return windowHardware.canlock();
	}



	public boolean isWindowOpened() {
	return !windowHardware.isLatched();
	}



	public boolean canWindowOpen() {
		return windowHardware.canOpen();
	}



	public int getWindowType() {
		return getWindowType();
	}

	public boolean jumpOut()
	{
		boolean canJump=false;
		
		if(windowEntryDirection !=Direction.NOWHERE && !windowHardware.isLatched())
		{
			canJump=true;
		}
			return jumpOut();			
			}
	
	public boolean breakWindow()
	{
		boolean windowBroken = false;
		
		return windowBroken;
	}

	public boolean jumpIn()
	{
	boolean canJump=false;
	
		if(windowEntryDirection !=Direction.NOWHERE && !windowHardware.isLatched())
		{
			canJump=true;
		}
			return jumpIn();
	}

	

	public boolean openWindow()
	{
		boolean windowOpened=false;
		if (windowHardware.canOpen() && windowHardware.isLatched())
		{
			windowHardware.unLatch();
			windowOpened=true;
		}
		
		return  windowOpened;
	}	 
	
	public boolean closeWindow()
	{
		boolean windowClosed=false;
		if (windowHardware.canOpen() && !windowHardware.isLatched())
		{
			windowHardware.unLatch();
			windowClosed=true;
		}
		
		return  windowClosed;
	}
	
	
	
	public boolean lockWindow()
	{
		boolean windowLocked=false;
		if (windowHardware.canlock() && !windowHardware.isLocked())
		{
			windowHardware.lock();
			windowLocked=true;
		}
		
		return  windowLocked;
	}
		
	
	public boolean unlockWindow()
	{
		boolean windowUnlocked=false;
		if (windowHardware.canlock() && windowHardware.isLocked())
		{
			windowHardware.lock();
			windowUnlocked=true;
		}
		
		return  windowUnlocked;
	}
	

	
}

