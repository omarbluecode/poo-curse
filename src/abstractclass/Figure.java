package abstractclass;

public abstract class Figure {
	
	protected double x;
	protected double y;
	
	protected Figure() {
		super();
	}
	
	protected Figure(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public abstract double calculateArea();
	
}
