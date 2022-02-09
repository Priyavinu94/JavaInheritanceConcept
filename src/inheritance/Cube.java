// Cube extends Square
package inheritance;

public class Cube extends Square {

	//public double volume;
	//public double surfaceArea;

	public Cube() {	//no arg constructor declared to create a cube object of unit length 
		super();
		length = 1.0;	//length field inherited from superclass Square
	}

	public Cube(double length) {
		super();
		this.length = length;
	}

	public double calculateVolume() {
		return calculateArea() * length; //method and field inherited from class Square
	}

	public double calculateSurfaceArea() {
		return 6 * calculateArea();	//method inherited in super class Square
	}

}
