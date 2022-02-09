package inheritance;

public class SquarePrism extends Square {

	public double height; // Subclass SquarePrism has its own variable

	public SquarePrism() {
		this.length = 1.0;
		this.height = 2.0;
	}

	public SquarePrism(double length, double height) {
		this.length = length;
		this.height = height;
	}

	public double calculateVolume() {
		return calculateArea() * height;
	}

	public double CalcLateralSurfaceArea() {
		return 4 * (length + height);
	}
}
