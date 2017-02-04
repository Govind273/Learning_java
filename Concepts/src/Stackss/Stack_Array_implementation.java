package Stackss;

public class Stack_Array_implementation {

	public static void main(String[] args) {
		
		Stacks_Array s = new Stacks_Array(15);
		//System.out.println(s.isEmpty());
	
		s.push(11);
		s.push(13);
		s.push(12);
		s.push(155);
		s.pop();
		
		boolean m= s.isEmpty();
		System.out.println(s.Top);
	int a = s.peek();
	System.out.println(a);
	}

}
