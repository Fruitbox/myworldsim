package marsmission;

public class BARModel {
	/*
	 * Class Instance Variable
	 */
	private PayLoadModel					payload;
	private EnginesModel					engines;
	
	/*
	 * Class Constants
	 */

	/* 
	 * Constructors
	 */
	
	public BARModel(PayLoadModel payload, EnginesModel engines){
		this.payload 		= payload;
		this.engines     	= engines;
		
	}
	
}

