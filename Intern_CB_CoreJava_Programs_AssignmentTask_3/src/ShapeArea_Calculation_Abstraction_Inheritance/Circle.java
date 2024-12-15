package ShapeArea_Calculation_Abstraction_Inheritance;

public class Circle extends Shape {
	private double radius;

	// Constructor
	public Circle(double radius) {
		this.radius = radius;
	}

	// Implement the abstract method
	@Override
	public double area() {
		return Math.PI * radius * radius;
	}
}
