package w3l9.problem1;

/**
 * 
 * @author flormaria
 *
 */
public class Main {
	
	public static void main(String[] args) {
		
		ArrayQueueImpl queue= new ArrayQueueImpl();
		
		System.out.println("The size is: "+queue.size());
		
		System.out.println("Peek: "+queue.peek());
		System.out.println("Dequeue: "+queue.dequeue());
		
		queue.enqueue(3);
		queue.enqueue(5);
		queue.enqueue(2);
		queue.enqueue(5);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(5);
		queue.enqueue(2);
		queue.enqueue(5);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(5);
		queue.enqueue(2);
		queue.enqueue(5);
		queue.enqueue(2);
		
		System.out.println("\nThe size is:"+queue.size());
		System.out.println("Peek: "+queue.peek());
		System.out.println("Dequeue: ");
		queue.dequeue();
		System.out.println("The size after dequeue is: "+queue.size());
		System.out.println("Peek after dequeue is: "+queue.peek());
		
	}
	
	/*
	 * OUTPUT
	 * 
	 * The size is: 0
		Queue is Empty
		Peek: -1
		Queue is Empty
		Dequeue: -1
		
		The size is:15
		Peek: 3
		Dequeue: 
		The size after dequeue is: 14
		Peek after dequeue is: 5
	 */

}
