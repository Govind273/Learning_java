package Stackss;

public class Stack_Linkedlst {
	
	
 class Nodes{
		int data;
		Nodes next;
		
		Nodes(){
			
		}
		Nodes(int data){
			this.data= data;
			
		}
		Nodes(int data, Nodes next){
			this.data = data;
			this.next = next;
		}
	}

int size =0;
Nodes Top;

/*public void push(int data){
	if(Top == null) {
		Top = new Nodes(data,null);
	}
	Nodes current = new Nodes(data,null);
    Top.next = current;
    Top = current;
}
This is my Push method everything looks great in this..... but there is one flwas in this and that is 
i am making doing the Top.next as current and then Top = current (do it on pen and paper) ---- in short i am traversing through the Linkedlist in forward direction 
and that would make it difficult for me to traverse back....beacuse my arrows are pointing in the right direction
*
*/
// if don't know drwa approx 3-4 nodes and look at hw traversal is happening....
public void push(int data){
	if(Top == null){
		Top = new Nodes(data,null);
	}
	
	Nodes current = new Nodes(data);
	current.next = Top;
	Top = current;
}
public boolean isEmpty(){
	return(Top == null);
}
public void peek(){
	if(!isEmpty()){
		System.out.println(Top.data);
	}
	
}

public int  pop(){
	if(isEmpty())
		throw new RuntimeException("Stack is Empty");
	
	// this is the best use of a temp variable .... here you don't always have to think in Exactly deleting the values..now after the 
	//exits the vales will be handled by the garbage collection...
	// and since the next always points at the null so we dont need to be defining what it should be pointing...
	int temp = Top.data;
	
	Top = Top.next;
	return temp;
	
	
   
}

public void allvalue(){
	if(!isEmpty()){
		Nodes current = 
	}
}
}




//Class for the Nodes, this class is creating the blueprint for the Nodes 
