package w1l2;

import w1pack.l2.RandomNumbers;;

public class Prog1 {
	
	public static void main(String[] args) {
		/*
		 * 1. get a random number x in the range 1 .. 9 and compute π pow x
		 */
		
		int x = RandomNumbers.getRandomInt(1,9);
		double sol1 = Math.pow(Math.PI, x);	
		
		System.out.println("Output Problem 1.1 = "+sol1);
		
		/*
		 * Output Problem 1.1 = 3.141592653589793
		 */
		
		/*
		 * 2. get a random number y in the range 3 .. 14 and compute y pow π
		 */
		
		int y = RandomNumbers.getRandomInt(3,14);
		double sol2 = Math.pow(y, Math.PI);
		
		System.out.println("Output Problem 1.2 = "+sol2);
		
		/*
		 * Output Problem 1.2 = 3159.04819858571
		 */
	}

}
