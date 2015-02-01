

package MyWorldSim;

public enum LocationTypes 
{
	BLOCKED((byte)0),
	WORLD((byte)1),
	House((byte)2),
	Room((byte)3),
	Hallway((byte)4),
	Entrance((byte)5),
	Door((byte)6),
	Window((byte)7);
	
	private int			value;
	
	public static final int DIRECTIONS = Direction.values() .length - 1;
	
	public static final String[]	DIRECTION_NAMES =
		{
		"BLOCKED",
		"NORTH",
		"SOUTH",
		"EAST",
		"WEST",
		"NORTHEAST",
		"NORTHWEST",
		"SOUTHEAST",
	};		
			
	
	private LocationTypes(int type)
	{
		value=type;
	}


	public int getValue() {
		return value;
	}


	

	
	
	
}

