package w3l9.problem1;
/**
 * 
 * @author flormaria
 *
 */
public class ArrayQueueImpl {

	private int[] arr = new int[10];
	private int front = -1;
	private int rear = 0;
	
	public int peek() {
		if(isEmpty()) 
			return -1;
		
		return arr[front+1];
		// implement
	}

	public void enqueue(int obj) {
		// implement
		if(rear==arr.length) resize();
		arr[rear]=obj;
		rear++;
	}

	public int dequeue() {
		if(isEmpty()) 
			return -1;
		
		front++;
		return arr[front];
		// implement
	}

	public boolean isEmpty() {
		// implement
		if(size()==0) {
			System.out.println("Queue is Empty");
			return true;
		}
		return false;
	}

	public int size() {
		// implement
		return (arr.length-front-1+rear)%arr.length;
	}

	private void resize() {
		// implement
		int[] temp= new int[arr.length*2];
		System.arraycopy(arr, 0, temp, 0, arr.length);
		arr= new int[temp.length];
		arr=temp;
	}
}