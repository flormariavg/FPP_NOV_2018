package w1l5.problem5;

public class Main {
	
	public static void main(String[] args) {
		Computer c1 = new Computer("Manufacture 1","1.5", 8, 16) ;
		Computer c2 = new Computer("Manufacture 1","1.5", 8, 16) ;
		
		Computer c3 = new Computer("Manufacture 2","1.7", 16, 32) ;
		
		
		
		System.out.println("The object: "+c1);
		System.out.println("The object: "+c2);
		System.out.println("Hash Code: "+c1.hashCode());
		System.out.println("Hash Code: "+c2.hashCode());
		System.out.println("Are the objects equals?: "+c1.equals(c2));
		
		System.out.println("\nThe object: "+c2);
		System.out.println("The object: "+c3);
		System.out.println("Hash Code: "+c2.hashCode());
		System.out.println("Hash Code: "+c3.hashCode());
		System.out.println("Are the objects equals?: "+c3.equals(c2));
	}
	
	/*
	 * OUTPUT:
	 * 	The object: [Manufacture: Manufacture 1, Pocessor: 1.5, Ram Size: 8, Processor Speed: 16.0, Compute Power:128.0]
		The object: [Manufacture: Manufacture 1, Pocessor: 1.5, Ram Size: 8, Processor Speed: 16.0, Compute Power:128.0]
		Hash Code: 1076888761
		Hash Code: 1076888761
		Are the objects equals?: true
		
		The object: [Manufacture: Manufacture 1, Pocessor: 1.5, Ram Size: 8, Processor Speed: 16.0, Compute Power:128.0]
		The object: [Manufacture: Manufacture 2, Pocessor: 1.7, Ram Size: 16, Processor Speed: 32.0, Compute Power:512.0]
		Hash Code: 1076888761
		Hash Code: 1077937585
		Are the objects equals?: false
	 */

}
