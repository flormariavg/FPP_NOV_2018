package w1l3.prog3_4;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner((System.in));
		System.out.println("Enter C for Circle");
		System.out.println("Enter R for Rectangle");
		System.out.println("Enter T for Triangle");
		String s = scanner.nextLine();
		
		Scanner input = new Scanner(System.in);
		double width, height, base, radius;
		
		try {
			
		switch (s) {
		case "C":
			System.out.println("Enter the radius of the Circle");
			radius= new Double(input.nextLine());
			Circle circle = new Circle(radius);
			System.out.println("The area of Circle is : "+circle.computeArea());
			
			break;
		case "R":		
			System.out.println("Enter the width of the Rectangle");
			width= new Double(input.nextLine());
			System.out.println("Enter the height of the Rectangle ");
			height= new Double(input.nextLine());
			Rectangle rectangle = new Rectangle(width, height);	
			System.out.println("The area of Rectangle is : "+rectangle.computeArea());
			break;	
		case "T":	
			System.out.println("Enter the base of the Triangle");
			base= new Double(input.nextLine());
			System.out.println("Enter the height of the Triangle ");
			height= new Double(input.nextLine());
			Triangle triangle = new Triangle(base, height);
			System.out.println("The area of Triangle is : "+triangle.computeArea());
			break;
		default:
			System.out.println("The input option is not valid");
			
			break;
		}
		
		} catch (Exception e) {
			System.out.println("Only numbers are allowed");
		}
		
		/*
		 * Enter C for Circle
		 * Enter R for Rectangle
		 * Enter T for Triangle
		 * T
		 * Enter the base of the Triangle
		 * 34
		 * Enter the height of the Triangle 
		 * 23
		 * The area of Triangle is : 391.0
		 * 
		 * ************************************
		 * Enter C for Circle
		 * Enter R for Rectangle
		 * Enter T for Triangle
		 * C
		 * Enter the radius of the Circle
		 * 25
		 * The area of Circle is : 1963.4954084936207
		 * 
		 * *************************************
		 * 
		 * Enter C for Circle
		 * Enter R for Rectangle
		 * Enter T for Triangle
		 * R
		 * Enter the width of the Rectangle
		 * 15
		 * Enter the height of the Rectangle 
		 * 20
		 * The area of Rectangle is : 300.0
		 *	
		 */
		
	}

}
