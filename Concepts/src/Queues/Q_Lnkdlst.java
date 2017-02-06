package Queues;

public class Q_Lnkdlst {

	class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			next = null;
		}
		Node(int data, Node next){
			this.data = data;
			this.next = next;
		}
		
		Node(){
			
		}
	}

       Node front;
       Node rear ;
       
       Q_Lnkdlst(){
    	   front = rear = null;
       }
       
       public boolean isEmpty(){
    	   return(front == null);
       }

      public void enqueue(int data){
    	  if(isEmpty()){
    		  Node current = new Node(data);
    		  front= rear = current;
    		  
    	  }
    	 Node current = new Node(data);
    	 // front is not kept under scope as only rear has to advance when new data is entered.
    
    	 rear.next= current;
    	 rear = current;
      }

    //The deque is not working the first time ..may be the reason is that it is moving from null to first.
      public void dequeue(){
    	
    	if(isEmpty())
    	{
    		return ;
    	}
    	
    	System.out.println("Element at Front:"+front.data);	 
        front = front.next;
    	System.out.println("Element at Front:"+front.data);	 
    
		
     }
     public void peekFront(){
    	 if(!isEmpty()){
    	    	System.out.println("Front value is " +front.data);
    	    }
    	
     }
     public void printval(Node front)
     {
    	 while(front!=null)
    	 {
    		 System.out.println(front.data);
    		 front = front.next;;
    	 }
     }
     public void peekRear(){
    	 if(!isEmpty()){
    	    	System.out.println("Rear value is"+ rear.data);
    	    }
     }

}

