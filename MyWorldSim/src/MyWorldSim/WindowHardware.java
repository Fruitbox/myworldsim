package MyWorldSim;
public class WindowHardware
{

	/*
	 * CIV
	 */
	private boolean	hardwareClosed;
	private boolean hardwareLocked;
	private boolean hardwareLatched;
	private boolean hardwareCanBeLocked;
	private boolean	hardwareBroken;
	private int hardwareType;
	//Hw types
	
	//class constants
	public static final int WINDOW_SLIDE_TYPE         = 1;//slide
	public static final int WINDOW_HUNG_TYPE			= 2;//cables
	public static final int WINDOW_HINGED_TYPE		= 3;//hinges
	public static final int WINDOW_BAY_TYPE			= 0;//cant open
	public  static int hardwareInsideLockType;
	private boolean windowCanLookIn;
	private boolean windowCanLookOut;
    private WindowHardware lockType;

	

	//Getters/setters
	
	public  boolean unLatch()
	{
		boolean unLatched = false;

		if(!isBroken() && !isLocked())
		{
			hardwareClosed=false;
			unLatched = true;
		}
		return unLatched;
	}
	
	public boolean latch()
	{
		boolean latched = false;

		if(!isBroken() && !isLocked())
		{
			hardwareClosed=false;
			latched = true;
		}
		return latched;
	}
	
	
	
	
	
	public boolean isBroken()
	{
		return hardwareBroken;
	}
	
	public boolean canlock()
	{
		return hardwareInsideLockType !=NO_LOCK_TYPE;
	}
	
	public boolean canOpen()
	{
		return !hardwareBroken;
	}
	
	public boolean isLocked() 
	{     
		return hardwareLatched;
	}
//setters
	
	
	public boolean lockFromInside()
	{
		if(!isBroken() & canlock()&& !isLocked())
		{
		
			hardwareLatched=true;
		}
		return hardwareLatched;
	}
	
	
	public int getknobType() 
	{
		return hardwareType;
	}
	public boolean isLatched() 
	{

		return hardwareLatched;
	}
	public void hardwareLocked()
	{	
		hardwareLatched = true;
	}
	public void unlock()
	{
		hardwareLatched=false;
	}
	
	public void lock()
	{
		hardwareLatched=true;
	}
	
	
	
	public boolean setHardwareBeLocked()
	{
		return hardwareCanBeLocked;
	}
	public boolean setHardwarebroken()
	{
		return hardwareBroken;
	}
	
	
	/*
	 * CC
	 */
	
	public static final int NO_HARDWARE_TYPE = 1;
	public static final int INSIDE			=2;
	public static final int	LEVER_TYPE		=3;
	public static final boolean	BROKEN	=	true;
	public static final int	NO_LOCK_TYPE			=0;
	
	
	
	/*
	 * Constructors
	 */
		public WindowHardware()
	{ 
	 hardwareType	=NO_HARDWARE_TYPE;	
	 hardwareInsideLockType = NO_LOCK_TYPE;
	 hardwareClosed		= false;
	 hardwareLatched			= false;				
	 hardwareCanBeLocked 	= false;
	 hardwareBroken 		= false;
	 }
	
		public WindowHardware(int type, int lockType)
		{ 
		 hardwareType	=type;	
		 hardwareInsideLockType = lockType;
		 hardwareClosed		= true;
		 hardwareLatched			= false;				
		 hardwareBroken 		= false;
		
		
		
		}
		
		
		
	public void setBroken()
	{
		hardwareBroken=true;
		hardwareLatched=false;
		hardwareLocked=false;
				
	}	
	
	
	
	
	
	//action methods
	
	public boolean unlockFromInside()
	{
		boolean unLocked=false;

		if (canlock()&& !isLocked())
		{
			hardwareLatched=true;
			unLocked=true;

		}
		return unLocked;
	}

}
	
	
