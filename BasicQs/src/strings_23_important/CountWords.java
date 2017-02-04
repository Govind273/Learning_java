package strings_23_important;

public class CountWords {
//Java Program to count the number of words.
	public static void main(String[] args){
		
		String word = "Jack and Jill went up the hill";
		int count = 1;
		for (int i =0; i<word.length(); i++){
			if (word.charAt(i) ==' ' ){
				count += 1;
			}
	}
		System.out.println(count);
	}
	
}
/*

}*/