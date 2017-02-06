package Queues;

public class Q_impl {

	public static void main(String[] args) {
		Queue_Array q = new Queue_Array(4);
		q.enqueue(13);
		q.enqueue(10);
		q.peekFront();
		System.out.println(q.peekRear());
		
	}

}
