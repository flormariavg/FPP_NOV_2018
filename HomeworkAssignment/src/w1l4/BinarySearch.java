package w1l4;

import java.util.Arrays;

/**
 * 
 * @author Flor Vargas
 *
 */
public class BinarySearch {

	public static void main(String[] args) {
		int []a=new int[] {5,20,-5,6,8}; //-5,5,6,8,20
		//int []a=new int[] {-6,-5,0,1,2,3,4};
		int se=8;
		Arrays.sort(a);
		int pos=search(a, se, 0);
		
		System.out.print("In the array: [");
		for(int i=0; i<a.length-1;i++) {
			System.out.print(a[i]+",");	
		}
		System.out.print(a[a.length-1]+"]");
		if(pos==-1)
			System.out.println("The element is not in the array");
		else
			System.out.println(", the element "+se+" is in the position: "+pos);
		
	}
	private static int search(int [] a, int se, int index) {
		// TODO Auto-generated method stub
		if((index+a.length)==0)
			return -1;
		
		int mid= (index+a.length)/2;
		
		if(a==null || a.length==0 || mid>a.length || mid<0) 
			return -1;
			
		if(a[mid]==se)
			return mid;
		else {
			if(se>a[mid]) {
				index=mid;
			}
			else {
				
				if(index<0)
					index=index*-1;
				index=mid+index;
				index= index*-1;
			}
				
		}	
		return search(a, se, index);

	}
	/*
	 * OUTPUT:
	 * In the array: [-5,5,6,8,20], the element 8 is in the position: 3
	 */
	

}
