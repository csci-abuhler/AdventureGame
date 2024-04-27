package adventureGame;

public class Player {
	private String name = "";
	private String gender = "";
	private int sightDistance = 30;

	public Player() {
		name = "Pat";
		gender = "X";
	} // constructor

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

} // class
