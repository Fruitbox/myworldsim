package MyWorldSim;

import java.awt.Dimension; // RYAN'S IDEA!!

public class Creature
{
    /*
     * Class Instance Variables
     * 
     */
	
		private int                            creatureHealth;
		private int    						   creatureLives;
		private int  						   creatureSpeed;
		private int							   creatureFangLength;
		private int 						   creatureLegnth; 
		private CreatureVision                 creatureVision;
		private CreatureDimension               creatureDimension;
		private int                            creatureWidth;
		private int                            creatureJumpingAbility;
		private int                            creatureClawLength;
		private int                            creatureArmor;
		private int                            creatureLegs;
		private int                            creatureHearing;
		private int                            creatureChompingPower;
		private int                            creatureStompingPower;
		
		
	/*
	 * Class Constants
	 * 
	 */
	
	private final int   DEFAULT_CREATURE_HEALTH         = 100;
	private final int   DEFAULT_NUMBER_OF_ARMS         = 4;
	private final int   DEFAULT_CREATURE_LIVES          = 10;     // In inches
	private final int   DEFAULT_CREATURE_JUMPING_ABILITY = 6;    // in feet
	private final int   DEFAULT_CREATURE_SPEED          = 40;   //  in feet
	private final int   DEFAULT_CREATURE_FANG_LENGTH    = 10;  //in feet
	private final CreatureVision   DEFAULT_CREATURE_VISION         = CreatureVision.HORSE_VISION;     // in feet best eyesight hawk 1 mile or 5280 feet.
	private final int   DEFAULT_CREATURE_CLAW_LENGTH    = 3;  //in feet
	private final int   DEFAULT_CREATURE_WIDTH          = 3;  //in inches
    private final int   DEFAULT_CREATURE_HEIGHT         = 5;          // in inches
	private final int   DEFAULT_CREATURE_LENGTH         = 4;       
	private final int   DEFAULT_CREATURE_ARMOR          = 20;
	private final int   DEFAULT_CREATURE_LEGS           = 4;
	private final int   DEFAULT_CREATURE_HEARING        = 100;        // in feet
    private final int   DEFAULT_CREATURE_CHOMPING_POWER = 50;
    private final int   DEFAULT_CREATURE_STOMPING_POWER = 30;
	
	
	
	
	
	
	public enum CreatureVision
	{
		BILND,   //0
		HUMAN_VISION, //1
		DOG_VISION,   //2
		HORSE_VISION, //3
		DRAGON_FLY_VISION, //4
		BIRD_VISION, //5
		SNAKE_VISION,//6
		CAMELEON_VISION,//7
		MANTIS_SHRIMP, // 10
		OGREFACEDSPIDER_VISION, // 8
		GECKO_VISION, //9
		GOAT_VISION, // 11
		HAWK_VISION, // 12
	}
	
	
	
	
	
	
	/*
	 * Constructor Methods
	 * 
	 */ 
	
	 public Creature()
	   {
		 	creatureHealth =  DEFAULT_CREATURE_HEALTH ;
			creatureLives  =  DEFAULT_CREATURE_LIVES  ;
			creatureJumpingAbility   =  DEFAULT_CREATURE_JUMPING_ABILITY    ;
			creatureSpeed =DEFAULT_CREATURE_SPEED  ;
			creatureFangLength  = DEFAULT_CREATURE_FANG_LENGTH   ;
			creatureVision =   DEFAULT_CREATURE_VISION         ; 
			creatureClawLength =   DEFAULT_CREATURE_CLAW_LENGTH    ;
			creatureArmor     =   DEFAULT_CREATURE_ARMOR ; 
			creatureDimension = new CreatureDimension(DEFAULT_CREATURE_LENGTH, DEFAULT_CREATURE_WIDTH, DEFAULT_CREATURE_HEIGHT);
			creatureLegs     = DEFAULT_CREATURE_LEGS  ;
			creatureHearing  = DEFAULT_CREATURE_HEARING  ;
			creatureChompingPower = DEFAULT_CREATURE_CHOMPING_POWER;
			creatureStompingPower = DEFAULT_CREATURE_STOMPING_POWER;
	   }
	 
	// used troll class
	 public Creature(int height)
	   {
		 	creatureHealth =  DEFAULT_CREATURE_HEALTH ;
			creatureLives  =  DEFAULT_CREATURE_LIVES  ;
			creatureJumpingAbility   =  DEFAULT_CREATURE_JUMPING_ABILITY    ;
			creatureSpeed =DEFAULT_CREATURE_SPEED  ;
			creatureFangLength  = DEFAULT_CREATURE_FANG_LENGTH   ;
			creatureVision =   DEFAULT_CREATURE_VISION         ; 
			creatureClawLength =   DEFAULT_CREATURE_CLAW_LENGTH    ;
			creatureArmor     =   DEFAULT_CREATURE_ARMOR ; 
			creatureDimension = new CreatureDimension(DEFAULT_CREATURE_LENGTH, DEFAULT_CREATURE_WIDTH, height);
			creatureLegs     = DEFAULT_CREATURE_LEGS  ;
			creatureHearing  = DEFAULT_CREATURE_HEARING  ;
			creatureChompingPower = DEFAULT_CREATURE_CHOMPING_POWER;
			creatureStompingPower = DEFAULT_CREATURE_STOMPING_POWER;
	   }
	 
	    //used by 
	   public Creature(int length, int height, int speed, int jump, int armor, CreatureVision vision, int legs)
	   {
		    creatureHealth =  DEFAULT_CREATURE_HEALTH ;
			creatureLives  =  DEFAULT_CREATURE_LIVES  ;
			creatureJumpingAbility   = jump    ;
			creatureSpeed = speed;
			creatureFangLength  = DEFAULT_CREATURE_FANG_LENGTH ;
			creatureVision =   vision         ; 
			creatureClawLength =    DEFAULT_CREATURE_CLAW_LENGTH    ;
			creatureArmor     =   armor ; 
			creatureDimension = new CreatureDimension(length, height, DEFAULT_CREATURE_HEIGHT);
			creatureLegs     = legs  ;
			creatureHearing  = DEFAULT_CREATURE_HEARING  ;
			creatureChompingPower = DEFAULT_CREATURE_CHOMPING_POWER;
			creatureStompingPower = DEFAULT_CREATURE_STOMPING_POWER;
	   }
             
	   //used by trex class
	   public Creature(int health, int lives, int speed, int fangLength, int clawLength, int armor, int length, int width, int height,  CreatureVision vision, int jumpingAbility, int legs, int hearing, int chomping, int stomping)
		{
			creatureHealth      = health;
			creatureLives       = lives;
			creatureSpeed       = speed;
			creatureFangLength  = fangLength; 
			creatureClawLength  = clawLength;
			creatureArmor       = armor;
			creatureDimension   = new CreatureDimension(length, width, height);
			creatureVision     = vision;
		    creatureJumpingAbility  = jumpingAbility;
		    creatureLegs          = legs;
		    creatureHearing       = hearing; 
			creatureChompingPower = chomping;
			creatureStompingPower = stomping;
		 
			
		}
	   
	   /*
	    * Getters and Setters
	    * 
	    */
	
	public int getHealth() {
		return creatureHealth;
	}
	public void setHealth(int health) {
		creatureHealth = health;
	}
	public int getLives() {
		return creatureLives;
	}
	public void setLives(int lives) {
		creatureLives = lives;
	}
	public int getSpeed() {
		return creatureSpeed;
	}
	public void setSpeed(int speed) {
		creatureSpeed = speed;
	}
	public int getFangLength() {
		return creatureFangLength;
	}
	public void setFangLength(int fanglength) {
		creatureFangLength = fanglength;
	}
	public int getLegnth() {
		return creatureLegnth;
	}
	public void setLegnth(int length) {
		creatureLegnth = length;
	}
	public CreatureVision getMonsterVision() {
		return creatureVision;
	}
	public void setVision(CreatureVision monsterVision) {
		creatureVision = monsterVision;
	}
	public CreatureDimension getMonsterDimension() {
		return creatureDimension;
	}
	public void setDimension(CreatureDimension monsterDimension) {
		creatureDimension = monsterDimension;
	}
	public int getWidth() {
		return creatureWidth;
	}
	public void setWidth(int monsterWidth) {
		creatureWidth = monsterWidth;
	}
	public int getJumpingAbility() {
		return creatureJumpingAbility;
	}
	public void setJumpingAbility(int jumpingability) {
		creatureJumpingAbility = jumpingability;
	}
	public int getClawLength() {
		return creatureClawLength;
	}
	public void setClawLength(int clawlength) {
		creatureClawLength = clawlength;
	}
	public int getArmor() {
		return creatureArmor;
	}
	public void setArmor(int armor) {
		creatureArmor = armor;
	}
	public int getLegs() {
		return creatureLegs;
	}
	public void setLegs(int legs) {
		creatureLegs = legs;
	}
	public int getHearing() {
		return creatureHearing;
	}
	public void setHearing(int hearing) {
		creatureHearing = hearing;
	}
	public int getMChompingPower() {
		return creatureChompingPower;
	}
	public void setChompingPower(int chompingpower) {
		creatureChompingPower = chompingpower;
	}
	public int getStompingPower() {
		return creatureStompingPower;
	}
	public void setStompingPower(int stompingpower) {
		creatureStompingPower = stompingpower;
	}
	
	/* Actions
	 * 
	 */
	
	public void find()
	{
		
	}
	
	public void eat()
	{
		
	}
	
	public void sleep()
	{
		
	}
	
	public void heal()
	{
		
	}
	
	public void jump()
	{
		
	}
	
	
	
	
	
	
	
}
