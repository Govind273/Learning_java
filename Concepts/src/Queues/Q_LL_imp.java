package Queues;

public class Q_LL_imp {

	public static void main(String[] args) {
		Q_Lnkdlst q = new Q_Lnkdlst();
		System.out.println(q.isEmpty());
		q.enqueue(13);
		q.peekFront();
		q.peekRear();
		q.enqueue(10);
		q.peekFront();
		q.peekRear();
		
		q.enqueue(20);
		q.peekFront();
		q.peekRear();

		q.enqueue(21);
		q.peekFront();
		q.peekRear();

		q.enqueue(22);
		q.peekFront();
		q.peekRear();

		q.enqueue(25);
		q.peekFront();
		q.peekRear();

		System.out.println(" ssd   sdsd       sadfd              sds                      ssfccccc wd          dsfffffff");
		
	
		

		q.printval(q.front);
		
		
	}

}
