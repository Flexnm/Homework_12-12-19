package homework;

public class Test { // Tests for all the classes. On each thing with () it can be pressed F3 to see where it goes.
	public static void main(String[] args) {
		Line line = new Line(3); // Line(length), default: 0.
		WLine wline = new WLine(6, 2); // WLine(width, length), default: 0, 0.
		Point point = new Point(5, 5); // Point(X value, Y value), default: 0, 0.
		Pixel pixel = new Pixel(3, 4, "Red"); // Pixel(X value, Y value , color string), default: 0, 0, None.
		
		
		System.out.println("Line: Length: " + line.getLength() + "."); // expected output: Length: length value.
		System.out.println("====================");
		System.out.println("WLine: Length: " + wline.getLength() + ", Width: " + wline.getWdith() + "."); // expected output: Length: length value, Width: width value.
		System.out.println("====================");
		System.out.println("Point: X: " + point.getX() + ", Y: " + point.getY() + "."); // expected output: X: X value, Y: Y value.
		System.out.println("====================");
		System.out.println("Pixel: X: " + pixel.getX() + ", Y: " + pixel.getY() + ", Color: " + pixel.getColor() + "."); // expected output: X: X value, Y: Y value, Color: color string.
		

	
		
		
	}

}
