package marsmission;

public class CrewModuleModel {
	/*
	 * Class Instance Variables
	 * 
	 */
	private String 		model;
	private String		organization;
	private int			crewMembers;
	
	
	/*
	 * Class Constants
	 * 
	 */
	
	/*
	 * Construcutors
	 * 
	 */
	
	public CrewModuleModel(String model, String organization, int crewMembers){
		this.model			= model;
		this.organization	= organization;
		this.crewMembers	= crewMembers;
		
	}
}
