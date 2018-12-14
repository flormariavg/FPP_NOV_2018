package w2l8.problem1;

/**
 * 
 * @author flormaria
 *
 */
public class MyStringLinkedList {
	Node header;

	MyStringLinkedList() {
		header = null;
	}
           	
	public void addSort(String item){ 
         // Implement
		
		if(header==null)
			header= new Node(null, item, null);
		else {
			Node newNode;
			for (Node node=header;node!=null;node=node.next) {
				
				if(item.compareTo(node.value)>0) {
					if(node.next==null) {
						newNode= new Node(node, item, null);
						node.next=newNode;
						return;
					}else if (item.compareTo(node.next.value)<=0) {
						newNode= new Node(node, item, node.next);
						newNode.next.previous=newNode;
						node.next=newNode;
						return;
					}
				}else if(node.previous==null) {
					newNode= new Node(null, item, node);
					node.previous=newNode;
					header=newNode;
					return;
				}
				
			}
		}
		
    }  // insert in a Sorted Order
	
	public int size(){ 
        // Implement
		int cont=0;
		for(Node n=header;n!=null;n=n.next) 
			cont++;
		return cont;
	 }

	public boolean isEmpty(){
	// Implement
		if(header==null)
			return true;
		else
			return false;
	}  

	public Node getFirst(){
	// Implement
		if(header==null) return null;
		return header;
	}

	public Node getLast(){
	// Implement
		for(Node n=header;n!=null;n=n.next) {
			if(n.next==null)
				return n;
		}
		return null;
	}

    public boolean contains(String item){
	// Implement
    	if(header==null) return false;
    	for(Node n=header;n!=null;n=n.next) {
    		if(n.value.equals(item))
    			return true;
    	}
    	return false;
	}  

	public void removeFirst(){
	// Implement
		if(header==null) return;
		if(header.next!=null) {
			header.next.previous=null;
			header= header.next;
		}else header=null;
			
	}

     void removeLast(){
	// Implement
    	 if(header==null) return;
    	 Node n= header.next;
    	 while (n!=null) {
			if(n.next==null) {
				n.previous.next=null;
				return;
			}
			n=n.next;
			
		}
	}
      public void print(){
        print(header);
      } 
	
	//Write a recursive print method to display the elements in the list. 
	private void  print(Node n) {
		if(n==null) return;
		if(n.next==null) {
			System.out.print(n);
			return;
		}
		else {
			System.out.print(n +"==> ");
			print(n.next);
		}
		
	}
	
	public String toString() {
		String str =""; 
		Node temp = header;
		while (temp != null) {
			str = str + "-->[" + temp.value.toString() + "]";
			temp = temp.next;
		}
		str = str + "-->[" + "NULL" + "]";
		return str;
	}

	
	public class Node {
		String value;
		Node next;
		Node previous;

		Node(Node previous, String value, Node next) {
			this.previous = previous;
			this.value = value;
			this.next = next;
		}

		public String toString() {
			return value;
		}
	}

	public static void main(String[] args) {
		MyStringLinkedList mySL = new MyStringLinkedList();
		// Make use of the implemented methods
		System.out.println("The lis is empty? "+ mySL.isEmpty());
		mySL.addSort("Carlos");
		mySL.addSort("Flor");
		mySL.addSort("Diana");
		mySL.addSort("Flor");
		mySL.addSort("Andres");
		mySL.addSort("Diana");
		mySL.addSort("Kiara");
		mySL.addSort("Gigi");
		
		System.out.println("\nThe elements in the Sorted order:");
		System.out.println(mySL);
		
		System.out.println("\nThe size: "+mySL.size());
		System.out.println("\nThe list is empty? "+ mySL.isEmpty());
		System.out.println("\nThe first node: "+mySL.getFirst());
		System.out.println("\nThe last node: "+mySL.getLast());
		mySL.removeFirst();
		System.out.println("\nThe first node after remove first: "+mySL.getFirst());
		mySL.removeLast();
		System.out.println("\nThe last node after remove last: "+mySL.getLast());
		System.out.println("\nCall recursive print method to display ");
		mySL.print();
		
	}
	/*
	 * OUTPUT
	 * 
	 * The lis is empty? true

		The elements in the Sorted order:
		-->[Andres]-->[Carlos]-->[Diana]-->[Diana]-->[Flor]-->[Flor]-->[Gigi]-->[Kiara]-->[NULL]
		
		The size: 8
		
		The list is empty? false
		
		The first node: Andres
		
		The last node: Kiara
		
		The first node after remove first: Carlos
		
		The last node after remove last: Gigi
		
		Call recursive print method to display 
		Carlos==> Diana==> Diana==> Flor==> Flor==> Gigi
	 */

}
