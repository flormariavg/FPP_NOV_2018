package w3l8.problem2;
/**
 * 
 * @author flormaria
 *
 */
public class Main {

	public static void main(String[] args) {
		
		
		MyPersonList persons = new MyPersonList();
		persons.add(new Person("Perez", "Jhon", 25));
		persons.add(new Person("Cuenca", "Andres", 24));
		persons.add(new Person("Armijos", "Carlos", 31));
		
		System.out.println("\nUnordered List:");
		System.out.println("\n"+persons);
		persons.sort();
		
		System.out.println("\nOrdered list:");
		System.out.println("\n"+persons);
		
		System.out.println("\nIs "+persons.search("Perez")+" that the person "+"Perez"+" exist in the list");
		
		/*
		 * OUTPUT:
		 * 
		 *	
			Unordered List:
			
			[Person [LastName=Perez FirstName=Jhon Age=25]
			 Person [LastName=Cuenca FirstName=Andres Age=24]
			 Person [LastName=Armijos FirstName=Carlos Age=31]]
			
			Ordered list:
			
			[Person [LastName=Armijos FirstName=Carlos Age=31]
			 Person [LastName=Cuenca FirstName=Andres Age=24]
			 Person [LastName=Perez FirstName=Jhon Age=25]]
			
			Is true that the person Perez exist in the list
		 * 
		 */
	}
}
