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
    	  if(Top == -1) return true;
    	  else return false;
      }

      public boolean isFull(){
    	  if (Top == size.length-1) return true;
    	  else return false;
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

	    

