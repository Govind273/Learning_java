package strings_23_important;

public class Strings2 {
//Checkif the word is Angram or not
	public static void main(String[] args) {
	
     String p = "MoNsoM";
     p = p.toLowerCase();
     
      int i =0;
      while(i<p.length()/2){
    	 if(p.charAt(i) == p.charAt(p.length()-(1+i))){
    		 i++;
    		 break;
    		 }
	    

    	 else {
	     System.out.println("NO its not an anagram");
    	 break;
    	 }
    	 
     }
	     System.out.println("Yes, the word is an anagram ");

	}

}
