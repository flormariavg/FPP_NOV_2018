package w1l3;

public final class Rectangle {
	
	private double width, height;
	public Rectangle(double width, double height) {
		// TODO Auto-generated constructor stub
		this.width = width;
		this.height= height;
	}

	public double computeArea() {
		return width * height;
	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	} 
}
