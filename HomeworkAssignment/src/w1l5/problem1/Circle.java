package w1l5.problem1;

public class Circle extends Shape{
	
	double radius;
	
	public Circle(String color, double radius) {
		// TODO Auto-generated constructor stub
		
		super(color);
		this.radius=radius;
	}
	
	public double calcualteArea() {
		return Math.PI * radius * radius;
	} 
	
	public double calculatePerimeter() {
		return 2 * Math.PI * radius;
	}

}
