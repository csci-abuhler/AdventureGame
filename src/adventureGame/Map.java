package adventureGame;

public class Map {
	private final int[][] map;
	private int width;
	private int height;

	public Map(int width, int height) {
		map = new int[width][height];
	} // constructor

	// Width and height getters
	public int getWidth() {
		return width;
	} // get width

	public int getHeight() {
		return height;
	} // get width

	// Width and height setters
	public void setWidth(int width) {
		if (width < 0) {
			System.out.println("Width cannot be less than zero.");
		} else {
			this.width = width;
		} // if else
	} // set width

	public void setHeight(int height) {
		if (height < 0) {
			System.out.println("Height cannot be less than zero.");
		} else {
			this.height = height;
		} // if else
	} // set width

	// Below checks if the spaces around are within bounds of the map.
	public void checkSpacesAround(int x, int y) {
		if ((x >= 0) && (x < map.length)) {
			if ((y >= 0) && (y < map[x].length)) {
				System.out.println("PASSED" + " " + x + " " + y);
			} else {
				System.out.println("OUT OF BOUNDS " + "y: " + y);
			} // if else
		} else {
			System.out.println("OUT OF BOUNDS " + "x: " + x);
		} // if else
	} // check spaces around

} // class