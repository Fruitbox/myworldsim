package MyWorldSim;

public class MachineGun extends Gun
{
	
  /*
   * Class Instance Variables
   */

   private int machinegunMount;
   
   /*
    * Class Constants 
    * 
    */

    //Defaults for a hand gun



                                    
    private final int  BIPOD_MOUNT   = 1;
    private final int  TRIPOD_MOUNT = 2;
    private final int  BOLTED_MOUNT  =3;
    private final int SURFACE_MOUNT  = 4;

    private final int DEFAULT_MACHINEGUN_MOUNT   = BIPOD_MOUNT; 
    private final double DEFAULT_MACHINEGUN_CALIBER = 30.0;
    private final int DEFAULT_MACHINEGUN_WEIGHT = 30;
    private final int DEFAULT_MACHINEGUN_AMMO = 250;
    private final int DEFAULT_MACINEGUN_RPM = 500;
   
    
    /*
     * Constructor Method 
     *
     */
    
    public MachineGun()
    {
    	super();
    	
    }
    
    	
    	


}
