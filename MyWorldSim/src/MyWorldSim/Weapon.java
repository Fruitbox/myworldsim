package MyWorldSim; 

public class Weapon 
{
   /*
    * Class Instance Variables
    * 
    */
	
	private int weaponDamage;
	private double weaponWeight;
	private int weaponAccuracy; // in ft
	private int weaponRange; // in ft
	private int weaponMobility; 
	
	/*
	 * Class Constants
	 * 
	 */
	
	public static final int DEFAULT_LIGHT_WEIGHT_MOBILITY = 1;
	public static final int DEFAULT_MEDIUM_WEIGHT_MOBILITY = 2;
	public static final int DEFAULT_HEAVY_WEIGHT_MOBILITY = 3;
	
	
	
	/*
	 * Constructor Method
	 * 
	 */
	
	public Weapon()
	{
		
	}
	
	
	
	
	public Weapon(int damage, double weight, int accuracy, int range, int mobility) 
	{
		weaponDamage = damage;
		weaponWeight = weight;
		weaponAccuracy = accuracy;
		weaponRange = range;
		weaponMobility = mobility;
		
		
		
	}
	
	
	
	
	
	
}
