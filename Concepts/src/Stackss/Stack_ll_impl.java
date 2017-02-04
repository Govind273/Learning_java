package Stackss;

public class Stack_ll_impl {

	public static void main(String[] args) {
		Stack_Linkedlst stack = new Stack_Linkedlst();
		
		stack.push(13);
		stack.push(18);
		stack.push(20);
        stack.peek();
        stack.pop();
        stack.peek();
        stack.push(123);
        stack.peek();

		//System.out.println(stack.isEmpty());
	}

}
