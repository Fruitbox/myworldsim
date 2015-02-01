
package MyWorldSim;

import java.util.Random;

public class DoorKey 
{
	private long keyCode;
	
	//CV
	public static final int NO_KEY=0;
	public static final int BLANK_KEY = 0;
	//G & S
	public long getkeyCode()
	{
		return keyCode;
	}
	public void setkeyCode()
	{
		keyCode	= keyCodeRandomizer();

	}
	
	public void newKeyCode()
	{
		keyCode=keyCodeRandomizer();
	}
	public DoorKey copyKey()
	{
		DoorKey key = new DoorKey(this);
		return key;
	}
	//Copy Constructor
	public DoorKey(DoorKey key)
	{
		keyCode = key.getkeyCode();	
	}
	//Constructors
	public DoorKey(int code)
	{//pass a code of 0 to make a blank key hardware or key
		keyCode=code;
		
	}
	public DoorKey()
	{
		keyCode	= keyCodeRandomizer();
	}
	
	private long keyCodeRandomizer()
	{
		long code = 0;
		
		Random random = new Random();
		code = random.nextInt();
		
		return code;
	}
}

