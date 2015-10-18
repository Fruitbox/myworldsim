package marsmission;

public class OrionModel extends CrewModuleModel {
	/*
	 * Class Instance Variables
	 * 
	 */
	
	/*
	 * Class Constants
	 * 
	 */
	public static final String 		ORION_MODEL				= "Orion";
	public static final String 		ORION_ORGANIZATION		= "NASA";
	public static final int	   		ORION_CREW				= 4;
	/*
	 * Construcutors
	 * 
	 */
	
	
	public OrionModel() 
	{
		super(ORION_MODEL, ORION_ORGANIZATION, ORION_CREW);
	}

}
