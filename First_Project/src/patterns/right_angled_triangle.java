package patterns;

import java.util.Scanner;

public class right_angled_triangle {

	public static void main(String[] args) {
		
		
	System.out.println("Enter the length of triangle : ");	
	//Scanner sc = new Scanner(System.in);
	//int length = sc.nextInt();
	int length = 5;
	
	//for simple left to right triangle patterns :
	for(int j=1; j<=length; j++){
	
		for(int i=1; i<= j ; i++){
	System.out.print("#");
	}
	System.out.print("\n");
	}
/*	
#
##
###
####
#####
	*/
	

	for(int j=1; j<=length; j++){
		
	for(int i=length; i>=j ; i--){
	System.out.print("#");
	}
	System.out.print("\n");
	}
	/*
#####
####
###
##
#
	 */
	
	// printing the right_angled_triangle from right to left this is possible with this code
	System.out.println("                                        ");
	
	for(int i=1; i<=length; i++){
		
    for(int j= length; j>=1 ; j--){
    	
    if(j>i){ System.out.print(" ");}
    else {System.out.print("#");}
	}
	System.out.print("\n");
	}
	
	  /*  #
	   ##
	  ###
	 ####
	#####
	*/
	
	for(int i=1; i<=length; i++){
		for(int j=1 ; j<= length ; j++){
			
			if(j>=i){
				System.out.print("#");
			}
			else{
				System.out.print(" ");

			}
			
		}
		System.out.print("\n");

	}
	
	/*diagraam --------------- #####
                                ####
                                 ###
                                  ##
                                   #
	*/
	
	
}	
}
