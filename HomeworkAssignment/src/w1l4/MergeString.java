package w1l4;

/**
 * 
 * @author Flor Vargas
 * 
 *
 */
public class MergeString {
	
	public static void main(String[] args) {		
		String s2="ace";
		String s1="bdf";	
		
		System.out.print("Merge sorted string: ");
		merge(s1,s2);
	}
	
	public static String merge(String s1, String s2) {
	
		if((s1.length()==0 || s2.length()==0) || (s1==null || s2==null))
			return "";
		System.out.print(sorted(s1.charAt(0),s2.charAt(0)));
		if(s1.length()==1 && s2.length()==1)
			return "";
				
		return merge(s1.substring(1), s2.substring(1));
	}
	
	public static String sorted(char c1, char c2) {
		StringBuilder sb= new StringBuilder();
		if(c1<c2) {
			sb.append(c1);
			sb.append(c2);
		}else {
			sb.append(c2);
			sb.append(c1);
		}
		return sb.toString();
	}
	
	/*
	 * OUTPUT:
	 * Merge sorted string: abcdef
	 */

}
