package homework;

public class Point {

	// Attributes
	private int x;
	private int y;

	// CTORs

	public Point(int x, int y) {
		setX(x);
		setY(y);
	}

	public Point(int x) {
		this(x, 0); // Sets the value of Y to 0 if no input was given for the value of Y.
	}
//	public Point(int y) { Cant create another constructor for "no X input but yes Y input". Need to ask why is it so.
//		this(0, y);
//	}

	public Point() {
		this(0); // Sets the value of X to 0 if no input was given for the value of X nor Y.

	}
	// Methods - getters and setters.

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}
