package easy1;

public class Reverse_a_number {

	public static void main(String[] args) {
	  
		System.out.println(reverse(1134236699));

	}	
		
	 public static int reverse(int x) {
	     
	     int reverse=0;
	     
	     if(x>Integer.MAX_VALUE || x < Integer.MIN_VALUE ){
	         return 0;
	     }
	     System.out.println("dd");
	    char[] a =String.valueOf(1234).toCharArray();
	     if(a.length ==10 && a[10]>2){
	     System.out.println("dddddddddddddddddddddddddd");
	   	 return 0;

	     }
		


	     
	     int n = Math.abs(x);
	     
	     while(n!=0){
	         if(n>0 && n%10 == 0 ) reverse *=10;
	         
	         else {reverse = reverse*10 + n% 10;}	         
	        n= n/10;
	     }
	     if(reverse>Integer.MAX_VALUE || reverse < Integer.MIN_VALUE ){
	         x = 0;
	     }
	     if(x<0) reverse *= -1;

	     return reverse;
	       
	    }
	    
            
        

}
