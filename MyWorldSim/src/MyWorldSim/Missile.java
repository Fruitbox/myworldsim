package MyWorldSim;

 public class Missile extends Weapon
{
	
	/*
	 * Class Constants
	 */
	
	
   private int missileRange;
   private int missileBlastRadius;
    
   /*
    * Class Constants
    * 
    */
   

   private  static final int DEFAULT_MISSILE_RANGE = 5280;
   private final int DEFAULT_MISSILE_BLAST_RADIUS = 400;
   private static final int DEFAULT_MISSILE_DAMAGE = 100;
   private static final int DEFAULT_MISSILE_ACCURACY = 1150;
   private static final int DEFAULT_MISSILE_MOBILITY = Weapon.DEFAULT_HEAVY_WEIGHT_MOBILITY;
   private static final int DEFAULT_MISSILE_WEIGHT = 2900;
   
   /*
    * Constructor Methods
    * 
    */
   
   public Missile()
   {
	   super(DEFAULT_MISSILE_DAMAGE, DEFAULT_MISSILE_WEIGHT, DEFAULT_MISSILE_ACCURACY, DEFAULT_MISSILE_RANGE, DEFAULT_MISSILE_MOBILITY);
	   missileBlastRadius = DEFAULT_MISSILE_BLAST_RADIUS;
   }
    public Missile(int damage, double weight, int accuracy, int range, int mobility, int blastRadius)
   {
	   super(damage, weight, accuracy, range, mobility);
	   
	   missileBlastRadius = blastRadius;
	   
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
    
    public void arm()
    {
    	
    }
    
    public void explode()
    {
    	
    }
    
    
    public void launch()
    {
    	
    }
    
    public void fly()
    {
    	
    }
    
    public void detonate()
    {
    	
    }
   
   
}
