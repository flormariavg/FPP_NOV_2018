package w3l9.problem2;

/**
 * 
 * @author flormaria
 *
 */
public class Main {
	
	public Main() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		
		StackDoubleLinkedList st= new StackDoubleLinkedList();
		
		st.isEmpty();
		System.out.println("The peek element is: "+st.peek());
		
		st.push("Ann");
		System.out.println("\nThe peek element is: "+st.peek());
		st.push("Carlos");
		System.out.println("The peek element is: "+st.peek());
		st.push("Andres");
		System.out.println("The peek element is: "+st.peek());
		
		System.out.println("\nThe size: "+st.size());
		System.out.println("\nStack elements: ");
		st.show();
		
		System.out.println("\nPop elemets: ");
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		
		System.out.println("\nThe size: "+st.size());
		st.show();
		
		
	}

	/*
	 * OUTPUT:
	 * 
	 * Stack is empty
		Stack is empty
		The peek element is: null
		
		The peek element is: ==> null ==> Ann ==> null
		The peek element is: ==> null ==> Carlos ==> Ann
		The peek element is: ==> null ==> Andres ==> Carlos
		
		The size: 3
		
		Stack elements: 
		==> null ==> Andres ==> Carlos
		==> Andres ==> Carlos ==> Ann
		==> Carlos ==> Ann ==> null
		
		Pop elemets: 
		==> null ==> Andres ==> Carlos
		==> null ==> Carlos ==> Ann
		==> null ==> Ann ==> null
		
		The size: 0
	 * 
	 */
}
