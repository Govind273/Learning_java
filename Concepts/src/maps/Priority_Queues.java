package maps;


import java.util.PriorityQueue;

public class Priority_Queues {

	public static void main(String[] args) {
		PriorityQueue<Integer> q = new 	PriorityQueue<Integer>();
		
       for (int i= 10; i>=0; i--){
    	   q.offer(i);
       }
        
        
        System.out.println(q);  
        System.out.println(q.poll());
        q.peek();
        
	}	

}
