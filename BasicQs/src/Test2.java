
public class Test2 {

	public static void main(String[] args) {
		
		
		 OddOccurance occur = new OddOccurance();
	        int ar[] = new int[]{2,2,2};
	        int n = ar.length;
	        System.out.println(occur.getOddOccurrence(ar, n));
	    }

}
class OddOccurance 
{
public static int getOddOccurrence(int ar[], int ar_size) 
{
    int i;
    int res = 0;
    for (i = 0; i < ar_size; i++) 
    {
        res = res ^ ar[i];
    }
    return res;
}


}
