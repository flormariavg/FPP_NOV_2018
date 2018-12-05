package w1l5.problem6.shallow;


public class Person implements Cloneable{
		String name;
		Computer computer; // Refer from the Problem 5.
		
		
		public Person(String name, Computer computer) {
			
			this.name = name;
			this.computer = computer;
		}


		@Override
		protected Object clone() throws CloneNotSupportedException {
			Person person = (Person)super.clone();		
			return person;
		}
		
}
