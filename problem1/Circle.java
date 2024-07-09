package problem1;

public class Circle extends Shape{
	private double radius;

	public Circle(String name, double radius) {
		super(name);
		this.radius = radius;
	}

	@Override
	public double computePerimeter() {
		return Math.round(2 * Math.PI * radius * 10.0) / 10.0;
	}

	@Override
	public double computeArea() {
		return Math.round(Math.PI * radius * radius);
	}
}
