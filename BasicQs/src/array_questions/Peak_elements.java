package array_questions;

public class Peak_elements {

//Peak element in an array is the number which is greater than both it's neighbour
	public static void main(String[] args) {
	

        int[] arr = new int[] {1,3,33,40,377,6};
		int peak_value = peak(arr);
		System.out.println(peak_value);
		
	}

	public static int peak(int[] arr){ 
	  
	/*These code give the solution in the O(n) as one for looop is run ..but for selecting a value do we need O(n) solution. we can use selection sorting..
	 * int max= arr[0];
	 
		
		for(int i=1; i<=arr.length-1; i++){
			
			if((arr[i]> arr[i-1])&& (arr[i]> arr[i+1]) && (arr[i] > max)){
				max = arr[i];
				
			}
		}
		
		if((arr[arr.length-1]> arr[arr.length-2]) && (arr[arr.length-1]>max)) {
			max = arr[arr.length-1];
		}
		return max;
	*/	
		
	/*
	 *My code ..problem was for loop.... 
	 *	for (int i=0 ; i<=arr.length-1 ; i++){
			if(arr[0] >arr[1]) {
				return arr[0];
			}
			else if(arr[arr.length - 1]>arr[arr.length - 2] ){
				return arr[arr.length - 1];
				
			}
			else if((arr[i+1] > arr[i]) && (arr[i+1] >arr[i+2])){
				return arr[i+1];
			}
			continue;
		}
		 
		return arr[3];
		

		
		*/
		
	}
}
