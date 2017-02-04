package Queues;

public class Queue_Array {

	int [] arr;
	int front;
	int rear ;
	Queue_Array(int capacity){
		arr = new int [capacity];
		front = rear = -1;
		
	}
	
	public void enqueue(int data){
		if(isEmpty()){
			front = rear = 0;
			arr[rear] = data;
		}
		else if (isFull()){
			throw new RuntimeException("Array is Full");
		}
		else
			rear = rear+1;
		    arr[rear]= data;
	}
	//dequeuing has no relation with the 0 or -1 the queue is the subpart of array that is being used, and the front also increases when we
	//do dequeuing....and stuff.
	public void dequeue(){
		if(isEmpty())
			throw new RuntimeException ("Array is Empty. No dequeue possible");
		else{
			front = front+1;
		}
	
	}
	
	public boolean isEmpty(){
	 return(front==-1 && rear ==-1);	
	}
	 public boolean isFull(){
		 return(rear == arr.length-1);
	 }
	 
	 public void peek(){
		 if(!isEmpty()) 
	
		 System.out.println(arr[front]);
	 
	}
}
