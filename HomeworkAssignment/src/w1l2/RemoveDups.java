package w1l2;

public class RemoveDups {
	
	public static void main(String[] args) {
		String[] inputs = {"horse", "dog", "cat", "horse","dog"} ;
		String[] outputs;
		String[] temp =new String[inputs.length] ;
		int k=0;
		
		
		
		for(int i=0;i<inputs.length;i++) {	
			int j=0, cont=0;
			
			do {	
				if(temp[j]!=null)
					if(inputs[i]==temp[j]) {
						cont++;
						break;	
					}
				j++;
				
			}while(j<=i);
			
			if(cont==0) {
				temp[j-1]=inputs[i];
				k++;
			}
		}

		outputs =new String[k];
		for (int i = 0; i < k; i++) {
			outputs[i]=temp[i];
			System.out.println(outputs[i]);
		}
		/*
		 * Solution Problem 6:
		 * 
		 * Output Remove Dumps: 
			horse
			dog
			cat
		 */
		
	
	}
	
	
	
	

}
