package problem1;

public class Ellipse extends Shape {
	private double majorAxis;
	private double minorAxis;

	public Ellipse(String name, double a, double b) {
		super(name);
		this.majorAxis = Math.max(a, b);
		this.minorAxis = Math.min(a, b);
	}

	// According to Copilot this is an acceptable way to calculate the approx. perimeter of an ellipse
	@Override
	public double computePerimeter() {
		return Math.round(2 * Math.PI * Math.sqrt((Math.pow(majorAxis, 2) + Math.pow(minorAxis, 2)) / 2));
	}

	@Override
	public double computeArea() {
		return Math.round(Math.PI * majorAxis * minorAxis);
	}
	
}
