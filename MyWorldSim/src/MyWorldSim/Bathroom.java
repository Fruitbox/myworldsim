package MyWorldSim;


public class Bathroom extends Room
{
  /*
   * Class Instance Variables
   * 
   */
	
	private int numberOfSinks;
	private int numberOfShowers;
	private int numberOfToilets;
	private int numberOfMirrors;
	private int numberOfCabinets;
	 
	
	/*
	 * Class Constants
	 */
	
	public static final WorldDimension DEFAULT_BATHROOM_DIMENSION = new WorldDimension(1, 1, 1);
	
	private final int DEFAULT_BATHROOM_SINKS = 1;
	private final int DEFAULT_BATHROOM_SHOWERS = 1;
	private final int DEFAULT_BATHROOM_TOILETS = 1;
	private final int DEFAULT_BATHROOM_MIRRORS = 1;
	private final int DEFAULT_BATHROOM_CABINETS = 3;
	/*
	 * Constructor Methods
	 * 
	 */
	
	public Bathroom(WorldDimension location)
	{
		super(location, DEFAULT_BATHROOM_DIMENSION);
		
		numberOfSinks   = DEFAULT_BATHROOM_SINKS;
		numberOfToilets = DEFAULT_BATHROOM_TOILETS;
		numberOfShowers = DEFAULT_BATHROOM_SHOWERS;
		numberOfMirrors = DEFAULT_BATHROOM_MIRRORS;
		numberOfCabinets = DEFAULT_BATHROOM_CABINETS;
		
		
	}
	
	public Bathroom(WorldDimension location, WorldDimension locationDimension, String description, int windows, int sinks, int showers, int toilets, int mirrors, int cabinets)
	{
		super(location, locationDimension, description, windows);
		
		numberOfSinks = DEFAULT_BATHROOM_SINKS;
		numberOfShowers = DEFAULT_BATHROOM_SHOWERS;
		numberOfToilets = DEFAULT_BATHROOM_TOILETS;
		numberOfMirrors = DEFAULT_BATHROOM_MIRRORS;
		numberOfCabinets = DEFAULT_BATHROOM_CABINETS;
		
		
		
	}
	
}
	
	
