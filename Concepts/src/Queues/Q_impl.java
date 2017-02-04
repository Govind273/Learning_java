package Queues;

public class Q_impl {

	public static void main(String[] args) {
		Queue_Array q = new Queue_Array(10);
		
		q.peek();
		q.enqueue(12);
		q.peek();
		q.enqueue(14);
		q.peek();
        q.dequeue();
	}

}
