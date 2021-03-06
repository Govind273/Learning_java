package Linkd_List;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class LIST {

	  ListNode head ; // GLOBAL VARIABLE so can be accessed in any method
	     int size=0;

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
	     
	/*public void removeDuplicates(LIST a)
	{
		ListNode current = a.head;
		ListNode focus = current;
		
		
		
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		while(current != null)
		{
			if(map.containsKey(current.data))
			{
				map.put(current.data, map.get(current.data)+1);
			}
			else
			{
				map.put(current.data, 1);
			}
			current = current.Next;
		}
	
		System.out.println(map.size());
		
		
		Set b  = map.entrySet();
		Iterator itr = b.iterator();
		
		while(itr.hasNext())
		{
			Map.Entry<Integer, Integer> new_map= (Map.Entry<Integer, Integer>)itr.next();
			if((new_map).getValue() > 1)
			{
				new_map.setValue(1);
			}
		}
		
	
	}
	*/
	//Deletes the front element of the list,
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
//It takes into one of the element of LinkedList and gives its index.....
	public int search(int data){
		int i = 1;
		ListNode current = head;
	   	while(current!= null){
			if(current.data == data){
				return i;
				
			}
			else{
				i++;
				current = current.Next;
			
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
		  	System.out.println("Size"+size);
	    	 if (index <1||index >size) return ;
	    	 if(head==null) return;
	    	 if (index ==1) {
	    		 ListNode newlink = new ListNode(data);
	    		 newlink.Next = head;
	    		 head= newlink;
	    	 }
	    	 if(index == size+1){
	    		 addRear(data);
	    	 }
	    	 
	    	
	    	 ListNode current = head;
	    	 for(int i=1; i<index-1 && current.Next != null; i++){
	    		 current = current.Next;
	    	 
	    	 }	 
	    	 
			   /*ListNode newlink = new ListNode(data,null);
	           
	           newlink.Next =current.Next;
	           current.Next = newlink;
	           current = newlink;
	           */
	size++;
	    	 }
	    public int size(){
	    	return size;
	    }
	   

	     
	     public void printList(){
		   ListNode current = head;
		   while(current!= null){
			   System.out.print(current.data+" > ");
			  
			   current = current.Next;
		   }
		   System.out.print("NULL");
	     }  
	     public void printList1(ListNode x){
			   ListNode current = x;
			   while(current!= null){
				   System.out.print(current.data + " > ");
				   
				   current = current.Next;
			   }
			   System.out.print("NULL");
	     }
	     
	   // A question that might be asked or something
	   public ListNode reverselist(){
		   ListNode current = head;
		   ListNode next = null;
		   ListNode previous = null;
		   
		   
		   while(current!= null){
			   next = current.Next;
			   current.Next = previous;
			   previous = current;
			   current = next; 
		  }
	      
		 return  previous;
		 
		   
	   }
//delete a Node when you have access to only that particular node only
	   //This only takes a head node so we have to write a.head.Next.Next...
   public boolean deleteParticularNode(ListNode n){
	   
	   	  
	   if(n == null || n.Next == null) return false;
	   
	   ListNode next = n.Next;
	   n.data  =  next.data;
	   n.Next = next.Next;
	   return true;	   
   }

 //Delete duplicates in a linked list using a hashset IN One pass....and in 0(n) but extra space is used here.
   
   public void removeduplicates(ListNode head)
   {

	   ListNode current = head;
	   ListNode new1 = current;
	  
	   ListNode previous = null;
	   HashSet <Integer> set = new HashSet<Integer>();
	   
	   while(current != null)
	   {
		   if(set.contains(current.data))
		   {
			   previous.Next = current.Next;
		   }
		   
		   else
		   {
			   set.add(current.data);
		   
		   previous =current;
	      }
		   current = current.Next;
	   }
	   
	  
	   recievenodeandprint(new1);
   }
   
   public void recievenodeandprint(ListNode node){
	   while(node != null)
	   {
		   System.out.print(node.data+" ");
		   node = node.Next;
	   }
	  
   }
   
   // Deleting the nodes but now we sould not use extra space.
   
   
   public void deletenodenospace(ListNode root)
   {
	   ListNode head = root;
	   ListNode nee = root;
	   
	   
	   while(head != null)
	   {
		  
		   ListNode curr = head;
		   
		   
		   
		   while(curr.Next != null)
		   {
			   if(curr.Next.data==head.data)
			   {
				   curr.Next = curr.Next.Next;
			   }
			   else
			   {
				 
			       curr = curr.Next;
			      
			   }
	
		   }
		   head = head.Next;
	   }
	   recievenodeandprint(nee);
   }
   
   
   // Q2) This method prints the the Kth from last in a  LinkedList: when size is known 
   
   public int KthFromLast(ListNode head, int k)
   {
	  ListNode root = head;
	  ListNode curr = root;
	  int count = 1;
	  
	  if(k== size) return head.data;
	  while(count <size-k)
	  {
		  count++;
		  curr = curr.Next;
	  }
	  int value = curr.Next.data;
	  return value;
   }
   
   //Kth from the last when the size is unkown of the lit: using the runnwer approach
   
   
  /* public int kthtoLast(ListNode a , int k)
   {
	   ListNode curr1 = a;
	   ListNode curr2 = curr1.Next;
	   int count =0;
	   while(count < k)
	   {
		   if(curr2.Next == null)
		   {
			   curr2 = head;
		   }
		   curr2 = curr2.Next;
		   count++;
	   }
	   
	   System.out.println(curr2.data);
	   
	   while(curr2 != null)
	   {
		   curr1 = curr1.Next;
		   curr2 = curr2.Next;
	   }
	   
	   int value = curr1.Next.data;
	   return value;
   }
   
   But here we cannot use wheb k is choosen to be close to the head.
   
   */
   
   //To partition a list around a particular digit;
   
   public void seperatedList(LIST a , int digit)
   {
	   if(a.search(digit)==0 ) return ;
	   ListNode curr = new ListNode(0);
	   ListNode x = curr;
	   ListNode head1 = a.head;
	  
	   while(head1 != null) 
	   {
		   if(head1.data <= digit)
		   {
			   head1 = head1.Next;
		   }
		   else
		   {
			  curr.Next = head1;
			  head1 = head1.Next.Next;			 
		   }
	
	   }
	   
	   recievenodeandprint(curr);
   }
   
   
   
   
   
   
   //This will take the list and looks for element in the list and if present removes it from the list.
   public boolean deleteNodeatIndex(LIST x, int element){
	   
	   int index= x.search(element);
	   if(index<1 ) return false;
	   int i=1;
	   ListNode current = x.head;
	   while(current != null){
		   if(i == index ){
			   break;
		   }
		   else{
		       i++;
			   current = current.Next;
		   }
	 }
	   
	  ListNode nn = current;
	  ListNode next = nn.Next;
	  nn.data = next.data;
	  nn.Next = next.Next;
	  return true;
   }

   //This method seperates the two list around a value into smaller and larger 
   
   public void seperatearound(LIST a, int data){
	 
	  
	   LIST aa = new LIST();
	   LIST bb = new LIST();
	   
	   ListNode current = a.head;
	   while(current != null){
		   if(current.data < data){
			   aa.addRear(current.data);
			  
		   }
		   
		   else{
			   bb.addRear(current.data);
			

		   }
		   current = current.Next;
	   }
	   bb.printList();
	   
	   System.out.println(" -- ");
	   aa.printList();   
   }
//creating a pallindrome.....
public String ispallindrome(LIST a1){
//	if (a1.head ==null ) return;
	LIST a = a1;
	LIST b = new LIST();
	ListNode current = a.head;
	
	
	while(current != null){
		b.addFront(current.data);
		current = current.Next;
		}
	

	
	ListNode a_current = a.head;
	ListNode b_current = b.head;
	while(a_current != null && b_current != null){
	
		
	if(a_current.data != b_current.data){
		return  "String is not pallindrome";		
	}
     a_current =a_current.Next;
     b_current = b_current.Next;
	}
	return  "This is  a pallindrome";

}
public void intrsction(LIST aa, LIST bb){
  ListNode a = aa.head;
  ListNode b =bb.head;
    while(a != null || b !=null){
    	
    	if(a.data == b.data){
    		System.out.println( a.data);
    		break;
    	}
    	else{
    		a= a.Next;
    	    b = b.Next;
    	}
    }

}


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
