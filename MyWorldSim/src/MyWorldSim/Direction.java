package MyWorldSim;

public enum Direction 

{       
        NOWHERE((byte)(-1)),
		NORTH((byte)(0)),
		SOUTH(((byte)1)),
		EAST(((byte)2)),
		WEST(((byte)3)),
		NORTHEAST(((byte)4)),
		NORTHWEST(((byte)5)),
		SOUTHEAST(((byte)6)),
		SOUTHWEST(((byte)7)),
		UP((byte)(8)),
		DOWN((byte)(9));
		
		
		/*
		 * Class Instance VAriables
		 */
		
		private byte value;
		
		/*
		 *constants
		 * 
		 */
		
		
		/*
		 * constructor methid
		 */
		
		private Direction(byte direction)
		{
			value = direction;
		}
	
		/*
		 * tostring method
		 */
		
		@Override
		
		public String toString()
		{
			return this.name().toLowerCase();
		}
		
}