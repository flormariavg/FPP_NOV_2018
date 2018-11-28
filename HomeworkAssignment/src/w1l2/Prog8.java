package w1l2;

public class Prog8 {

	public static void main(String[] args) {
		int []input =  {2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, 22};
		int min=input[0];
		for (int i = 1; i < input.length; i++) {
			if(min>input[i])
				min=input[i];
			
		}
		
		System.out.println("The minimum value in this array = "+min);
		/*
		 * Solution Problem 8:
		 	The minimum value in this array = -21
		 */
	}
}
