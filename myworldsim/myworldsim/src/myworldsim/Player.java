package myworldsim;

public class Player				{
	
	
	
	
	/*
	 * Class Instance Variables
	 * 
	 */
	
	private String name;
	private String userName;
	private String password;
	private Creature avatar;     //oop compositoin: Player HAS a creature object
	
	/*
	 * class constructors
	 * 
	 */
	
	/*
	 * constructors
	 * 
	 */


	public Player(String name, String username, String password, Creature avatar) {
		this.name 		= name;
		this.userName 	= userName;
		this.password 	= password;
		this.avatar 	= avatar;
		
		
	}
	
	/*
	 * getters and setters
	 * 
	 */

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Creature getAvatar() {
		return avatar;
	}

	public void setAvatar(Creature avatar) {
		this.avatar = avatar;
	}

}
