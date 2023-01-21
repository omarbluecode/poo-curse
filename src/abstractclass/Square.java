package abstractclass;

public class Square extends Figure{

	private double side;
	
	public Square() {
		super();
	}

	
	public Square(double x, double y, double side) {
		super(x, y);
		this.side = side;
	}
	
	
	@Override
	public double calculateArea() {
		double result = side * side;
		return result;
	}

}
