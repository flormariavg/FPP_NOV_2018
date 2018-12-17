package w3l12.problem1;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * 
 * @author flormaria
 *
 */
public class MyExceptionHandlingNumber {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int inputNumber=101;
		String op="y";
		try {
		do{
			while(inputNumber> 100){
				System.out.print("Input a number bettween 0 to 100: ");
				inputNumber= s.nextInt();
			} 
			
			if(inputNumber<0)
				throw new Exception("The negative numbers are not accepted");
			
			System.out.print("Another number y/n? ");
			op= s.next();
			inputNumber=101;
		}while(op.toLowerCase().equals("y"));
		
		}catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("\nInvalid number ");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
}

	/*
	 * OUTPUT:
	 * 
	 * Input a number bettween 0 to 100: 800
		Input a number bettween 0 to 100: 50
		Another number y/n? Y
		Input a number bettween 0 to 100: 0
		Another number y/n? y
		Input a number bettween 0 to 100: -8
		The negative numbers are not accepted
		
		Input a number bettween 0 to 100: ff

		Invalid number 
	 */
}
