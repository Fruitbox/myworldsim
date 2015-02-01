package MyWorldSim;

public class AssaultRifle extends Gun
{
	
  /*
   * Class Instance Variables
   */

  
   /*
    * Class Constants 
    * 
    */

    //Defaults for a hand gun



                                    
  
    private static final boolean DEFAULT_ASSAULT_RIFLE_AUTOMATIC_SETTING = true;
    private static final double DEFAULT_ASSAULT_RIFLE_CALIBER = 5.56;     //5.56x45mm NATO
    private static final double DEFAULT_ASSAULT_RIFLE_WEIGHT = 8.79; // for M16 Loaded
    private static final int  DEFAULT_ASSAULT_RIFLE_AMMO = 40; // for M16
    private static final int DEFAULT_ASSAULT_RIFLE_RPM = 800;  // M16
    private static final int  DEFAULT_DAMAGE       = 50;
    private static final int DEFAULT_ASSAULT_RIFLE_ACCURACY = 210; 
    private static final int DEFAULT_ASSAULT_RIFLE_RANGE   = 100;
    
   
    
    /*
     * Constructor Method 
     *
     */
    
    public AssaultRifle(  )
    {
    	super(DEFAULT_ASSAULT_RIFLE_CALIBER, DEFAULT_ASSAULT_RIFLE_WEIGHT, DEFAULT_ASSAULT_RIFLE_AMMO, DEFAULT_ASSAULT_RIFLE_RPM, DEFAULT_ASSAULT_RIFLE_AUTOMATIC_SETTING);
    	
    }
    
    	
    	


}
