package abstractclass;

public class Circle extends Figure {

	private double radius;
	
	public Circle() {
	}

	public Circle(double x, double y, double radius) {
		super(x, y);
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		double pi = 3.14;
		double result = pi * radius * radius;
		return result;
	}

}
