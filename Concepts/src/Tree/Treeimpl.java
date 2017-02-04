package Tree;

public class Treeimpl {
	Node root;


	
	
	public boolean isNull(){
		return(root == null);
	}
	
public void insert(int value)
{
	Node newnode = new Node(value);
	if(root == null)
	{
		root = newnode;
		return;
	}
	Node current = root;
	Node parent = null;
	while(true)
	{
		parent = current;
		if(value < current.data)
		{
			current = current.left;
			if(current == null)
			{
				parent.left = newnode;
				return;
			}
		}else
		{
			current = current.right;
			if(current == null)
			{
				parent.right = newnode;
				return;
			}
		}
	}
}
	
//To display the values accordingly.
public void display(Node root){
	if(root!=null){
		display(root.right);
		System.out.print(" " + root.data);
		display(root.left);
	}
}

//count the number of nodes.
public int countnodes(Node root){
	int count=0;
	if(root == null)
	{
		return 0;
	}

	Node curr = root;
	
	countnodes(curr.left);
	count ++;
	countnodes(curr.right);
	
	return count;

	
}
//To get an particular 

public boolean find(int value){
	Node current = root;
	Node parent = null;
/*	if(current == null)
	{
		System.out.println("No roots in the tree");
		return false;
	}
	*/
	while(current!= null)
		
	{
		parent = current;
		
		if(current.data == value)
		{
			System.out.println(" ");
			System.out.println(current.data);
			return true;
		}
		else if(value< current.data)
		{
			current = current.left;
			
		}
		else{
			current = current.right;
		}
		
	}
	return false;
	
}
public boolean deleteNode(int key)
{
	Node parent = null;
	Node focus = root;
	
	boolean isaftChild = true;
	
	while(key!= focus.data)
	{
		parent = focus;
		
		if(key<focus.data)
		{
			isaftChild= true;
			focus = focus.left;
		}
		else
		{
			isaftChild = false;
			focus= focus.right;
		}
		
	if	(focus== null)
	{
		return false;
	}
	}//while ends here
	
    if(focus.left==null && focus.right == null)
    {
    	if(focus == root)
    	{
    		root = null;
        }
    	else if(isaftChild)
    	{
    		parent.left = null;
    	}
    	else
    	{
    		parent.right = null;
    	}
    }
    	else if(focus.right== null)
    	{
    		if(focus == root)
    		{
    			root = focus.left;
    		}
    		else if(isaftChild)
    		{
    			parent.left = focus.left;
    		}
    		else
    		{
    			parent.right = focus.left;
    		}
    	}
    
    	else if(focus.left == null)
    		
    	{
    		if(focus == root)
    		{
    			root = focus.right;
    		}
    		else if(isaftChild)
    		{
    			parent.left = focus.right;
    		}
    		else {
    			parent.right = focus.right;
    		}
    	}
   return true;    


}

    
    
   
    

	


}//ends the class tree
      



	
	
	








//Node Structure for the Tree 
class Node{
	Node left ;
    Node right;
     int data;
     
 
     Node(int data)
     {
    	 this.data = data;
     }
     Node(){
    	 
     }
     
     
}