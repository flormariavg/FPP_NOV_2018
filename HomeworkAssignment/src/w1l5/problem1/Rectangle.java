package w1l5.problem1;

public class Rectangle extends  Shape{
	
	double width;
	double height;
	
	public Rectangle(String color, double width, double height) {
		// TODO Auto-generated constructor stub
		super(color);
		
	}
	
	public double calcualteArea() {
		
		return width * height;
	} 
	
	public double calculatePerimeter() {
	
		return 2 * width + 2 * height;
	}

}
