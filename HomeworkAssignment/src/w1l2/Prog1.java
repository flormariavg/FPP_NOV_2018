package w1l2;

import w1pack.l2.RandomNumbers;;

public class Prog1 {
	
	public static void main(String[] args) {
		/*
		 * Problem 1
		 */
		
		int x = RandomNumbers.getRandomInt(1,9);
		double sol1 = Math.pow(Math.PI, x);	
		
		System.out.println("Solution Problem 1 = "+sol1);
		
		/*
		 * Solution Problem 1 = 9488.53101607057
		 */
		
		/*
		 * Problem 2
		 */
		
		int y = RandomNumbers.getRandomInt(3,14);
		double sol2 = Math.pow(y, Math.PI);
		
		System.out.println("Solution Problem 2 = "+sol2);
		
		/*
		 * Solution Problem 2 = 2456.675951201724
		 */
		
	}

}
