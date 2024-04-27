package adventureGame;

public class AdventureGame {

	private static final int [][] map = new int[10][10];
	
	public AdventureGame() {
		
	} // constructor

	// Main method
	public static void main(String[] args) {
		AdventureGame ag = new AdventureGame();
		ag.checkSpacesAround(map, 0, 0);
	} // main

	// Below checks if the spaces around are within bounds of the map. 
	public void checkSpacesAround(int [][] area, int x, int y) {
		if ((x >= 0) && (x < area.length)) {
			if ((y >= 0) && (y < area[x].length)) {
				System.out.println("PASSED" + " " + x + " " + y);
			} else {
				System.out.println("OUT OF BOUNDS " + "y: " + y);
			} // if else
		} else {
			System.out.println("OUT OF BOUNDS " + "x: " + x);
		} // if else
	} // check space 
} // class
