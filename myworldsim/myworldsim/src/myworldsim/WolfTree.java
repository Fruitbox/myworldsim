package myworldsim;

public class WolfTree extends TreeModel
{
	/*
	 * Class Instance Variables
	 * 
	 */
	
	private int	rooms;
	private	List<Wolf>			wolfs;
	private List<Weapon>        weapons;
	
	/*
	 * Class Constants
	 * 
	 */
	
	private final int   MAX_NUMBER_OF_ROOMS 			= 30;
	private final int   MAX_NUMBER_OF_WOLFS   			= 150;
	private final int   MAX_NUMBER_OF_MACHINE_GUNS      = 150;
	private final int	DEFAULT_NUMBER_OF_ROOMS			= 10;
	private final int	DEFAULT_NUMBER_OF_WOLVES		= 30;
	private final int	NUMBER_OF_WOLVES_PER_ROOM		= 3;
	private final int	DEFAULT_NUMBER_OF_MACHINE_GUNS	= 3;
	
	/*
	 * Constructor Method
	 * 
	 */
	
	public WolfTree()
	{
		rooms		= DEFAULT_NUMBER_OF_ROOMS;
		wolves		= DEFAULT_NUMBER_OF_WOLVES;
	}
	
	public WolfTree(int number, int branches, int roots, int rooms, int wolves)
	{
		super(number, branches, roots);
		
		rooms 	 	= rooms;
		wolves 	 	= wolves;
		machineGuns = NUMBER_OF_MACHINEGUNS_PER_ROOM * rooms;
	}
}
