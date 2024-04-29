package adventureGame;

public class Player {
	private String name = "";
	private String gender = "";
	// private int sightDistance = 30;
	
	private int xLocation = 0;
	private int yLocation = 0; 

	public Player() {
		name = "Pat";
		gender = "X";
	} // constructor

	// Below allows the player to move around in the environment.
	public void traverse() {
		System.out.println("You moved!");
	} // setLocation
	
	// Name getter and setter
	public String getName() {
		return name;
	} // get name

	public void setName(String s) {
		this.name = s;
	} // get name

	// Gender getter and setter
	public String getGender() {
		return gender;
	} // get name

	public void setGender(String g) {
		this.gender = g;
	} // get name

	// xLocation getter and setter
	public int getX() {
		return xLocation;
	} // get X
	
	public void setX(int x) {
		xLocation = x;
	} // set X
	
	// yLocation getter and setter
	public int getY() {
		return yLocation;
	} // get Y
	
	public void setY(int y) {
		yLocation = y;
	} // set Y
	
} // class
