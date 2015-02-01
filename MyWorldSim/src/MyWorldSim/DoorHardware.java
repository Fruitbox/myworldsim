
package MyWorldSim;
public class DoorHardware
{

	/*
	 * CIV
	 */
	private boolean	hardwareLatched;
	private boolean hardwareLocked;
	private boolean hardwareKeyInsterted;
	private boolean hardwareCanBeLocked;
	private boolean	hardwareBroken;
	private int hardwareType;
	
	
	public   int hardwareOutsideLockType;
	private  int hardwareInsideLockType;
	private	DoorKey	hardwareKeyHole;
	//Getters/setters
	
	public DoorKey getKey()
	{
		return hardwareKeyHole.copyKey();
	}
	
	public boolean unLatch()   
	{
		boolean unLatched = false;

		if(!isBroken() && !isLocked())
		{
			hardwareLatched=false;
			unLatched = true;
		}
		return unLatched;
	}
	
	
	
	
	public boolean isKeyInserted()
	{
		return hardwareKeyInsterted;
	}  
	
	
	
	public boolean isBroken()
	{
		return hardwareBroken;
	}
	
	public boolean canlockFromInside()
	{
		return hardwareInsideLockType !=NO_LOCK_TYPE;
	}
	
	public boolean canLockFromOutside()
	{
		return hardwareOutsideLockType !=NO_LOCK_TYPE;
	}
	
	public boolean isLocked() 
	{     
		return hardwareLocked;
	}
//setters
	public boolean lockFromInside()
	{
		if(!isBroken() & canlockFromInside()&& !isLocked())
		{
			hardwareLocked=true;
		}
		return hardwareLocked;
	}
	public void setBroken()
	{
		hardwareBroken=true;
		hardwareLatched=false;
		hardwareKeyInsterted=false;
		hardwareLocked=true;
	}
	public boolean lockFromOutside(DoorKey key)
	{
		if(!isBroken() & canLockFromOutside()&& !isLocked())
		{
			if (hardwareOutsideLockType==KEY_LOCK_TYPE)
			{if (insertAndTurnKey(key)){
							hardwareLocked=true;
							removeKey();
							}
			else
			{
				hardwareLocked=false;
			}
			

			}
		}
		return hardwareLocked;
	}
	public int getknobType() 
	{
		return hardwareType;
	}
	public boolean latched() 
	{

		if(!isBroken() && !isLocked())
		{
			hardwareLocked=false;
		}
		return hardwareLatched;
	}
	public void lock()
	{	
		hardwareLocked = true;
	}
	public void unlock()
	{
		hardwareLocked=false;
	}
	
	public void	setKey()
	{
		hardwareKeyHole.setkeyCode();
	}
	
	public boolean setKeyInsterted()
	{
		return hardwareKeyInsterted;
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
	
	public static final int NO_HARDWARE_TYPE = 0;
	public static final int INSIDE			=1;
	public static final int	OUTSIDE			=2;
	public	static final int KNOB_TYPE		=1;//Rounded handle
	public static final int HANDLESET_TYPE	=2; //thumb handle
	public static final int	LEVER_TYPE		=3;
	public static final boolean	BROKEN	=	true;
	public static final int	NO_LOCK_TYPE			=0;
	public static final int KEY_LOCK_TYPE		=1;//outside
	public static final int KNOB_LOCK_TYPE		=2;//inside 
	public static final int PUSH_LOCK_TYPE		=3;//lock inside
	public static final DoorKey KEY			= null;
	
	private boolean insertAndTurnKey(DoorKey key)
	{
		if (hardwareKeyHole.getkeyCode() !=DoorKey.BLANK_KEY&& key.getkeyCode()== hardwareKeyHole.getkeyCode())
		{
			if(!isKeyInserted())
			{
				hardwareKeyInsterted =true;

			}
			
		} else{
			if (removeKey())
			{
				hardwareKeyInsterted=true;
			}
		}
			return hardwareKeyInsterted;
	
	}
	private boolean removeKey()
	{ if (isKeyInserted())
	{
		hardwareKeyInsterted = false;
	}
	return hardwareKeyInsterted;
		
	}
	
	
	
	
	/*
	 * Constructors
	 */
		public DoorHardware()
	{ 
	hardwareType	=NO_HARDWARE_TYPE;	
	 hardwareInsideLockType = NO_LOCK_TYPE;
	 hardwareOutsideLockType = NO_LOCK_TYPE;
	 hardwareLatched		= false;
	 hardwareLocked			= false;				
	 hardwareKeyInsterted   = false;
	 hardwareCanBeLocked 	= false;
	 hardwareBroken 		= false;
	 hardwareKeyHole		= new DoorKey(DoorKey.BLANK_KEY);
	 }
	
		
	
	public DoorHardware(int type, int insideLockType, int outsideLockType)
		{
		hardwareType= type;
		hardwareInsideLockType	= insideLockType;
		hardwareOutsideLockType = outsideLockType;
		
		if (outsideLockType == KEY_LOCK_TYPE)
			{
			hardwareKeyHole = new DoorKey();
			}
	 	if (canlockFromInside()|| canLockFromOutside())
	 	{
	 		hardwareCanBeLocked = true;
	 	}
	 	 hardwareLatched		= true;
		 hardwareLocked			= false;				
		 hardwareKeyInsterted	= false;
		 hardwareCanBeLocked 	= false;
		 hardwareBroken 		= false;
		}
	
	
	
	
	
	//action methods
	
	public boolean unlockFromInside()
	{
		boolean unLocked=false;

		if (canlockFromInside()&& !isLocked())
		{
			hardwareLocked=true;
			unLocked=true;

		}
		return unLocked;
	}
	
	public boolean unlockFromOutside(DoorKey key)
	{
		boolean unLocked=false;
		if(!isBroken()&&canLockFromOutside()&& isLocked())
		{
			if (hardwareOutsideLockType == KEY_LOCK_TYPE)
			{
				if (insertAndTurnKey(key)){
					hardwareLocked=false;
					unLocked=true;
                    removeKey();
				}
			
				
			}
			else
			{
				hardwareLocked=false;
				unLocked=true;
			}
		
		}
			
		return unLocked;
	}




	
			
	
	
	
	
}
