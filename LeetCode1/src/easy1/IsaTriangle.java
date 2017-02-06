package easy1;

import java.util.Scanner;

public class IsaTriangle {

	public static void main(String[] args) {
       System.out.println("Enter the three sides of triangle");
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int a = sc.nextInt();
       int b = sc.nextInt();
       int c = sc.nextInt();
       
       
       String triangleType = Tringle(a,b,c);
       System.out.println(triangleType);
       
       
	}

	public static String Tringle(int a , int b , int c)
	{
		if((a+b>c) &&(b+c >a )&&(c+a>b))
		{
			if((a == b)&& (b==c))
			{
				return "Equilateral";
			}
			if((a==b)||(b==c) ||(c==a))
			{
				return "Isocles";
			}
	
		   else return "scalen";
		}
		return "Nothing like a Triangle";
	}

}
