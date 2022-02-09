package inheritance;

public class Cuboid extends SquarePrism {

	public double width;

	public Cuboid(double length, double width, double height) {
		this.length = length; // inherits length from grand parent class Square
		this.width = width;
		this.height = height; // inherits height from parent class SquarePrism
	}

}
