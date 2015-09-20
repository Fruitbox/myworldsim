package marsmission;

public class SLSModel {

	/*
	 * class instance var
	 */
	
	SRBModel[]	solidFuelRockets;
	private MainEngineModel mainEngine;
	
		

		/*
		 * class constants
		 * 
		 * 
		 */
		
		public static final int SRB_ENGINES = 2;
		
		/*contstructors
		 * 
		 */
		
	
	public SLSModel() {
			solidFuelRockets = new SRBModel[SRB_ENGINES];
			
			for (int index = 0; index < SRB_ENGINES; index++){
				solidFuelRockets[index] = new SRBModel();
			}
		
			mainEngine = new  MainEngineModel();
	}

}
