package array_questions;

public class FORLLOP {

	public static void main(String[] args) {
		int [] age = new int[]{1,2,3,5,6,7,8};
		
	for (int i=1 ; i< age.length ; i++){
		if(age[i] > age[i-1]) {
			
			System.out.println("hey world " +age[i]);
			break;
		}
	}
	
	}

	

}
