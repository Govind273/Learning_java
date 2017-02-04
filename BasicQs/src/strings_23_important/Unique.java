package strings_23_important;

import java.util.Comparator;

public class Unique {

	public static void main(String[] args) {
		
		
		
		String s= "34";
		String g ="31";
		
		int p = isUnique(s,g);
		System.out.println(p);
		

	}

	public static int isUnique(String a, String b){
		return (a.compare(b)); 
	}
}

abstract class MyComparator implements Comparator
{
 
	

}