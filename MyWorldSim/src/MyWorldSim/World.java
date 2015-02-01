

package MyWorldSim;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class World 
{
	/*Class Instance Variables
 * 	
 */

	private Location[][]	worldMap;
	/*
	 * private NukeTree[]	nukeTrees;
	 *
		private WolfTree[] 	wolfTrees;
		*/
	
	/*Class Constants
	 * 
	 */
	
	
	
	
	// int=4bytes 2 pov 32 1 byte = 8bit 4 byte= 32 bit short=2 byte=16 bit=65536
	private static final entryDirection WORLD_LOCATIONS	 = new entryDirection((short)(1000),(short)(1000)) ;//in locations one level or floor
	
	private static final entryDirection WORLD_LOCATION_DIMENSION = new entryDirection ((short) (1), (short)(1));//in inches
	private static final String WORLD_LOCATION_DESCRIPTION  = "TestWorld Location";
	private final 		 String WORLD_ARRAY_CREATION_FAILED_MESSAGE = "TestWorld::() TestWorld array creation out of memory exception";
	private final 		 String WORLD_LOCATION_CREATION_FAILED_MESSAGE = "TestWorld::() TestWorld location creation out of memory exception";
	private final 		 String WORLD_EXIT_CREATION_MESSAGE = "TestWorld::() TestWorld EXITS creation out of memory exception";


	/*private final Dimension WORLD_LOCATION_DIMENSION	= new Dimension(10,10);
	private final int	NUMBER_OF_NUKE_TREES			= 200;
	private final int 	NUMBER_OF_BRANCHES				= 20;
	private final int	NUMBER_OF_ROOTS					= 30;
	private final int	NUMBER_OF_SILOS					= 20;
	private final int	NUMBER_OF_MISSLES 				= 340;
	private final int	NUMBER_OF_WOLF_TREES			= 100; 
	private final int	NUMBER_OF_ROOMS					= 10;
	private final int	NUMBER_OF_WOLVES				= 30;
	*/
	/*
	 * Constructor Method
	 * 
	 */
	
	
	
	
	
	
	
	//
	public World()
	{
		//Create the world
		
		try{
			System.out.print("TestWorld::TestWorld(): Creating the world " + WORLD_LOCATIONS.getWidth()+"x"+WORLD_LOCATIONS.getLength()+ "array ...");
			DateFormat dateFormat= new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			Date date= new Date();
			System.out.println(dateFormat.format(date));
			worldMap = new Location[WORLD_LOCATIONS.getWidth()][WORLD_LOCATIONS.getLength()];
		}
		catch(OutOfMemoryError e){
			System.out.println("TestWorld creation out-of-memory exception ...");
			
			//System.exit(0);
			return;
		}
		
		try 
		{
			System.out.print("TestWorld::TestWorld(): Creating the world Locations ");
				for (short row =0; row < worldMap.length; row++)
				{
					for (int col =0; col < worldMap[row].length; col++)
					{
				
						worldMap[row] [col] = new Location( new WorldLocation(row, col), WORLD_LOCATION_DIMENSION, WORLD_LOCATION_DESCRIPTION + row + ","+ col + ",", LocationTypes.WORLD);
				
					}

				}
		}
		
			catch (OutOfMemoryError e) 
		{
			System.out.println("TestWorld::TestWorld(): TestWorld Location creation out-of-memory exception ...");
			
			//System.exit(0);
			return;
		}												
		

		try
		{
			
		for (int row =0; row < worldMap.length; row++)
		{
			for (int col =0; col < worldMap[row].length; col++)
			{
				
				//North
				try
				{
					worldMap[row][col].setExit(new Exit(Direction.NORTH, worldMap[row-1][col]), Direction.NORTH);
				}		
				
				catch (Exception e)
				{
					worldMap[row][col].setExit(new Exit(Direction.NORTH, worldMap[worldMap.length-1][col]), Direction.NORTH);

				}	
				//Ne
				try
				{	
				worldMap[row][col].setExit(new Exit(Direction.NORTHEAST, worldMap[row-1][col+1]), Direction.NORTHEAST);
				}
				
				catch (Exception e)
				{
				worldMap[row][col].setExit(new Exit(Direction.NORTHEAST, worldMap[worldMap.length-1][col+1]), Direction.NORTHEAST);
					
				
					if (row- 1 < 0 && col + 1> worldMap[row].length - 1)
					{
						worldMap[row][col].setExit(new Exit(Direction.NORTHEAST, worldMap[worldMap.length-1] [0]), Direction.NORTHEAST);
					}
					
					else if (row-1<0) 
					{
						worldMap[row][col].setExit(new Exit(Direction.NORTHEAST, worldMap [worldMap.length-1][0]), Direction.NORTHEAST);
					}
					
					else 
					{
						worldMap[row][col].setExit(new Exit(Direction.NORTHEAST, worldMap[row-1][col-1]), Direction.NORTHEAST);
					}
				}	
				
				try
				{	
				worldMap[row][col].setExit(new Exit(Direction.NORTHWEST, worldMap[row-1][col-1]), Direction.NORTHWEST);
				}
				
				catch (Exception e)
				{
					if (row- 1 < 0 && col - 1<0)
					{
						worldMap[row][col].setExit(new Exit(Direction.NORTHEAST, worldMap[worldMap.length-1] [worldMap[row].length-1]), Direction.NORTHWEST);
					}
					
					else if (row-1<0) 
					{
						worldMap[row][col].setExit(new Exit(Direction.NORTHEAST, worldMap [worldMap.length-1][col-1]), Direction.NORTHWEST);
					}
					
					else 
					{
						worldMap[row][col].setExit(new Exit(Direction.NORTHEAST, worldMap[row-1][worldMap[row].length-1]), Direction.NORTHWEST);
					}
				}	
				//South
				try
				{
				worldMap[row][col].setExit(new Exit(Direction.SOUTH, worldMap[row+1][col]), Direction.SOUTH);
				} 
				
				catch (Exception e)
				{
					worldMap[row][col].setExit(new Exit(Direction.SOUTH, worldMap[0][col]), Direction.SOUTH);
	
				}	
				//se 
				try
				{
				worldMap [row][col].setExit(new Exit(Direction.SOUTHEAST, worldMap[row+1][col+1]), Direction.SOUTHEAST);
				}
				
				catch (Exception e)
				{
				worldMap [row][col].setExit(new Exit(Direction.SOUTHEAST, worldMap[0][col+1]), Direction.SOUTHEAST);
					
					if (row+ 1 > worldMap.length - 1 && col - 1>worldMap[row].length-1)
					{
						worldMap[row][col].setExit(new Exit(Direction.SOUTHEAST, worldMap[0][0]), Direction.SOUTHEAST);
					}
					
					else if (row-1<0) 
					{
						worldMap[row][col].setExit(new Exit(Direction.SOUTHEAST, worldMap [0][col+1]), Direction.SOUTHEAST);
					}
					
					else 
					{
						worldMap[row][col].setExit(new Exit(Direction.SOUTHEAST, worldMap[row+1][col-1]), Direction.SOUTHEAST);
					}
				}	
				
				//sw
				try
				{
				worldMap [row][col].setExit(new Exit(Direction.SOUTHWEST, worldMap[row+1][col-1]), Direction.SOUTHWEST);
				}			
				
				catch (Exception e)
				{
				worldMap [row][col].setExit(new Exit(Direction.SOUTHWEST, worldMap[0][col-1]), Direction.SOUTHWEST);
				
					if (row+ 1 > worldMap.length - 1 && col - 1<0)
					{
						worldMap[row][col].setExit(new Exit(Direction.SOUTHWEST, worldMap[0][worldMap [row].length-1]), Direction.SOUTHWEST);
					}
																							
					else if (row-1<0) 
					{
						worldMap[row][col].setExit(new Exit(Direction.SOUTHWEST, worldMap [0][col-1]), Direction.SOUTHWEST);
					}
					
					else 
					{
						worldMap[row][col].setExit(new Exit(Direction.SOUTHWEST, worldMap[row+1][worldMap[row].length-1]), Direction.SOUTHWEST);
					}
				}	
				//East
				try
				{
				worldMap[row][col].setExit(new Exit(Direction.EAST, worldMap[row][col+1]), Direction.EAST);
				}
				
				catch (Exception e)
				{
				worldMap[row][col].setExit(new Exit(Direction.EAST, worldMap[row][0]), Direction.EAST);
				}
				//West
				try
				{	
				worldMap[row][col].setExit(new Exit(Direction.WEST, worldMap[row][col-1]), Direction.WEST);
				}		
						
				catch (Exception e)
				{
				worldMap[row][col].setExit(new Exit(Direction.WEST, worldMap[row][worldMap[row].length-1]), Direction.WEST);

				}	
			
				worldMap[row][col].setExit(new Exit(Direction.UP, new Location()), Direction.UP);
				
				worldMap[row][col].setExit(new Exit(Direction.DOWN, new Location()), Direction.DOWN);

			}
		
		
		}
			System.out.println("WORLD::WORLD():WORLD CREATED. ");
			DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			Date date=new Date();
			System.out.println(dateFormat.format(date));
			
			

						
		
		
		}
		catch (OutOfMemoryError e)
		{
			System.out.println("WORLD_EXIT_CREATION_FAILED_MESSAGE");
			
			return;
		}
		
	}
		
				
			
		
				
		
	


	private int randomizer(int max)
	{
		int number =0;
		
		Random randomNumber = new Random();
		
		number = randomNumber.nextInt(max) + 1; 
		
		return number; 

	}


}		
	
