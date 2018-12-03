package w1l4;

/**
 * 
 * @author Flor Vargas
 *
 */
public class MinimumCharacter {
	
	public static void main(String[] args) {
		String s ="akel";
		System.out.print("The minimun character: "+ findMinimun(s.substring(1), s.charAt(0)));
	}
	
	public static char findMinimun(String s, char c) {
		
		if(s==null || s.length()==0)
			return ' ';
		
		if(c>s.charAt(0))
			c=s.charAt(0);
		
		if(s.length()==1) 
			return c;
		
		return findMinimun(s.substring(1),c);
	}
	
	/*
	 * OUTPUT:
	 * The minimun character: a
	 */
}
