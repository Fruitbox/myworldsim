package marsmission;

public class BARModel {
	/*
	 * Class Instance Variable
	 */
	private PayloadModel					payload;
	private EngineModel					engines;
	
	/*
	 * Class Constants
	 */

	/* 
	 * Constructors
	 */
	
	public BARModel(PayloadModel payload, EngineModel engines){
		this.payload 		= payload;
		this.engines     	= engines;
		
	}
	
}

