package w1l4;

/**
 * 
 * @author Flor Vargas
 *
 */
public class Palindrome {
	
	static StringBuilder sb = new StringBuilder();
	static String stringIspalidrome= new String("tacocat");
	public static void main(String[] args) {
		if(isPalindrome(stringIspalidrome))
			System.out.println("The word "+stringIspalidrome+" is palindrome");
		else
			System.out.println("The word "+stringIspalidrome+" is not palindrome");
		
	}
	
	public static boolean isPalindrome(String s) {
		
		if(s.length()==0 || s==null) {
			if(sb.toString().equals(stringIspalidrome))
				return true;
			else
				return false;
		}
		
		sb= sb.append(s.charAt(s.length()-1));
		
		return isPalindrome(s.substring(0,s.length()-1));
	}

	/*
	 * OUTPUT:
	 * The word tacocat is palindrome

	 */
}
