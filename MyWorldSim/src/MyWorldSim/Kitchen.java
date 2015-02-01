package MyWorldSim;
import java.awt.Dimension;


public class Kitchen extends Room
{
   /*
    * Class Instance Variables
    */

	private int numberOfSinks;
	private int numberOfStoves;
	private int numberOfTables;
	private int numberOfFridges;
	private int numberOfCabinets;
	
	
	
	/*
	 * Class Constants
	 */
	
	public static final WorldDimension DEFAULT_KITCHEN_DIMENSION = new WorldDimension(1, 1, 1);
	private final int DEFAULT_KITCHEN_SINKS = 1;
	private final int DEFAULT_KITCHEN_STOVES = 1;
	private final int DEFAULT_KITCHEN_TABLES = 1;
	private final int DEFAULT_KITCHEN_FRIDGES = 1;
	private final int DEFAULT_KITCHEN_CABINETS = 1;
	
	/*
	 * Constructor Method
	 * 
	 */
	public Kitchen(Dimension location, Dimension locationDimension, String description, int windows, int sinks, int stoves, int tables, int fridges, int cabinets)
	{
		super(location, locationDimension, description, windows);
		numberOfSinks  = sinks;
		numberOfStoves = stoves;
		numberOfTables = tables;
		numberOfFridges = fridges;
		numberOfCabinets = cabinets;
	
	
	
	
	
	
	
	
}


}




