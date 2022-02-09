package inheritance;

public class Square {

	public double length;
		
	public Square() {
		length = 1.0; // assuming no arg constructor creates object - Square of unit length
	}

	public Square(double length) {
		this.length = length;
	}

	public double calculateArea() {
		return length * length;
	}

	public double calculatePerimeter() {
		return 4 * length;
	}
}
