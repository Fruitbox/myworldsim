package marsmission;

public class BAR {
/*
 * class instance var
 */
	
	private PayLoadModel	payload;
	private Stage3EngineModel	stage3; 		//null if not used
	private int		maxSpeed;
	private StageAdapterModel	stageAdapter;	//null if not used
	private EnginesModel	coreStages;
	
	
	/*
	 * class constants
	 * 
	 * 
	 */
	  
	
	/*contstructors
	 * 
	 */
	
	
	public BAR(PayLoadModel payload, Stage3EngineModel stage3, StageAdapterModel stageAdaptermodel, EnginesModel coreStages) {
		this.payload = payload;
		this.stage3	= stage3;
		this.coreStages = coreStages;
		this.stageAdapter = stageAdapter;

	} 
	
	
}