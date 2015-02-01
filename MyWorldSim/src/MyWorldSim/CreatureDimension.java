package MyWorldSim;

public class CreatureDimension 
{
    /*Class instance variables
     * 
     * 
     */
	private int creatureLength;
	private int creatureWidth;
	private int creatureHeight;
	
	/*Getters
	 * 
	 * 
	 */
	 
	public int getLegnth()
	{
		return creatureLength;
	}
	
	public int getWidth()
	{
		return creatureWidth;
	}
	
	public int getHeight()
	{
		return creatureHeight;
	}
	
	
	/*Constructor Method
	 * 
	 * 
	 */
	 public CreatureDimension(int length, int width , int height)
	 {
         creatureLength = length;
         creatureWidth  = width;
         creatureHeight = height;
	 }
  
	 }

