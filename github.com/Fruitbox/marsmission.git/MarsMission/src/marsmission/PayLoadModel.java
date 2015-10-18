package marsmission;

public class PayLoadModel {
		
		
		
		private LaunchAbortSystemModel launchAbortSystem;
		private CrewModuelModel			crewModuel;
		private ServiceModuelModel serviceModule;
		private ServiceModuelPanelsModel serviceModuelPanels;
		private SpaceCraftAdapterModel spacecraftAdapter;
		private Stage3Model 				ipcs;
		private PayLoadModel			payLoadModel;
		
		
		/*
		 * class constants
		 * 
		 */
		
		
		public static final String ORION_MODEL = "Orion";
		public static final String ORION_ORGANIZATION = "NASA";
		public static final int    ORION_CREW			= 4; }
		
		/*
		 * 
		 * Constructors
		 */
		
		
		
		public PayLoadModel(LaunchAbortSystemModel launchAbortSystem, CrewModuelModel crewModule, ServiceModuelModel serviceModule, ServiceModuel){
			launchAbortSystem = new LaunchAbortSystemModel();
			crewModuel	= new CrewModuelModel(payLoadModel, ORGANIZATION, CREW);
			serviceModule 	= new ServiceModuelModel();
			serviceModuelPanels = ServiceModuelPanelsModel();
			spacecraftAdapter = SpaceCraftAdapterModel();

			
}
}
