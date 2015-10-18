package marsmission;

public class BARModel {
	/*
	 * Class Instance Variable
	 */
	private PayloadModel					payload;
	private EnginesModel					engines;
	
	/*
	 * Class Constants
	 */

	/* 
	 * Constructors
	 */
	
	public BARModel(PayloadModel payload, EnginesModel engines){
		this.payload 		= payload;
		this.engines     	= engines;
		
	}
	
}

