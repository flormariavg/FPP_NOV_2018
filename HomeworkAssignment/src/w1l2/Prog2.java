package w1l2;

public class Prog2 {

	public static void main(String[] args) {
		
		float a = (float) 1.27;
		float b = (float) 3.881;
		float c = (float) 9.6;
		int sum1 = (int) (a+b+c);
		int sum2 = Math.round(a+b+c);
		
		/*
		 * 
		 * 1.the sum of the floats as an integer, obtained by casting the sum to type int
		 */
		
		System.out.println("Output Problem 2.1 = "+sum1);
		
		/*
		 * Output Problem 2.1 = 14
		 */
		
		/*
		 * 2. the sum of the floats as an integer, obtained by rounding the sum to the nearest integer,
			using the Math.round function
		 */
		System.out.println("Output Problem 2.2 = "+sum2);
		
		/*
		 * Output Problem 2.2 = 15
		 */
				
	}
}
