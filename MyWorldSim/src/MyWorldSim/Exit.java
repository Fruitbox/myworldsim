package MyWorldSim;

public class Exit 
{
	/*Class Instance Variables
	 */
	private Direction exitDirection;
	private Location exitToLocation;
	
	
	/*
	 * Class Instance Variables
	 */
	
	/*
	 * Construcor Methods
	 */
	
	public Exit(Direction direction, Location location)
	{
		exitDirection= direction;
		exitToLocation=location;
	}
	
	/*
	 * Getters
	 */
	public Direction getDirection()
	{
		return exitDirection;
	}
	
	public Location getExitToLocation()
	{
		return exitToLocation;
	}

	public void setLocation(Location location) {
		exitToLocation=location;
		
	}
	
	
}

