package problem2;

public class Circle extends Shape {
	private double radius;

	public Circle(String name, double radius) {
		super(name);
		this.radius = radius;
	}

	@Override
	public double computePerimeter() {
		return Math.round(2 * Math.PI * radius);
	}

	@Override
	public double computeArea() {
		return Math.round(Math.PI * radius * radius);
	}

	@Override
	public void scale(double factor) {
		this.radius *= factor;
	}
	
}
