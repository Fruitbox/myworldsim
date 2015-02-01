package MyWorldSim;

public class Gun extends Weapon 
{
   /*
    * Class Instance Variables
    */
	
	private boolean gunAutomaticSetting; 
	private int     gunAmmo;
	private double     gunCaliber;
	private int     gunRecoil;
	private boolean gunScope;
	private int     gunRPM;   // Automatic mode
	private int     gunWeight;
	private int     gunDamage;
	     
	/*
	 * Class Constants
	 * 
	 */
	private final int DEFAULT_GUN_AMMO = 12;
	private final int DEFAULT_GUN_CALIBER = 45;
	
	private final int DEFAULT_HAND_GUN_RECOIL = 1;
	private final int DEFAULT_RIFLE_RECOIL = 2;
	private final int DEFAULT_SHOTGUN_RECOIL = 3;
	private final int DEFAULT_MACHINEGUN_RECOIL= 4;
	private final int DEFAULT_CANNON_RECOIL = 6;
	private final int DEFAULT_ROCKET_LAUNCHER_RECOIL = 5;
	
	private final int DEFAULT_RPM = 60; //1 round at a time
	

    public static final int DEFAULT_DAMAGE       = 25;  //percent of health
    public static final double DEFAULT_WEIGHT      = 1;   //in pounds
    public static final int DEFAULT_ACCURACY = 50;    //in yards
    public static final int DEFAULT_RANGE   = 300;   // int yards 
	
	/*
	 * Constructor Methods
	 * 
	 */
    
    public Gun()  
    {
		super(DEFAULT_DAMAGE, DEFAULT_WEIGHT, DEFAULT_ACCURACY,  DEFAULT_RANGE, DEFAULT_LIGHT_WEIGHT_MOBILITY);
		
		gunAutomaticSetting = false;
		gunAmmo = DEFAULT_GUN_AMMO;
		gunCaliber = DEFAULT_GUN_CALIBER;
		gunRecoil = DEFAULT_HAND_GUN_RECOIL;
		gunScope = false;
		gunRPM = DEFAULT_RPM;
	}
	
    
    
    

    public Gun(double caliber, double weight, int ammo, int RPM, boolean automatic)  
    {
		super(DEFAULT_DAMAGE, DEFAULT_WEIGHT, DEFAULT_ACCURACY,  DEFAULT_RANGE, DEFAULT_LIGHT_WEIGHT_MOBILITY);
		
		gunAutomaticSetting = automatic;
		gunAmmo = ammo;
		gunCaliber = caliber;
		gunRecoil = DEFAULT_HAND_GUN_RECOIL;
		gunScope = false;
		gunRPM = RPM;
	}
	
	public Gun(int damage, double weight, int accuracy, int range, int mobility, boolean automatic, int ammo, int caliber, int recoil, boolean scope, int RPM)
	{   
		super(damage, weight, accuracy, range, mobility);
		
		gunAutomaticSetting = automatic;
		gunAmmo             = ammo;
		gunCaliber          = caliber;
		gunRecoil           = DEFAULT_HAND_GUN_RECOIL;
		gunScope            = false;
		gunRPM              = RPM;
			
	}
	
}
