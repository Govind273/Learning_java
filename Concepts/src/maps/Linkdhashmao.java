package maps;

import java.util.HashMap;
import java.util.Set;
import java.util.*;

public class Hashmap {

	public static void main(String[] args) {
		HashMap<Character ,Integer  > count = new HashMap<Character, Integer>();
        HashMap hashmap = new HashMap();
        
		String s ="Hheello";
		char [] arr = s.toCharArray();
		for (int i=0; i<arr.length; i++){
			if(hashmap.containsKey(arr[i])){
				hashmap.put(arr[i], hashmap.get(arr[i] +1));
			}
			else {
				hashmap.put(arr[i], 1);
			}
		}
		
		Set mapset = hashmap.keySet();
		Itterator itr = new Iterator();
		while(itr.hasnext()){
			
		}
		

	}

}
 