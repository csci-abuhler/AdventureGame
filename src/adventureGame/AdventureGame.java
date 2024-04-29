package adventureGame;

import java.util.Scanner;

public class AdventureGame {

	private Map map;
	private Player player;
	private static Scanner sc = new Scanner(System.in);
	
	public AdventureGame() {
		map = new Map(10, 10);
		player = new Player();
	} // constructor

	// Main method
	public static void main(String[] args) {
		AdventureGame ag = new AdventureGame();
		
		String user = new String();
		
		do {
	        System.out.println("What to do next?");
			user = sc.next();
			ag.selectChoice(user);
		} while (true);
	} // main 
	
	public void selectChoice(String choice) {
		switch (choice) {
		case "move":
			System.out.println("What direction?");
			String direction = sc.next();
			if (direction.equalsIgnoreCase("north")) {
				player.traverse();
			} // if
			break;
		case "exit":
			exit();
			break;
		default: 
			System.out.println("That was not a choice. Please try again.");
			System.out.println();
		} // switch
	} // select choice
	
	// Exits the game. 
	public void exit() {
		System.out.println("Goodbye!");
		System.exit(0);
	} // exit
} // class
