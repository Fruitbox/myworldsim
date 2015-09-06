package myworldsim;

public class Gun extends Weapon
{
	/*
	 * Class Instance Variables
	 * 
	 */
	
	private boolean				automaticSetting;
	private	int					ammocapacity;							// Number of rounds in magazine
	private	int					ammoLeft;
	private double				caliber;
	private int					recoil;
	private boolean				scope;
	private int					rpm;								// Only in automatic setting
	
	/*
	 * Class Constants
	 * 
	 */
	
	// Default for a hand gun
	
	private final int			DEFAULT_GUN_AMMO 			= 12;
	private	final double		DEFAULT_GUN_CALIBER 		= 45;
	
	private final int			DEFAULT_HAND_GUN_RECOIL		= 1;
	private final int			DEFAULT_RIFLE_RECOIL		= 2;
	private final int			DEFAULT_SHUTGUN_RECOIL		= 3;
	private final int			DEFAULT_MACHINE_GUN_RECOIL	= 4;
	private final int			DEFAULT_CANNON_RECOIL		= 5;
	
	public static final int		DEFAULT_DAMAGE				= 25;	// Percent of health
	public static final double	DEFAULT_WEIGHT				= 1;	// In pounds
	public static final int		DEFAULT_ACCURACY			= 50;	// In yards;
	public static final int		DEFAULT_RANGE				= 100;	// In yards;
	public static final int		DEFAULT_RPM					= 60;	// One round at a time, approx. 1 round per second	
	
	/*
	 * Constructor Methods
	 * 
	 */
	
	
	
	public Gun(int damage, double weight, int accuracy, int range, int mobility, boolean automatic, int ammo, int caliber, int recoil, boolean scope, int RPM)
	{
		super(damage, weight, accuracy, range, mobility);
		
		automaticSetting = automatic;
		this.ammo				= ammo;
		this.caliber			= caliber;
		this.recoil			= recoil;
		this.scope			= scope;
		this.rpm				= RPM;
	}

	public boolean isAutomaticSetting() {
		return automaticSetting;
	}

	public int getAmmo() {
		return ammo;
	}

	public double getCaliber() {
		return caliber;
	}

	public int getRecoil() {
		return recoil;
	}

	public boolean hasScope() {
		return scope;
	}

	public int getRpm() {
		return rpm;
	}

	public int getDEFAULT_GUN_AMMO() {
		return DEFAULT_GUN_AMMO;
	}

	public double getDEFAULT_GUN_CALIBER() {
		return DEFAULT_GUN_CALIBER;
	}

	public int getDEFAULT_HAND_GUN_RECOIL() {
		return DEFAULT_HAND_GUN_RECOIL;
	}

	public int getDEFAULT_RIFLE_RECOIL() {
		return DEFAULT_RIFLE_RECOIL;
	}

	public int getDEFAULT_SHUTGUN_RECOIL() {
		return DEFAULT_SHUTGUN_RECOIL;
	}

	public int getDEFAULT_MACHINE_GUN_RECOIL() {
		return DEFAULT_MACHINE_GUN_RECOIL;
	}

	public int getDEFAULT_CANNON_RECOIL() {
		return DEFAULT_CANNON_RECOIL;
	}

	public static int getDefaultDamage() {
		return DEFAULT_DAMAGE;
	}

	public static double getDefaultWeight() {
		return DEFAULT_WEIGHT;
	}

	public static int getDefaultAccuracy() {
		return DEFAULT_ACCURACY;
	}

	public static int getDefaultRange() {
		return DEFAULT_RANGE;
	}

	public static int getDefaultRpm() {
		return DEFAULT_RPM;
	}

	public void loadAmmo(){
		ammoLeft = ammoCapacity;
	}
	public boolean shoot(int rounds) {
		boolean shot = false;
		for (int round = 1; round <= rounds; round ++) {
			if (ammoLeft - 1 > 0) {
				ammoLeft--;
				shot = true;
				
			}
		}	
	}
	
	return shot;





}
