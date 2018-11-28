package w1l2;

import java.util.Scanner;

public class Prog4 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a String: ");
		String variable = scanner.nextLine();
		
		System.out.print("String in reverse: ");
		for(int i=variable.length()-1;i>=0;i--) {
			System.out.print(variable.charAt(i));
		}
		
		/*
		 * Solution Problem 4:
		 * 
		 	Input a String: Flor Maria
			String in reverse: airaM rolF
		 * 
		 */
	}

}
