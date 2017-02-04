package strings_23_important;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class First_non_repeated_character {

	public static void main(String[] args) {
	String s = "Romania";
	char []c = s.toCharArray();	
    HashMap<Character, Integer> m = new HashMap<Character, Integer>();
    
    
    for(int i=0;i<c.length;i++){
    	if(m.containsKey(c[i])){
    		m.put(c[i], m.get(c[i])+1);
    	}
    	else{
    		m.put(c[i], 1);
    	}
    	
    }
    
    Set se = m.entrySet();
    Iterator itr = se.iterator();
    while(itr.hasNext()){
    	
    	Map.Entry m1 = (Map.Entry)itr.next();
    	if(m1.getValue().equals(1)){
    		System.out.println("This is the fucking winner key "+ m1.getKey());
    		break;
    	}
    }
    
  
   
	
	}
	}


