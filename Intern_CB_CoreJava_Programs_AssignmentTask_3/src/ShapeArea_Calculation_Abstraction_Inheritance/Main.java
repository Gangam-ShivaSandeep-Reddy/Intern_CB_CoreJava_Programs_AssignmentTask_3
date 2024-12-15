package ShapeArea_Calculation_Abstraction_Inheritance;

public class Main {
	public static void main(String[] args) {
	
		Shape rectangle = new Rectangle(4, 5);
		Shape circle = new Circle(5);

	
		System.out.println("Area of Rectangle: " + rectangle.area());
		System.out.println("Area of Circle: " + circle.area());
	}
}
