package problem2;

public class Ellipse extends Shape {
	private double majorAxis;
	private double minorAxis;

	public Ellipse(String name, double a, double b) {
		super(name);
		this.majorAxis = Math.max(a, b);
		this.minorAxis = Math.min(a, b)	;
	}

	// Slightly different from the one in problem1/Ellipse.java
	@Override
	public double computePerimeter() {
		return Math.round(Math.PI * (3 * (majorAxis + minorAxis) - Math.sqrt((3 * majorAxis + minorAxis) * (majorAxis + 3 * minorAxis))));
	}

	@Override
	public double computeArea() {
		return Math.round(Math.PI * majorAxis * minorAxis);
	}

	@Override
	public void scale(double factor) {
		this.majorAxis *= factor;
		this.minorAxis *= factor;
	}
}
