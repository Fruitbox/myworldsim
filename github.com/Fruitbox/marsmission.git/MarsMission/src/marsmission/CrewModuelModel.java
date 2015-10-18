package marsmission;

public class CrewModuelModel {
	/*
	 * class instance var
	 */
	
		private String model;
		private String organization;
		private Object crewMembers;
		
		
		/*
		 * class constants
		 * 
		 * 
		 */
		
		
		/*contstructors
		 * 
		 */
		
	public CrewModuelModel(String model, String organization, int crewMembers) {
		this.model   = model;
		this.organization = organization;
		this.crewMembers = crewMembers; 
		
		
	}


	public CrewModuelModel() {
		// TODO Auto-generated constructor stub
	}

}
