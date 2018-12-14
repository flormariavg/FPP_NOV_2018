package w3l9.problem2;

public class Node {
	Object value;
	Node next;
	Node previous;
	
	public Node(Node previous, Object value, Node next) {
		// TODO Auto-generated constructor stub
		this.value=value;
		this.next= next;
		this.previous= previous;
		
	}

	@Override
	public String toString() {
		String pv=  null;
		String nv= null;
		String v= null;
		if(previous!=null)
			pv=(String)previous.value;
		if(next!=null)
			nv=(String)next.value;
		if(value!=null)
			v= (String) value;
			
		return "==> "+pv+" ==> "+v+" ==> "+nv;
	}
}
