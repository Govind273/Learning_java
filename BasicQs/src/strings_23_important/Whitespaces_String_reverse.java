package strings_23_important;

public class Whitespaces_String_reverse {
//Reverse a String with preserving white spaces .
	public static void main(String[] args) {
	revrse("Rohit Mishra");
	}
	
	
	static void revrse(String name){
		
		name= name.toLowerCase();
		char[]  reverse = new char[name.length()];
		char[] c = name.toCharArray();
		for(int i=0; i<c.length; i++){
			if(c[i]==' '){
			   reverse[i] = c[i];
			}
		}
		int l = 0;//Ki it is not always required that you must run for loops in continutaion...here i copied value of one string to anoyther 
		//using only one for loop...
		//
		for(int j=c.length-1; j>=0; j--){
			
			if(c[j]!=' '){
				
				if(reverse[l] == ' '){
					l++;
					}
		          reverse[l]= c[j];
		          l++;
			}
		}
		System.out.println(String.valueOf(reverse));
	}
}
//TIP... refresh ur thought ..don't look at the problem at focal point ....