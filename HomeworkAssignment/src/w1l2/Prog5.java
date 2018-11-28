package w1l2;

import w1pack.l2.RandomNumbers;

public class Prog5 {
	
	public static void main(String[] args) {
		RandomNumbers.getRandomInt(1,99);
	//	System.out.println(RandomNumbers.getRandomInt(1,99));
		
		int [][] questions = new int[4][4];
		
		for(int i=0;i<questions.length;i++) {
			
			for(int j=0;j<questions.length;j++) {
				
				questions[i][j]=RandomNumbers.getRandomInt(1,99);
				if(i%2==0)
					System.out.printf("%s\t",questions[i][j]);
				else
					System.out.printf("+%s\t",questions[i][j]);
			}
			
			if(i%2!=0)
				System.out.printf("\n_____\t_____\t_____\t_____\n	\n	\n");
			System.out.println();
			
			/*
			 * Solution Problem 5:
			 * 
			 	84	30	34	49	
				+69	+84	+74	+34	
				_____	_____	_____	_____
					
					
				
				74	48	48	84	
				+61	+90	+95	+22	
				_____	_____	_____	_____
					
	
			 * 
			 */
			
		}
		
	}

}
