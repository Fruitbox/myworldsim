package MyWorldSim;

public class Spell 
{
	/*
	 *  Class Instant Variables
	 */
	    private int    spellType; //spell type
	    private String spellName; 
	    private String spell;   // words for witch to recite
	    
	    
	    /*
	     * Class Constants
	     */
	    
	    public static int HEALING = 1; 
	    public static int CURSE  = 2;
	    public static int TRANSFIGURATION = 3;
	    public static int CHARM = 4; //changes what an object can do
	    public static int PROTECTIVE = 5; //protects an area
	    public static int JINX      = 6; //meant for amusment 
	    public static int HEX = 7;  // less than dark magic but more than a jinx moderate harm
	    
	    public static String[] CHARM_SPELLS =
	    	{
		    	"Amplifying Charm",
		    	"Anti-Unlocking Charm",
		    	"Banishing Charm",
		    	"Disarming Charm",
		    	"Fixing Charm",
		    	"Shrinking Charm",
		    	"Talong-Clipping Charm",
		    	"Unlocking Charm",
		    	"Stream of Flames Charm",
		    	"Lighting Charm",
		    	"Invisibility Charm",
		    	
		    };
	    
   public static String[] HEALIING_SPELLS =
	   {
          "Ferula Spell",//heals broken bones/fractures
	   	  "Episkey Spell", // heals mild wound
	       "Vulnera Spell", // heals deep gashes, wound
	   };
     public static String [] CURSES_SPELLS =
    	 {
    		 "Killing Curse",
    		 "Jelly Legs Curse", 
    		 "Imperius Curse",
    		 "Blasting Curse",
    		 "Disenigration Curse",
    		 "Floating Eye Curse"
          };
       public static String[] TRANSFIGURATION_SPELLS =
    	   {
    		 "Vanishment Spell",
    		 "Conjuration Spell",
    		 "Wolf into Rat Spell",
    		 "T-Rex into Lizard",
    		 "Human into Chimp",
    		 "Gun into Flower"
    		 
    		 
          }; 
      public static String[] PROTECTIVE_SPELLS = 
    	  {
    	   "Invisiblelity Spell",
    	   "Force Field Spell",
    	   "Total Proteciton Spell" // protects an area
    	  
    	  };
      public static String[] JINX_SPELLS =
    	  {
    	    "Back Firing Jinx Jinx",
    	    "Cantis Jinx", // makes target sing
    	    "Dancing Feet Jinx", // makes feet dance
    	    "Ebublio Jinx", // makes victim in large bubble
    	    "Finger Removing Jinx", // removes victims fingers
    	    "Knock Back Jinx",
    	    "Levicorpus Jinx",
    	    "Vermiculuc Jinx",
    	  };
      
      

	public static String[] HEX_SPELLS =
    	  {
    		  "Redactum Skullus Spell", //shrinks heads
    		  "Stick Fast Hex" //Makes victim stck to ground
    	  };
    	    /*
    	     * Constructor Method
    	     */
    	  
    		  public Spell(int type, String name)
    		  {
    			  spellType = type;
    			  spellName = name;
    		  }
    		  /*
    		   * Getters and Setters
    		   */
    	  
    		  public int getSpellType() {
    				return spellType;
    			}

    			public void setSpellType(int type) {
    				spellType = type;
    			}

    			public String getSpellName() {
    				return spellName;
    			}

    			public void setSpellName(String name) {
    				spellName = spellName;
    			}

    			public String getSpell() {
    				return spell;
    			}

    			public void setSpell(String spell) {
    				this.spell = spell;
    			}
    	  
    	  
    	  
   
	    
}