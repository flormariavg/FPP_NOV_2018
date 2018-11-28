package w1l2;

public class Prog2 {

	public static void main(String[] args) {
		
		float a = (float) 1.27;
		float b = (float) 3.881;
		float c = (float) 9.6;
		
		/*
		 * 
		 * Problem 1
		 */
		
		int sum1 = (int) (a+b+c);
		
		System.out.println("Solution Problem 1 = "+sum1);
		
		/*
		 * Solution Problem 1 = 14
		 */
		
		/*
		 * Problem 2
		 */
		int sum2 = Math.round(a+b+c);
		System.out.println("Solution Problem 2 = "+sum2);
		
		/*
		 * Solution Problem 2 = 15
		 */
				
	}
}
