package w3l9.problem2;

/**
 * 
 * @author flormaria
 *
 */
public class StackDoubleLinkedList implements Stack {
	
	Node header;
	Node top;
	
	public StackDoubleLinkedList() {
		// TODO Auto-generated constructor stub
		header=null;
		top=null;
	}
	

	@Override
	public void push(Object item) {
		// TODO Auto-generated method stub
		if(header==null)
			header=new Node(null, item, null);
		else {
			Node newNode;
			newNode= new Node(null, item, header);
			header.previous=newNode;
			header=newNode;
		}
	}
	
	@Override
	public Object pop() {
		// TODO Auto-generated method stub
		if(isEmpty()) return null;
		Node popNode;
		popNode=header;
		if(header.next==null)
			header=null;
		else {
			header.next.previous=null;
			header=header.next;
		}
		
		return popNode;
	}

	@Override
	public Object peek() {
		// TODO Auto-generated method stub
		if(isEmpty()) return null;
		return header;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(header==null) {
			System.out.println("Stack is empty");
			return true;
		}
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		Node n= header;
		int size=0;
		while(n!=null) {
			size++;
			n=n.next;
		}	
		return size;
	}
	
	public void show() {
		show(header);
	}
	
	public void show(Node n) {
		if(n==null) 
			return;
		System.out.println(n);
		show(n.next);
	}
	
	

}
