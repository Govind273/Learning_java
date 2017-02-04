package strings_23_important;

public class Remov_whtspc {
//Remove all white spaces from a String.
	public static void main(String[] args) {
		
		String s = " H E L O ";
		s = s.replaceAll("\\ ",""); // -->\\ in java is used to represent the non-character's that follow like spaces or ",";
		                                   // here it is replcing spaces with nospaces.("O","m") would make it a H E L m..
        System.out.println(s);
	}

}
