package MyWorldSim;

public class WolfTree extends Tree
{
    /*
     * Class Instance Variables
     */
	
	private int treeNumberofRooms;
	private int treeNumberofWolves;
	private int treeNumberofMachineguns;
	
	/*
	 * Class Constants
	 * 
	 */
	
	private final int   DEFAULT_NUMBER_OF_ROOMS        = 10;
	private final int   DEFAULT_NUMBER_OF_WOLVES       = 30;
	private final int   NUMBER_OF_WOLVES_PER_ROOM      = 3;
	private final int   NUMBER_OF_MACHINEGUNS_PER_ROOM = 3;
	
	
	/*
	 * Constructor Method
	 * 
	 */
	
	public WolfTree()
	{
		treeNumberofRooms       = DEFAULT_NUMBER_OF_ROOMS;
		treeNumberofWolves      = DEFAULT_NUMBER_OF_WOLVES; 
	}
	
	public WolfTree(int number, int branches, int roots, int rooms, int wolves)
	{
		super(number, branches, roots);
		
		treeNumberofRooms       = rooms;
		treeNumberofWolves      = wolves;
		treeNumberofMachineguns = NUMBER_OF_MACHINEGUNS_PER_ROOM * treeNumberofRooms;
	}
}
