package linked_lst;

public class lnkd_lst3 {
    
   ListNode head ;
   int size=0;

//THE METHOD WILL ADD A NODE AT THE FRONT OF THE LINKEDLIST
 
public void addFront(int data){
	if(head==null){
		head = new ListNode(data,null);
	}
	else{
		ListNode newlink = new ListNode(data,head);
		head= newlink;                 
		
	}
	size++;
}
   
public void deleteFront(){
	if(head==null) return;

	head = head.Next;
	size--;
}

public void deleteEnd(){
	if (head == null) return ;
	ListNode current = head;
	while(current.Next.Next != null){
		current = current.Next;
	}
	current.Next = null;
	size--;
}

public int search(int data){
	int i =1;
	ListNode current = head;
 	while(current.Next != null){
		if(current.data == data){
			return i;
		}
		else{
			current = current.Next;
		    i++;
	}
	}
	return -1;	
	
	
}


public int getElement(int index){
	ListNode current = head;
	if(index==0 || index >size) return -1;
	while(current.Next!=null && index != 1){
		current = current.Next;
		index--;
	}
	return current.data;
	
}
public void addRear(int data){
  	 if(head==null){
  		 head= new ListNode(data,null);
  		}

  	 

  	 else{
  	ListNode current = head;
  	 while(current.Next != null){
  		 current = current.Next;
  	 }	 
  	 
   	ListNode newlink = new ListNode(data,null);

  	 current.Next = newlink;
  	
  	
   }
  	 size++;
   }
   
   
 
   
public void addAt(int data, int index){
  	 if (index <1||index >size) return ;
  	 if(head==null ) return;
  	 if (index ==1) {
  		 ListNode newlink = new ListNode(data,head);
  		
  		 head= newlink;
  	 }
  	 if(index == size+1){  
  		 addRear(data);
  	 }
  	 
  	
  	 ListNode current = head;
  	 for(int i=1; i<index-1 && current.Next != null; i++){
  		 current = current.Next;
  	 
  	 }	 
  	 
		   ListNode newlink = new ListNode(data,null);
         
         newlink.Next =current.Next;
         current.Next = newlink;
         current = newlink;
         
size++;
  	 }
  public void size(){
  	System.out.println(size);
  }
 

   
   public void printList(){
	   ListNode current = head;
	   while(current!= null){
		   System.out.print(current.data+ "->");
		   current = current.Next;
	   }
 }
 
 /*  public void arrangearound(int data){
	   lnkd_lst3 aa = new lnkd_lst3();
	   lnkd_lst3 bb= new lnkd_lst3();
	   
	   ListNode current = head;
	   while(current.Next != null){
	   if(current.data >= data){
		  
		 aa.addFront(current.data);
		   
	   }
	   else{
		   bb.addFront(current.data);
	   }
	   
	   }
	   
	   aa.printList();
}	   
   */
   
	public static void main(String[] args) {
	
	LIST  a = new LIST();
		
		a.addFront(12);
		a.addFront(13);
		a.addFront(12);
		a.addFront(12);
		a.addFront(15);
		
}














class ListNode{
	
	int data;
  ListNode Next;

  public ListNode(int data){
  	this.data= data;
  }
  public ListNode(int data, ListNode next){
  	this.data=data;
  	this.Next=next;
  }
  public ListNode(){
  	
  }
  
}
}

