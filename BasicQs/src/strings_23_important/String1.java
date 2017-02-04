package strings_23_important;

//Java Program to print duplicate characters from String
public class String1 {

	public static void main(String[] args) {
		
    String h = "helloO";
    h = h.toLowerCase();
    for(int i=0 ; i< h.length(); i++){
        for(int j=i+1; j<h.length() ; j++){
        	
        	if(h.charAt(i)==h.charAt(j)){
        		System.out.print(h.charAt(i)+ " ");
        	}
        }
    }
		
		
	}

}
