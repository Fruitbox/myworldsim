package myworldsim;

public class Weapon
{
	/*
	 * Class Instance Variables
	 * 
	 */
	private int		type;
	private int		damage;
	private double	weight;
	private int		accuracy;			// In feet
	private int		range;			// In feet
	private int 	mobility;
	
	/*
	 * Class Constants
	 * 
	 */
	public static final int DUMMY_WEAPON = 0;
	
	public static final int	DEFAULT_LIGHT_WEIGHT_MOBILITY	= 1;
	public static final int	DEFAULT_MEDIUM_WEIGHT_MOBILITY	= 2;
	public static final int	DEFAULT_HEAVY_WEIGTH_MOBILITY	= 3;
	
	public static final int DUMMY_WEAPON 	 = 0;
	public static final int MACHINE_GUN_TYPE = 1;
	public static final int RPG              = 2;
	public static final int ASSAULT_RIFFLE   = 3;
	public static final int MISSLE           = 4;

	
	/*
	 * Constructor MethodS
	 * 
	 */
	
	
	public Weapon() {
		
		
		this.type = DUMMY_WEAPON;
			damage   = 0;
			weight   = 0;
			accuracy = 0;
			range 	 = 0;
			mobility = 0;
	}
	
	public Weapon(int damage, double weight, int accuracy, int range, int mobility)
	{
		this.damage 	= damage;
		this.weight 	= weight;
		this.accuracy	= accuracy;
		this.range		= range;
		this.mobility	= mobility;
	}
	
	/*
	 * Actions
	 * 
	 */
	
	public void aim()
	{
		
	}
	
	public void harm()
	{
		
	}

	public int getType() {
		return type;
	}

	public int getDamage() {
		return damage;
	}

	public double getWeight() {
		return weight;
	}

	public int getAccuracy() {
		return accuracy;
	}

	public int getRange() {
		return range;
	}

	public int getMobility() {
		return mobility;
	}

	public static int getDefaultLightWeightMobility() {
		return DEFAULT_LIGHT_WEIGHT_MOBILITY;
	}

	public static int getDefaultMediumWeightMobility() {
		return DEFAULT_MEDIUM_WEIGHT_MOBILITY;
	}

	public static int getDefaultHeavyWeigthMobility() {
		return DEFAULT_HEAVY_WEIGTH_MOBILITY;
	}

	public static int getMachineGunType() {
		return MACHINE_GUN_TYPE;
	}

	public static int getRpg() {
		return RPG;
	}

	public static int getAssaultRiffle() {
		return ASSAULT_RIFFLE;
	}

	public static int getMissle() {
		return MISSLE;
	}
}
