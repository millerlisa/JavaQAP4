package problem2;

public class Demo {
	public static void main(String[] args) {
		System.out.println();
		Shape[] shapes = new Shape[4];
		shapes[0] = new Circle("Circle", 5);
		shapes[1] = new Ellipse("Ellipse", 7, 5);
		shapes[2] = new Triangle("Triangle", 3, 4, 5);
		shapes[3] = new EquilateralTriangle("Equilateral Triangle", 6);
		
		System.out.println("Shapes before scaling: ");
		for (Shape shape : shapes) {
			System.out.println(shape.toString());
		}

		scaleShapes(shapes, 2);

		System.out.println("\nShapes after scaling: ");
		for (Shape shape : shapes) {
			System.out.println(shape.toString());
		}

	}

	public static void scaleShapes(Scalable[] scalableArray, double scaleFactor) {
		for (Scalable scalable : scalableArray) {
			scalable.scale(scaleFactor);
		}
	}
}
