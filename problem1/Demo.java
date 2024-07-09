package problem1;

public class Demo {
	public static void main(String[] args) {
		Shape[] shapes = new Shape[4];
		shapes[0] = new Circle("Circle", 5);
		shapes[1] = new Ellipse("Ellipse", 7, 5);
		shapes[2] = new Triangle("Triangle", 3, 4, 5);
		shapes[3] = new EquilateralTriangle("Equilateral Triangle", 6);
		
		for (Shape shape : shapes) {
			System.out.println();
			System.out.println(shape.toString());
		}
	}
}
