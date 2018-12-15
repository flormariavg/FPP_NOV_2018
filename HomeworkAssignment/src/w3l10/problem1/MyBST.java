package w3l10.problem1;

/**
 * 
 * @author flormaria
 *
 */
public class MyBST {

	BinaryNode root, left, right;
	int cont;
	
	public MyBST() {
		// TODO Auto-generated constructor stub
		root=null;
		left=null;
		right=null;
		cont=0;
	}
	
	public void insert(Integer x) {
		if(root==null) {
			root= new BinaryNode(x);
			cont++;
			return;
		}else {
			BinaryNode n= root;
			boolean inserted= false;
			
			while(inserted==false) {
				if(x.compareTo(n.element)<0) {
					if(n.left==null) {
						n.left= new BinaryNode(x, null, null);
						inserted=true;
						cont++;
					}
					else {
						n=n.left;
					}
					
				}else if(x.compareTo(n.element)>0) {
					if(n.right==null) {
						n.right= new BinaryNode(x, null, null);
						inserted=true;
						cont++;
					}else{
						n=n.right;
					}
					
				}else {
					System.out.println("The element exist in the tree");
					inserted=true;
				}
				
			}
		}
		
	}
	public void preOrder() {
		if(root ==null) {
			System.out.println("The tree is empty");
			return;
		}
		System.out.println("\n\na: Pre Order");
		preOrder(root);
	}

	private void preOrder(BinaryNode t){
		// implement
		//[VLR]
		if(t==null) return;
		if(t!=root)
			System.out.print(", ");
		System.out.print(t.element);
		preOrder(t.left);
		preOrder(t.right);
		
	}
	
	public void inOrder() {
		if(root ==null) {
			System.out.println("The tree is empty");
			return;
		}
		System.out.println("\n\nIn Order");
		inOrder(root);
	}

	private void inOrder(BinaryNode t){
		// implement
		//[LVR]
		if(t==null) return;
		
		inOrder(t.left);
		System.out.print(t.element+", ");
		inOrder(t.right);
		
	}
	public void postOrder() {
		if(root==null) {
			System.out.println( "Empty tree" );
			return;
		}
		System.out.println("\n\nb: Post Order");
		postOrder(root);
	}

	private void postOrder(BinaryNode t){ 
		//[LRV]
		if(t==null) return;
		
		postOrder(t.left);
		postOrder(t.right);
		
		System.out.print(t.element);
		if(t!=root)
			System.out.print(", ");
		
	}
	
	public void printTree() {
		if(root==null) 
			System.out.println( "Empty tree" );
		else
			printTree(root);
	}
	// Inorder Traversal to print the nodes in Ascending order
	private void printTree( BinaryNode t ){
		if( t != null ){
			printTree( t.left );
		    System.out.print(t.element+",");
		    printTree( t.right );
		} 
		
	}

	public boolean contains(Integer key) {
		return contains(root, key);
	}
	public boolean contains(BinaryNode n, Integer key){
		// implement 
		BinaryNode nTemp=n;
		if(n==null )
			return false; 
		else if(n.element.equals(key))
			return true;
		else {
			if(key.compareTo(n.element)>0) {
				nTemp= n.right;
			}else  if(key.compareTo(n.element)<0) {
				nTemp= n.left;
			}
		}
		
		return contains(nTemp, key);
		
	}

	public Integer getRoot(){
		// implement 
		return root.element;
	}

	public Integer leafNodes(){
		return leafNodes(root);
	}

	private int leafNodes(BinaryNode t){
		// Implement
		if(t==null) return 0;
		if(t.left==null && t.right==null) 
			return 1;
		
		return leafNodes(t.left)+leafNodes(t.right);
		
	}

	public int size(){
		// implement 
		return cont;
		
	}

	public boolean isEmpty(){
		 // check the tree is empty or not
		if(root==null)
			return true;
		else
			return false;
	}

	public Integer findMin() {
		return findMin(root);
	}

	private Integer findMin(BinaryNode n){
		if(n==null) return -1;
		if(n.left==null)
			return n.element;
		return findMin(n.left);
		
	}

	public Integer findMax() {
		return findMax(root);
	}

	public Integer findMax(BinaryNode n){
		// implement 
		if(n==null) return -1;
		if(n.right==null)
			return n.element;
		return findMax(n.right);
	}
	
	public static void main(String[] args) {
		
		MyBST mybst = new MyBST();
		System.out.println("Is empty? "+mybst.isEmpty());
		int [] a = {45,25,65,75,15,30,55,80,10,20,50,60};
		//int [] a = {15, 12, 9, 56, 1, 16, 19, 22, 3, 100, 2, 25};
	
		for (int j = 0; j < a.length; j++ ) {
			mybst.insert(a[j]);
					
		}
		mybst.printTree();
		
		mybst.preOrder();
		mybst.inOrder();
		mybst.postOrder();
		
		System.out.println("\n\nc: The tree contain the element 26: "+mybst.contains(26));
		System.out.println("\n   The tree contain the element 60: "+mybst.contains(60));
		
		System.out.println("\n\nd: Root: "+mybst.getRoot());
		
		System.out.println("\n\ne: Leaf nodes: "+mybst.leafNodes());
		
		System.out.println("\nf: Size:"+ mybst.size());
		
		System.out.println("\ng: Is empty? "+mybst.isEmpty());
		
		System.out.println("\nh: The min element in the tree: "+ mybst.findMin());
		
		System.out.println("\ni: The max element in the tree: "+ mybst.findMax());
			
	}
	
	private class BinaryNode {

		private Integer element;// The data in the node
		private BinaryNode left;      // Left child
		private BinaryNode right;     // Right child	  
		// Constructors 
		
		BinaryNode( Integer theElement ){
			this( theElement, null, null );
		}	

		BinaryNode( Integer element, BinaryNode left, BinaryNode right ){
			this.element = element;
			this.left = left;
			this.right = right;
		}

	}
	
	/*
	 * OUTPUT:
	 * 
	 *Is empty? true
		10,15,20,25,30,45,50,55,60,65,75,80,
		
		a: Pre Order
		45, 25, 15, 10, 20, 30, 65, 55, 50, 60, 75, 80
		
		In Order
		10, 15, 20, 25, 30, 45, 50, 55, 60, 65, 75, 80, 
		
		b: Post Order
		10, 20, 15, 30, 25, 50, 60, 55, 80, 75, 65, 45
		
		c: The tree contain the element 26: false
		
		   The tree contain the element 60: true
		
		
		d: Root: 45
		
		
		e: Leaf nodes: 6
		
		f: Size:12
		
		g: Is empty? false
		
		h: The min element in the tree: 10
		
		i: The max element in the tree: 80
	 */

}
