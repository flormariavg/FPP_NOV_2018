package w1l5.problem6.deep;


public class Main {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated constructor stub

		Person p = new Person("Person 1", new Computer("Manufacture 1","1.5", 8, 16) );
		
		Person p2;
		p2=(Person)p.clone();
		
				
		System.out.println("Before Clone");
		System.out.println(p.computer);
		System.out.println(p2.computer);
		System.out.println();
		
		System.out.println("After Clone");
		p.computer.manufacture="Intel" ;
		
		System.out.println(p.computer);
		System.out.println(p2.computer);
		
	}
	
	/*
	 * OUTPUT:
	 * 	Before Clone
		[Manufacture: Manufacture 1, Pocessor: 1.5, Ram Size: 8, Processor Speed: 16.0, Compute Power:128.0]
		[Manufacture: Manufacture 1, Pocessor: 1.5, Ram Size: 8, Processor Speed: 16.0, Compute Power:128.0]
		
		After Clone
		[Manufacture: Intel, Pocessor: 1.5, Ram Size: 8, Processor Speed: 16.0, Compute Power:128.0]
		[Manufacture: Manufacture 1, Pocessor: 1.5, Ram Size: 8, Processor Speed: 16.0, Compute Power:128.0]
	 */
	
}
