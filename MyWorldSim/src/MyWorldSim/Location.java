package MyWorldSim;


public class Location 
{
	/*
	 * CIV
	 */
	private WorldLocation	location; // x height y width
	private LocationTypes 	locationType;
	private String 			locationDescription;
	private Exit[]			locationExits;
		

	

	public Location()
	{
		location			=null;//x y
		locationType		=LocationTypes.BLOCKED;//when create- world type loc
		locationDescription	=null;//described as world type loc
		locationExits		=null;//inside direction nowhere
		
		
		
		
	}
	
	public Location(WorldLocation loc, entryDirection dimension, String description, LocationTypes type)
	{
		locationDescription = description;
		location	     = loc;
		locationType	=type;
		//no exit for nowhere../
		locationExits = new Exit[Direction.values().length-1];
	}

	

	
	
	public void setExit(Exit exit, Direction direction) {
		locationExits[direction.ordinal()]=exit;
	}

	


	public WorldLocation getLocation() {
		return location;
	}

	public void setType(LocationTypes type)
	{
		locationType=type;
	}
	public LocationTypes getType()
	{
		return locationType;	
	}


	public String getLocationDescription() {
		return locationDescription;
	}
	
	public void build(LocationTypes type){
		locationType=type;
	}







	public Exit getExit(int exit) {
		return locationExits[exit];
	}

	public void setDescription(String description)
	{
		locationDescription = description;
	}

	


	
	}



