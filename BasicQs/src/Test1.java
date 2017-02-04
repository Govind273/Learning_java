
public class Test1 {
 
	public static int sustring(String a , String b)
	{
		int index =0;
		if(a.length()== 0 || b.length()==0)
        {
            return index;
        }
		int a_l = a.length();
		int b_l = b.length();
		
		for(int i =0 ; i <= a_l - b_l; i++)
		{
				String s= a.substring(i, i+b_l);
				System.out.println(s);
				
				if(b.equals(s)){
					return i;
				}
		}
		
		return index;
	}
	
	 public static void main(String[] args) {
   
	String a = "Monday";
	String b = "da";
	
	int index = sustring(a,b);
    System.out.println(index);
		
	}
}