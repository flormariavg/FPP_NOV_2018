package w1l2;

import java.util.Scanner;

public class Prog7 {
	
	public static void main(String[] args) {
		
		int len = 0;
		if(args!=null) len = args.length;
		
		//a. Print the length of each string input
		System.out.println("Length of string input= "+len);
		/*
		 * Solution Problem 7.1:
		 * It is a test with A, Ann is a name
			Length of string input= 10
		 */
		
		//b. Count the string inputs starts with ‘A’
		
		int cont=0;
		
		for (String s: args) {
			if(s.charAt(0)=='A')
				cont++;
		}
		
		/*
		 * Solution Problem 7.2:
		 *	It is a test with A, Ann is a name
			Length of string input= 10
			The string inputs that starts with ‘A’: 2
		 */
		System.out.println("The string inputs that starts with ‘A’: "+cont);
		
	}

}
