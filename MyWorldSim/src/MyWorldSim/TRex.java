package MyWorldSim;



public class TRex extends Creature
{
   /*Class Instance Variables
    * 
    * 
    * 
    */
	
	private int trexArms;
	private int trexTailLength;
	private int trexWhippingPower;
	private int trexChompingPower;
	
	private int trexStompingPower;
	private int trexHeightStanding;
	private int trexArmor;
	
	
	
	
	
	private final int DEFAULT_TREX_ARMS = 2;
	private final int DEFAULT_TREX_TAIL_LENGTH = 10; // in feet
	private final int DEFAULT_TREX_CHOMPING_POWER = 70;
	private final int DEFAULT_TREX_WHIPPING_POWER = 70;
	private final int DEFAULT_TREX_STOMPING_POWER = 70;
	
	

	/*
	 * Overrides
	 * 
	 */
	private static final int DEFAULT_TREX_LENGTH = 40; //in feet
    private static final int DEFAULT_TREX_HEIGHT_STANDING = 40;
    private static final int DEFAULT_TREX_SPEED = 25;
    private static final int DEFAULT_TREX_JUMPING_ABILITY = 2;
	private static final int DEFAULT_TREX_ARMOR = 4;  
	private static final CreatureVision DEFAULT_TREX_VISION = CreatureVision.SNAKE_VISION; // Best eyesight HAWK 5280 feet 1 mile
	private static final int DEFAULT_TREX_LEGS = 2; //overrides DEFAULT_MONSTER_LEGS
 	
	
	/*
	 * Constructor Methods
	 */
	
	public TRex()
	{
		super(DEFAULT_TREX_LENGTH, DEFAULT_TREX_HEIGHT_STANDING, DEFAULT_TREX_SPEED, DEFAULT_TREX_JUMPING_ABILITY, DEFAULT_TREX_ARMOR, DEFAULT_TREX_VISION, DEFAULT_TREX_LEGS);
		trexArms = DEFAULT_TREX_ARMS;
		trexTailLength = DEFAULT_TREX_TAIL_LENGTH;
		trexWhippingPower = DEFAULT_TREX_WHIPPING_POWER;
	}
	
	public TRex(int health, int lives, int speed, int fangLength, int clawLength, int armor, int length, int width, int height,  CreatureVision vision, int jump, int legs, int hearing, int chomping, int stomping, int arms, int tailLength, int whipping  )
	{
		super(health, lives, speed, fangLength, clawLength, armor, length, width, height, vision, jump, legs, hearing, chomping, stomping );
		
		trexArms = arms;
		trexTailLength = tailLength;
		trexWhippingPower = whipping;
	}
             
	
	
	
	
	
	
	
	/*
	 * Getters and Setters
	 */
	
	public int getTrexArms() {
		return trexArms;
	}

	public void setTrexArms(int trexArms) {
		this.trexArms = trexArms;
	}

	public int getTrexTailLength() {
		return trexTailLength;
	}

	public void setTrexTailLength(int trexTailLength) {
		this.trexTailLength = trexTailLength;
	}
	
	public int getWhippingPower()
	{
	   return trexWhippingPower;	
	}
	
	public void setWhippingPower(int whipping)
	{
		
	}
	
	/*Actions
	 * 
	 */
	
	public void Walk()
	{
		
	}
	

	
	
	
	
	
	
	
	
	
	
	
}
