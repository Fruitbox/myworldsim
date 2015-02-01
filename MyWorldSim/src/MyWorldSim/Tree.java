package MyWorldSim;

public class Tree 
{
  /*
   * Class Instance Variables
   */
	
	private int  treeNumber;
	private int     treeNumberOfBranches;
	private int     treeNumberOfRoots;
	
	/*
	 * Class Constants
	 */
	
	private final int  DEFAULT_NUMBER_OF_BRANCHES = 9;
	private final int  DEFAULT_NUMBER_OF_ROOTS    = 10;
	
	/*
	 * Constructor Method
	 * 
	 */
	
	public Tree()
	{
		treeNumberOfBranches   = DEFAULT_NUMBER_OF_BRANCHES;
		treeNumberOfBranches   = DEFAULT_NUMBER_OF_ROOTS; 
	}
	
	public Tree(int number, int  branches, int roots)
	{
		treeNumber              = number;   
		treeNumberOfBranches    = branches;
		treeNumberOfRoots       = roots; 
	}
}
