package maps;

import java.util.*;
import java.util.Map.Entry;

public class treeMap {

	public static void main(String[] args) {
		TreeMap<Character ,Integer  > count = new TreeMap<Character, Integer>();

		
		count.put('a',11);
		count.put('b',3);
		count.put('c',4);
		count.put('d',5);
		count.put('e',6);

		/*for (Character c : count.keySet()){
			System.out.println(c+ ":" +count.get(c));
		}
		System.out.println(count.get('a'));
		System.out.println(count.containsKey('s'));
		//Hashmaps don't keep any particular order of keys and values...if we need order have to use LinkedHashMap
		
		Set set = count.entrySet();
		System.out.println("VALUES ARE " + set);

		
		Set<Character> keys = count.keySet();
		System.out.println("keyset of the map : "+keys );
		*/
		
		Set<Map.Entry<Character, Integer>> entrySet = count.entrySet();
	    Iterator<Entry<Character, Integer>> i = entrySet.iterator();
	    while(i.hasNext()){
	        Entry<Character, Integer> element = i.next();
	        System.out.println("Key: "+element.getKey()+" ,value: "+element.getValue());
	    }
		

	}

}
 