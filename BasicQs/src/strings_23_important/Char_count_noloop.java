package strings_23_important;

// To count the number of character in word 
public class Char_count_noloop {

	public static void main(String[] args) {
	
	// with loops we can do this wa
	    
		String word ="Hello";
		int count;
		int value;
        for(int i=65; i<91; i++){
        	count =0;
        	for(int j=0;j<word.length();j++){
        		
        		value = (int)word.charAt(j);
        		
        		if(value == i){
        			count++; 
        		}
        		

        	}
        	
        	if(count>0){
            	System.out.println("key pair values are: "+ (char)i+ " ---  "+count);

        	}
        	

        }
		
	
    
		
	}

}
