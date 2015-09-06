package myworldsim;

public class MachineGun extends Gun
{
	/*
	 * Class Instance Variables
	 * 
	 */
	
	private int model;	
	/*
	 * Class Constants
	 * 
	 */
	
	public static final int MK48    = 1;
	
	// Defaults for a hand gun
	
	private final int		BIPOD_MOUNT						= 1;
	private final int		TRIPOD_MOUNT					= 2;
	private final int		BOLTED_MOUNT					= 3;
	private final int		SURFACE_MOUNT					= 4;
	
	private final int		DEFAULT_MACHINE_GUN_MOUNT		= BIPOD_MOUNT;
	private final double	DEFAULT_MACHINE_GUN_CALIBER		= 30;
	private final int		DEFAULT_MACHINE_GUN_WEIGHT		= 30;
	private final int		DEFAULT_MACHINE_GUN_AMMO		= 250;
	private final int		DEFAULT_MACHINE_GUN_RPM			= 600;
	
	
	
	public static final int AUTOMATIC = 1;
	
	//MK48 7.62mm or 30.
	public static final double[] MK48_MACHINE_GUN  = {AUTOMATIC, 250, 250, 7.62, 710, NO_SCOPE };
	
	
	//m2 machinegun 12.7mm or 50 caliber
	public static final double[] M2_MACHINE_GUN  = {AUTOMATIC, 100, 100, 12.7, 485, NO_SCOPE};
	/*
	 * Constructor Method
	 * 
	 */
	
	public MachineGun(int type, int mount)
	{
		super();
		
		
	}
}
