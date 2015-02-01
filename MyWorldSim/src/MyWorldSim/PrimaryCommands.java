package MyWorldSim;

public enum PrimaryCommands 

{
	MOVE(0),
	THROW)(1),
	SHOOT(2),
	GET(3);
	OPEN(4)
	CLOSE(5),
	SIT (6),
	STAND(7),
	HIT (8),
	BREAK (9),
	FLICK (10);
	
	
	
		private int value;
		
		
		
		
		private PrimaryCommands(int command)
		{
			value = command;
		}
	
	
	
        @Override
}
