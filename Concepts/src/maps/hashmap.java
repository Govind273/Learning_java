package maps;

import java.util.HashMap;
import java.*;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;




public class hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String s = "Helloo";
         char [] a = s.toCharArray();
		 HashMap <Character ,Integer > count = new HashMap<Character, Integer>();
		
		 for(int i=0 ; i< a.length ; i++){
			if(count.containsKey(a[i])){
				count.put(a[i],count.get(a[i])+1);
			}
			else{
				count.put(a[i], 1);
			}	
		}
	    Set count_set = count.entrySet();	 
	    Iterator it = count_set.iterator();
	    while(it.hasNext()){
	    	//System.out.println("Values are ------- "+ it.next());// now we have one entry as key value but not keys and values by alone or themselves....
	    	Map.Entry m =(Map.Entry)it.next();
	    	System.out.println(m.getValue());
	    	if(m.getKey().equals(1)){
	    		System.out.println("Haayyyyy");
	    	}
	    }
	 //The reason why we first converted map to string because we cannot iterate over the mao and thus we needed to convert it to strings and then we are converting 
	 //that iterator iterates over string and that string entry is concerted to map entry so we can get the values an   
	    
	 
	    
	    count.put('b',3);
		count.put('c',4);
	  //  System.out.println(count.put('b', 23)); this proves that it replaces the value and the new returnd value is replaces one.....	
		 
		/*count.put('a',11);
		
		count.put('d',5);
		count.put('e',6);

		System.out.println(count.get('a'));
		System.out.println(count.containsKey('s'));
		//Hashmaps don't keep any particular order of keys and values...if we need order have to use LinkedHashMap
		
		Set set = count.entrySet();
		System.out.println("VALUES ARE " + set);

		
		Set<Character> keys = count.keySet();
		System.out.println("keyset of the map : "+keys );
		*/
		
	}

}
