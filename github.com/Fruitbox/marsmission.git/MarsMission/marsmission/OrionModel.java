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
	public static final int	   		CORION_REW				= 4;
	/*
	 * Construcutors
	 * 
	 */
	
	
	public OrionModel() 
	{
		super(ORION_MODEL, ORION_ORGANIZATION, CORION_REW);
	}

}
