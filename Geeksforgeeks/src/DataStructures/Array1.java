package DataStructures;

public class Array1 {

	public static void main(String[] args) {
		int[] values = new int[]{2,4,6,3,7,9,13,5,6,4};
		int[] valuercvd = sumvalue(values);
		for(int s : valuercvd){
			System.out.print(s+" ");
		}
		
			}



public static int[] sumvalue(int[] nums){

	

	int num=16, i=0, j=0;
	int[] sums = nums;
	int[] sum = new int[2];
	for (i=0;i<sums.length;i++){
		for (j=i+1;j<sums.length;j++){
			
			if(sums[i]+sums[j]==num){
				
				
		       return new int[] {i,j};
			}
		
		}

	}
return new int[] {i,j};
	

	
	
	
	
	
	
}
}