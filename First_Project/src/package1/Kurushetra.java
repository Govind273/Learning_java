package package1;

public class Kurushetra {

	
	
	public static void main(String[] args) {
     
	int [] numbers = new int[] {1, 3 ,6,7,9,4,3,2};
	
	int result = cal_sum(numbers);
     System.out.println(result);
	}
	
	
	static int cal_sum(int[] numbers){
	
		int sum=0;
		for(int i = 0; i< numbers.length ; i++){
			sum += numbers[i];
		}
		
		return sum;
	}
		
	
	
	

}

 