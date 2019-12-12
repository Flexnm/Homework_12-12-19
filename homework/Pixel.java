package homework;

public class Pixel extends Point {

	// Attributes
	private String color;

	// CTORs

	public Pixel(int x, int y, String color) {
		super(x, y); // Calls the getters and setters of the Point class.
		setColor(color);
	}

	public Pixel(int x, int y) { // If no color input then default color is set to "None".
		this(x, y, "None");
	}

	public Pixel(int x) { // Sets the Y value to default 0 in addition to the color default.
		this(x, 0);
	}

	public Pixel() { // Sets all values to defaults if no input was made.
		this(0);
	}

	// Methods - getters and setters for the color.

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
