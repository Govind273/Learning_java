package Listss;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class List1 {

	public static void main(String[] args) {
	
		List<Integer> lst = new LinkedList<Integer>();
		lst.add(3);
		lst.add(4);
		lst.add(5);
		lst.add(6);
		lst.add(6);
		lst.add(8);
		lst.add(13);
		lst.add(31);
		
		System.out.println(lst);
		
		Iterator<Integer> itr = lst.iterator();
		while(itr.hasNext()){
			if(itr.next()<){
				
			}
		}



	}

}
