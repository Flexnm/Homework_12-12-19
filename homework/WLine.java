package homework;

public class WLine extends Line {

	// Attributes

	private int width;

	// CTORs
	public WLine(int length, int width) {
		super(length);
		setWidth(width);
	}

	public WLine(int length) { // If no width was set, default is 1.
		this(length, 1); 
	}

	public WLine() { // If no input was made then both length and width default to 0.

	}

	// Methods

	public int getWdith() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

}
