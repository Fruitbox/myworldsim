package marsmission;

public class EnginesModel {
	/*
	 * Class Instance Variables
	 * 
	 */
	private SRBModel[]			solidFuelRockets; //stage 2
	private MainEngineModel		mainEngine; //stage 1
	private Stage3EngineModel 		stage3;       //stage 3
	/*
	 * Class Constants
	 * 
	 */
	public static final int SRB_ENGINES = 2;
	
	/*
	 * Construcutors
	 * 
	 */
	
	public EnginesModel()
	{
		solidFuelRockets = new SRBModel[SRB_ENGINES];
		
		for(int index=0; index < SRB_ENGINES; index++){
			solidFuelRockets[index] = new SRBModel();
		}
		
		mainEngine = new MainEngineModel();
	}
}
