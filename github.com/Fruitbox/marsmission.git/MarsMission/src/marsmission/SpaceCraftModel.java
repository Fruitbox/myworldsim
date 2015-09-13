package marsmission;

public class SpaceCraftModel {
/*
 * class instance var
 */
	
	private int maxSpeed;
	private CrewModuelModel crewModule;
	private LaunchAbortSystemModel	launchAbortSystem;
	/*
	 * class constants
	 * 
	 * 
	 */
	
	
	/*contstructors
	 * 
	 */
	
	
	public SpaceCraftModel(int maxSpeed, CrewModuelModel crewModule, LaunchAbortSystemModel launchAbortSystem) {
		this.maxSpeed = maxSpeed;
		this.crewModule = crewModule;
		this.launchAbortSystem = launchAbortSystem;

	} 
	
	
}