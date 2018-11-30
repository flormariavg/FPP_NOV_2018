package w1l3.prog3_4;

public final class Circle {
	
	private double radius;
	public Circle(double radius) {
		// TODO Auto-generated constructor stub
		this.radius= radius;
	}
	
	public double computeArea() {
		return Math.PI*radius*radius;
	}

	public double getRadius() {
		return radius;
	} 

}
