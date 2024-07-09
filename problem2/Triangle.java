package problem2;

public class Triangle extends Shape {
	private double side1, side2, side3;

	public Triangle(String name, double side1, double side2, double side3) {
		super(name);
		if (side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2) {
			this.side1 = side1;
			this.side2 = side2;
			this.side3 = side3;
		} else {
			throw new IllegalArgumentException("Invalid side lengths for a triangle");
		}
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	@Override
	public double computePerimeter() {
		return Math.round(side1 + side2 + side3);
	}

	@Override
	public double computeArea() {
		double s = computePerimeter() / 2;
		return Math.round(Math.sqrt(s * (s - side1) * (s - side2) * (s - side3)));
	}

	@Override	
	public void scale(double factor) {
		this.side1 *= factor;
		this.side2 *= factor;
		this.side3 *= factor;
	}
}
