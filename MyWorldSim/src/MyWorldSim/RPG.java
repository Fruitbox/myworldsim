package MyWorldSim;

public class RPG extends Weapon
{
   /*
    * Class Instance Variables
    * 
    */
	
	

	private int RPGBlastRadius;
	
	
	
	
	
	/*
	 * Class Constants
	 * 
	 */
       
	  private static final int DEFAULT_RPG_DAMAGE = 70;
	  private final int DEFAULT_RPG_BLAST_RADIOUS = 200; //square feet (10x20)
	  private static final int DEFAULT_RPG_RANGE = 3000; //in ft
	  private static final int DEFAULT_RPG_ACCURACY = 654; // in ft
	  private static final int DEFAULT_RPG_MOBILITY = Weapon.DEFAULT_MEDIUM_WEIGHT_MOBILITY;
	  private static final int DEFAULT_RPG_WEIGHT = 15;
	  
	  
	  
	  /*
	   * Constructor Methods
	   * 
	   */
	  
	  public RPG() 
	  {
		
		  
		  super(DEFAULT_RPG_DAMAGE, DEFAULT_RPG_WEIGHT, DEFAULT_RPG_ACCURACY, DEFAULT_RPG_RANGE, DEFAULT_RPG_MOBILITY);
		  
		  RPGBlastRadius = DEFAULT_RPG_BLAST_RADIOUS;
		 
	  }
	  
	  public RPG(int damage, double weight, int accuracy, int range, int mobility, int blastRadious)
	  {
		  super(damage, weight, accuracy, range, mobility);
		  
		  RPGBlastRadius = blastRadious;
	  }
   
}
