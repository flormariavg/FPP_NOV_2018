package w1l3;

public final class Triangle {

	private double base, height;
	
	public Triangle(double base, double height) {
		// TODO Auto-generated constructor stub
		this.base= base;
		this.height= height;
	}
	
	public double computeArea() {
		return 1.0/2.0 * base * height;
	}

	public double getBase() {
		return base;
	}

	public double getHeight() {
		return height;
	} 
}
