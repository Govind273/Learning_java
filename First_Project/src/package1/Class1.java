package package1;



public class Class1 {

	
	
	static int  val(){
		int a = 134;
		try{
		return  a/0;
		}
		catch(Exception e){
			System.out.println("papa");
			return a;
		}
		finally {
			System.out.println("m name is babu"); 
			a= 12;
		return a ;
		}
	}


	public static void main(String[] args)  {
		
	int i = 2;
	int j=3;
	int k = 10;
	
	
	
	   
		System.out.println(val());

	

	
	
	
	
	

}

}
