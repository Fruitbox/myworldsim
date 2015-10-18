package unittests;

import marsmission.BARModel;
import marsmission.CrewModuleModel;
import marsmission.EnginesModel;
import marsmission.LaunchAbortSystemModel;
import marsmission.OrionModel;
import marsmission.PayloadModel;
import marsmission.ServiceModuleModel;
import marsmission.ServiceModulePanelsModel;
import marsmission.SpacecraftAdapterModel;

public class TestBAR {
	/*
	 * Class Instance Variables
	 * 
	 */
	
	private BARModel 	bar;
	
	/*
	 * Class Constants
	 * 
	 */
	
	/*
	 * Construcutors
	 * 
	 */
	public TestBAR(PayloadModel payload, EnginesModel engines) {
		bar = new BARModel(payload, engines);
	}
	
	//main
	
	public static void main(String[] args){
		LaunchAbortSystemModel launchAbortSystemModel 	= new LaunchAbortSystemModel();
		OrionModel orion								= new OrionModel();
		ServiceModuleModel serviceModule				= new ServiceModuleModel();
		ServiceModulePanelsModel servicemodulepanels	= new ServiceModulePanelsModel();
		SpacecraftAdapterModel spacecraftAdapter		= new SpacecraftAdapterModel();
		EnginesModel engines							= new EnginesModel();
		
		PayloadModel payload = new PayloadModel( launchAbortSystemModel, orion, serviceModule,servicemodulepanels, spacecraftAdapter);
		TestBAR testBAR    = new TestBAR(payload,engines);	
		System.out.println("BAR test completed");
		System.out.println("Go fall in a hole");

	}

}



}

