package inheritance;

public class MainClass {

	public static void main(String[] args) {

		// instantiating class Square with no arg constructor
		System.out.println("Instantiating Parent Class Square");
		Square unitSquare = new Square();
		System.out.println("Area of unit Square : " + unitSquare.calculateArea() + " sq.units");
		
		// instantiating class Square with parameterized constructor
		Square square = new Square(5.5);
		System.out.println("Length of new square is : " + square.length + " units");
		System.out.println("Perimeter of new square is : " + square.calculatePerimeter() + " units");
		System.out.println("Area of new square is : " + square.calculateArea() + " sq.units");

		// instantiating class Cube - no arg constructor
		System.out.println("\n\nInstantiating Derived Class Cube and calling methods of Square class");
		Cube unitCube = new Cube();
		System.out.println("Volume of unit cube is " + unitCube.calculateVolume() + " cc.");
		System.out.println("Area of unit square is " + unitCube.calculateArea() + " sq.units");
		
		// instantiating class Cube with parameterized constructor
		Cube cube  = new Cube(7.0);
		System.out.println("New length : " + cube.length);  //length field inherited from superclass Square 
		System.out.println("Volume of cube : " + cube.calculateVolume());
		System.out.println("Total surface area of cube : "+ cube.calculateSurfaceArea());
		//using the object cube (of child class), calling parent class methods
		System.out.println("Area of square : " + cube.calculateArea());
		System.out.println("Perimeter of square : " + cube.calculatePerimeter());
	}

}
