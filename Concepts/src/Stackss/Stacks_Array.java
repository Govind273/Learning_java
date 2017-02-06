package Stackss;

public class Stacks_Array {

	  public  int Top;
	   public  int[] size;
	    
	   /*public int Top_value;*/
	    
	    public Stacks_Array(int capacity){
	        size = new int[capacity];
	    	Top = -1;
	    	}
	    
      public void push( int data){
		
			
            Top++;
		    size[Top] = data;
		}
      public boolean isEmpty(){
    	// return (size.length == 0); this will not work even if the size is 10 and lsit is empty;
    	  return (Top == -1);
      }

      public boolean isFull(){
    	  return (Top == size.length-1) ;
    	  
      }
      public void pop(){
    	  if(!isEmpty()){
    		  Top--;
    	  }
      }
      public int peek(){
    	  return size[Top];
      }
}

	    

