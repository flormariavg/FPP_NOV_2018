package w1l5.problem1;

public class Main {
	
	public static void main(String[] args) {
		Shape shapes[] = { new Circle("blue", 2),
				new Rectangle("white", 10, 20),
				new Square("black",5),
				new Circle("gray", 7),
				new Rectangle("blue", 4, 8),
				new Square("purple", 12)
		};
		
		printTotal(shapes);
	}
	
	public static void printTotal(Shape[] shapes)
	{ // Implement your code 
		double area= 0.0;
		double perimeter= 0.0;
		for(Shape s: shapes) {
			area = s.calcualteArea()+area;
			perimeter = s.calculatePerimeter()+perimeter;
		}
		System.out.println("Area: "+area);
		System.out.println("Perimeter: "+perimeter);
		
	}
	
	/*
	 * OUTPUT
	 * Area: 166.50441064025904
	 * Perimeter: 56.548667764616276
	 */

}
